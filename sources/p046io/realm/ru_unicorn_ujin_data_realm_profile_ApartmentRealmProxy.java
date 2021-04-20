package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.ApartmentRequest;
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
import p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy extends Apartment implements RealmObjectProxy, ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ApartmentColumnInfo columnInfo;
    private ProxyState<Apartment> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Apartment";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy$ApartmentColumnInfo */
    static final class ApartmentColumnInfo extends ColumnInfo {
        long acceptingEnabledIndex;
        long apartmentRequestIndex;
        long buildingIdIndex;
        long complexIdIndex;
        long idIndex;
        long isCommerceThingsAvailableIndex;
        long maxColumnIndexValue;
        long rentAvailableIndex;
        long showBottomNavigationIndex;
        long stageIndex;
        long titleIndex;
        long uidIndex;
        long userTokenIndex;

        ApartmentColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.userTokenIndex = addColumnDetails("userToken", "userToken", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.uidIndex = addColumnDetails("uid", "uid", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.complexIdIndex = addColumnDetails("complexId", "complexId", objectSchemaInfo);
            this.buildingIdIndex = addColumnDetails("buildingId", "buildingId", objectSchemaInfo);
            this.stageIndex = addColumnDetails("stage", "stage", objectSchemaInfo);
            this.acceptingEnabledIndex = addColumnDetails("acceptingEnabled", "acceptingEnabled", objectSchemaInfo);
            this.showBottomNavigationIndex = addColumnDetails("showBottomNavigation", "showBottomNavigation", objectSchemaInfo);
            this.apartmentRequestIndex = addColumnDetails("apartmentRequest", "apartmentRequest", objectSchemaInfo);
            this.rentAvailableIndex = addColumnDetails("rentAvailable", "rentAvailable", objectSchemaInfo);
            this.isCommerceThingsAvailableIndex = addColumnDetails("isCommerceThingsAvailable", "isCommerceThingsAvailable", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ApartmentColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ApartmentColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ApartmentColumnInfo apartmentColumnInfo = (ApartmentColumnInfo) columnInfo;
            ApartmentColumnInfo apartmentColumnInfo2 = (ApartmentColumnInfo) columnInfo2;
            apartmentColumnInfo2.userTokenIndex = apartmentColumnInfo.userTokenIndex;
            apartmentColumnInfo2.idIndex = apartmentColumnInfo.idIndex;
            apartmentColumnInfo2.uidIndex = apartmentColumnInfo.uidIndex;
            apartmentColumnInfo2.titleIndex = apartmentColumnInfo.titleIndex;
            apartmentColumnInfo2.complexIdIndex = apartmentColumnInfo.complexIdIndex;
            apartmentColumnInfo2.buildingIdIndex = apartmentColumnInfo.buildingIdIndex;
            apartmentColumnInfo2.stageIndex = apartmentColumnInfo.stageIndex;
            apartmentColumnInfo2.acceptingEnabledIndex = apartmentColumnInfo.acceptingEnabledIndex;
            apartmentColumnInfo2.showBottomNavigationIndex = apartmentColumnInfo.showBottomNavigationIndex;
            apartmentColumnInfo2.apartmentRequestIndex = apartmentColumnInfo.apartmentRequestIndex;
            apartmentColumnInfo2.rentAvailableIndex = apartmentColumnInfo.rentAvailableIndex;
            apartmentColumnInfo2.isCommerceThingsAvailableIndex = apartmentColumnInfo.isCommerceThingsAvailableIndex;
            apartmentColumnInfo2.maxColumnIndexValue = apartmentColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ApartmentColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$userToken() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.userTokenIndex);
    }

    public void realmSet$userToken(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'userToken' cannot be changed after object was created.");
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
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$uid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.uidIndex);
    }

    public void realmSet$uid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.uidIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.uidIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.uidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.uidIndex, row$realm.getIndex(), str, true);
            }
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

    public String realmGet$complexId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.complexIdIndex);
    }

    public void realmSet$complexId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.complexIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.complexIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.complexIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.complexIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$buildingId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.buildingIdIndex);
    }

    public void realmSet$buildingId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.buildingIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.buildingIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.buildingIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.buildingIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$stage() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.stageIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.stageIndex));
    }

    public void realmSet$stage(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stageIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.stageIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.stageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.stageIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$acceptingEnabled() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.acceptingEnabledIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.acceptingEnabledIndex));
    }

    public void realmSet$acceptingEnabled(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.acceptingEnabledIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.acceptingEnabledIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.acceptingEnabledIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.acceptingEnabledIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Boolean realmGet$showBottomNavigation() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.showBottomNavigationIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.showBottomNavigationIndex));
    }

    public void realmSet$showBottomNavigation(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.showBottomNavigationIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.showBottomNavigationIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.showBottomNavigationIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.showBottomNavigationIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public ApartmentRequest realmGet$apartmentRequest() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.apartmentRequestIndex)) {
            return null;
        }
        return (ApartmentRequest) this.proxyState.getRealm$realm().get(ApartmentRequest.class, this.proxyState.getRow$realm().getLink(this.columnInfo.apartmentRequestIndex), false, Collections.emptyList());
    }

    public void realmSet$apartmentRequest(ApartmentRequest apartmentRequest) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (apartmentRequest == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.apartmentRequestIndex);
                return;
            }
            this.proxyState.checkValidObject(apartmentRequest);
            this.proxyState.getRow$realm().setLink(this.columnInfo.apartmentRequestIndex, ((RealmObjectProxy) apartmentRequest).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("apartmentRequest")) {
            if (apartmentRequest != null && !RealmObject.isManaged(apartmentRequest)) {
                apartmentRequest = (ApartmentRequest) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(apartmentRequest, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (apartmentRequest == null) {
                row$realm.nullifyLink(this.columnInfo.apartmentRequestIndex);
                return;
            }
            this.proxyState.checkValidObject(apartmentRequest);
            row$realm.getTable().setLink(this.columnInfo.apartmentRequestIndex, row$realm.getIndex(), ((RealmObjectProxy) apartmentRequest).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Boolean realmGet$rentAvailable() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.rentAvailableIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.rentAvailableIndex));
    }

    public void realmSet$rentAvailable(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rentAvailableIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.rentAvailableIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.rentAvailableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.rentAvailableIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Boolean realmGet$isCommerceThingsAvailable() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isCommerceThingsAvailableIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isCommerceThingsAvailableIndex));
    }

    public void realmSet$isCommerceThingsAvailable(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isCommerceThingsAvailableIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isCommerceThingsAvailableIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isCommerceThingsAvailableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isCommerceThingsAvailableIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 12, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("userToken", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("uid", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("complexId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("buildingId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("stage", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("acceptingEnabled", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("showBottomNavigation", RealmFieldType.BOOLEAN, false, false, false);
        builder.addPersistedLinkProperty("apartmentRequest", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("rentAvailable", RealmFieldType.BOOLEAN, false, false, false);
        builder3.addPersistedProperty("isCommerceThingsAvailable", RealmFieldType.BOOLEAN, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ApartmentColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ApartmentColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.Apartment createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "userToken"
            r12 = 0
            if (r8 == 0) goto L_0x006c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r1 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r3 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy$ApartmentColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ApartmentColumnInfo) r2
            long r2 = r2.userTokenIndex
            boolean r4 = r15.isNull(r11)
            if (r4 == 0) goto L_0x002f
            long r2 = r1.findFirstNull(r2)
            goto L_0x0037
        L_0x002f:
            java.lang.String r4 = r15.getString(r11)
            long r2 = r1.findFirstString(r2, r4)
        L_0x0037:
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006c
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0067 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0067 }
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r2 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0067 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0067 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0067 }
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            r13.clear()
            goto L_0x006d
        L_0x0067:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006c:
            r1 = r12
        L_0x006d:
            java.lang.String r2 = "apartmentRequest"
            if (r1 != 0) goto L_0x00a4
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x007a
            r9.add(r2)
        L_0x007a:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009c
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008f
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r1 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy) r1
            goto L_0x00a4
        L_0x008f:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r1 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy) r1
            goto L_0x00a4
        L_0x009c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'userToken'."
            r0.<init>(r1)
            throw r0
        L_0x00a4:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface r3 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface) r3
            java.lang.String r4 = "id"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00c4
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b9
            r3.realmSet$id(r12)
            goto L_0x00c4
        L_0x00b9:
            int r4 = r15.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.realmSet$id(r4)
        L_0x00c4:
            java.lang.String r4 = "uid"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00de
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00d7
            r3.realmSet$uid(r12)
            goto L_0x00de
        L_0x00d7:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$uid(r4)
        L_0x00de:
            java.lang.String r4 = "title"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00f7
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00f0
            r3.realmSet$title(r12)
            goto L_0x00f7
        L_0x00f0:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$title(r4)
        L_0x00f7:
            java.lang.String r4 = "complexId"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0110
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0109
            r3.realmSet$complexId(r12)
            goto L_0x0110
        L_0x0109:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$complexId(r4)
        L_0x0110:
            java.lang.String r4 = "buildingId"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0129
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0122
            r3.realmSet$buildingId(r12)
            goto L_0x0129
        L_0x0122:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$buildingId(r4)
        L_0x0129:
            java.lang.String r4 = "stage"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0146
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x013b
            r3.realmSet$stage(r12)
            goto L_0x0146
        L_0x013b:
            int r4 = r15.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.realmSet$stage(r4)
        L_0x0146:
            java.lang.String r4 = "acceptingEnabled"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0163
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0158
            r3.realmSet$acceptingEnabled(r12)
            goto L_0x0163
        L_0x0158:
            int r4 = r15.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.realmSet$acceptingEnabled(r4)
        L_0x0163:
            java.lang.String r4 = "showBottomNavigation"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0180
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0175
            r3.realmSet$showBottomNavigation(r12)
            goto L_0x0180
        L_0x0175:
            boolean r4 = r15.getBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.realmSet$showBottomNavigation(r4)
        L_0x0180:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x019b
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x0190
            r3.realmSet$apartmentRequest(r12)
            goto L_0x019b
        L_0x0190:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r0 = p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$apartmentRequest(r0)
        L_0x019b:
            java.lang.String r0 = "rentAvailable"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x01b8
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x01ad
            r3.realmSet$rentAvailable(r12)
            goto L_0x01b8
        L_0x01ad:
            boolean r0 = r15.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.realmSet$rentAvailable(r0)
        L_0x01b8:
            java.lang.String r0 = "isCommerceThingsAvailable"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x01d5
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x01ca
            r3.realmSet$isCommerceThingsAvailable(r12)
            goto L_0x01d5
        L_0x01ca:
            boolean r0 = r15.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.realmSet$isCommerceThingsAvailable(r0)
        L_0x01d5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.profile.Apartment");
    }

    public static Apartment createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Apartment apartment = new Apartment();
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface = apartment;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("userToken")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$userToken(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$userToken((String) null);
                }
                z = true;
            } else if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$id((Integer) null);
                }
            } else if (nextName.equals("uid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$uid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$uid((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("complexId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$complexId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$complexId((String) null);
                }
            } else if (nextName.equals("buildingId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$buildingId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$buildingId((String) null);
                }
            } else if (nextName.equals("stage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$stage(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$stage((Integer) null);
                }
            } else if (nextName.equals("acceptingEnabled")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$acceptingEnabled(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$acceptingEnabled((Integer) null);
                }
            } else if (nextName.equals("showBottomNavigation")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$showBottomNavigation(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$showBottomNavigation((Boolean) null);
                }
            } else if (nextName.equals("apartmentRequest")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$apartmentRequest((ApartmentRequest) null);
                } else {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$apartmentRequest(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("rentAvailable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$rentAvailable(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$rentAvailable((Boolean) null);
                }
            } else if (!nextName.equals("isCommerceThingsAvailable")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$isCommerceThingsAvailable(Boolean.valueOf(jsonReader.nextBoolean()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$isCommerceThingsAvailable((Boolean) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Apartment) realm.copyToRealm(apartment, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'userToken'.");
    }

    private static ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy ru_unicorn_ujin_data_realm_profile_apartmentrealmproxy = new ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_apartmentrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.Apartment copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ApartmentColumnInfo r9, p035ru.unicorn.ujin.data.realm.profile.Apartment r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.profile.Apartment r1 = (p035ru.unicorn.ujin.data.realm.profile.Apartment) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.Apartment> r2 = p035ru.unicorn.ujin.data.realm.profile.Apartment.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.userTokenIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface) r5
            java.lang.String r5 = r5.realmGet$userToken()
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
            io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.profile.Apartment r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.profile.Apartment r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy$ApartmentColumnInfo, ru.unicorn.ujin.data.realm.profile.Apartment, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.profile.Apartment");
    }

    public static Apartment copy(Realm realm, ApartmentColumnInfo apartmentColumnInfo, Apartment apartment, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(apartment);
        if (realmObjectProxy != null) {
            return (Apartment) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface = apartment;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Apartment.class), apartmentColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(apartmentColumnInfo.userTokenIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$userToken());
        osObjectBuilder.addInteger(apartmentColumnInfo.idIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(apartmentColumnInfo.uidIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$uid());
        osObjectBuilder.addString(apartmentColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(apartmentColumnInfo.complexIdIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$complexId());
        osObjectBuilder.addString(apartmentColumnInfo.buildingIdIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$buildingId());
        osObjectBuilder.addInteger(apartmentColumnInfo.stageIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$stage());
        osObjectBuilder.addInteger(apartmentColumnInfo.acceptingEnabledIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$acceptingEnabled());
        osObjectBuilder.addBoolean(apartmentColumnInfo.showBottomNavigationIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$showBottomNavigation());
        osObjectBuilder.addBoolean(apartmentColumnInfo.rentAvailableIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$rentAvailable());
        osObjectBuilder.addBoolean(apartmentColumnInfo.isCommerceThingsAvailableIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$isCommerceThingsAvailable());
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(apartment, newProxyInstance);
        ApartmentRequest realmGet$apartmentRequest = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$apartmentRequest();
        if (realmGet$apartmentRequest == null) {
            newProxyInstance.realmSet$apartmentRequest((ApartmentRequest) null);
        } else {
            ApartmentRequest apartmentRequest = (ApartmentRequest) map.get(realmGet$apartmentRequest);
            if (apartmentRequest != null) {
                newProxyInstance.realmSet$apartmentRequest(apartmentRequest);
            } else {
                newProxyInstance.realmSet$apartmentRequest(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.ApartmentRequestColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentRequest.class), realmGet$apartmentRequest, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Apartment apartment, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Apartment apartment2 = apartment;
        Map<RealmModel, Long> map2 = map;
        if (apartment2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartment2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Apartment.class);
        long nativePtr = table.getNativePtr();
        ApartmentColumnInfo apartmentColumnInfo = (ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class);
        long j3 = apartmentColumnInfo.userTokenIndex;
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface = apartment2;
        String realmGet$userToken = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$userToken();
        if (realmGet$userToken == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$userToken);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$userToken);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$userToken);
            j2 = j;
        }
        map2.put(apartment2, Long.valueOf(j2));
        Integer realmGet$id = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, apartmentColumnInfo.idIndex, j2, realmGet$id.longValue(), false);
        }
        String realmGet$uid = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$uid();
        if (realmGet$uid != null) {
            Table.nativeSetString(nativePtr, apartmentColumnInfo.uidIndex, j2, realmGet$uid, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, apartmentColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$complexId = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$complexId();
        if (realmGet$complexId != null) {
            Table.nativeSetString(nativePtr, apartmentColumnInfo.complexIdIndex, j2, realmGet$complexId, false);
        }
        String realmGet$buildingId = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$buildingId();
        if (realmGet$buildingId != null) {
            Table.nativeSetString(nativePtr, apartmentColumnInfo.buildingIdIndex, j2, realmGet$buildingId, false);
        }
        Integer realmGet$stage = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$stage();
        if (realmGet$stage != null) {
            Table.nativeSetLong(nativePtr, apartmentColumnInfo.stageIndex, j2, realmGet$stage.longValue(), false);
        }
        Integer realmGet$acceptingEnabled = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$acceptingEnabled();
        if (realmGet$acceptingEnabled != null) {
            Table.nativeSetLong(nativePtr, apartmentColumnInfo.acceptingEnabledIndex, j2, realmGet$acceptingEnabled.longValue(), false);
        }
        Boolean realmGet$showBottomNavigation = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$showBottomNavigation();
        if (realmGet$showBottomNavigation != null) {
            Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.showBottomNavigationIndex, j2, realmGet$showBottomNavigation.booleanValue(), false);
        }
        ApartmentRequest realmGet$apartmentRequest = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$apartmentRequest();
        if (realmGet$apartmentRequest != null) {
            Long l = map2.get(realmGet$apartmentRequest);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insert(realm2, realmGet$apartmentRequest, map2));
            }
            Table.nativeSetLink(nativePtr, apartmentColumnInfo.apartmentRequestIndex, j2, l.longValue(), false);
        }
        Boolean realmGet$rentAvailable = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$rentAvailable();
        if (realmGet$rentAvailable != null) {
            Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.rentAvailableIndex, j2, realmGet$rentAvailable.booleanValue(), false);
        }
        Boolean realmGet$isCommerceThingsAvailable = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$isCommerceThingsAvailable();
        if (realmGet$isCommerceThingsAvailable != null) {
            Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.isCommerceThingsAvailableIndex, j2, realmGet$isCommerceThingsAvailable.booleanValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Apartment.class);
        long nativePtr = table.getNativePtr();
        ApartmentColumnInfo apartmentColumnInfo = (ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class);
        long j4 = apartmentColumnInfo.userTokenIndex;
        while (it.hasNext()) {
            Apartment apartment = (Apartment) it.next();
            if (!map2.containsKey(apartment)) {
                if (apartment instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartment;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(apartment, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface = apartment;
                String realmGet$userToken = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$userToken();
                if (realmGet$userToken == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$userToken);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$userToken);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$userToken);
                    j2 = j;
                }
                map2.put(apartment, Long.valueOf(j2));
                Integer realmGet$id = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    j3 = j4;
                    Table.nativeSetLong(nativePtr, apartmentColumnInfo.idIndex, j2, realmGet$id.longValue(), false);
                } else {
                    j3 = j4;
                }
                String realmGet$uid = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$uid();
                if (realmGet$uid != null) {
                    Table.nativeSetString(nativePtr, apartmentColumnInfo.uidIndex, j2, realmGet$uid, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, apartmentColumnInfo.titleIndex, j2, realmGet$title, false);
                }
                String realmGet$complexId = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$complexId();
                if (realmGet$complexId != null) {
                    Table.nativeSetString(nativePtr, apartmentColumnInfo.complexIdIndex, j2, realmGet$complexId, false);
                }
                String realmGet$buildingId = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$buildingId();
                if (realmGet$buildingId != null) {
                    Table.nativeSetString(nativePtr, apartmentColumnInfo.buildingIdIndex, j2, realmGet$buildingId, false);
                }
                Integer realmGet$stage = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$stage();
                if (realmGet$stage != null) {
                    Table.nativeSetLong(nativePtr, apartmentColumnInfo.stageIndex, j2, realmGet$stage.longValue(), false);
                }
                Integer realmGet$acceptingEnabled = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$acceptingEnabled();
                if (realmGet$acceptingEnabled != null) {
                    Table.nativeSetLong(nativePtr, apartmentColumnInfo.acceptingEnabledIndex, j2, realmGet$acceptingEnabled.longValue(), false);
                }
                Boolean realmGet$showBottomNavigation = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$showBottomNavigation();
                if (realmGet$showBottomNavigation != null) {
                    Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.showBottomNavigationIndex, j2, realmGet$showBottomNavigation.booleanValue(), false);
                }
                ApartmentRequest realmGet$apartmentRequest = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$apartmentRequest();
                if (realmGet$apartmentRequest != null) {
                    Long l = map2.get(realmGet$apartmentRequest);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insert(realm2, realmGet$apartmentRequest, map2));
                    }
                    table.setLink(apartmentColumnInfo.apartmentRequestIndex, j2, l.longValue(), false);
                }
                Boolean realmGet$rentAvailable = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$rentAvailable();
                if (realmGet$rentAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.rentAvailableIndex, j2, realmGet$rentAvailable.booleanValue(), false);
                }
                Boolean realmGet$isCommerceThingsAvailable = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$isCommerceThingsAvailable();
                if (realmGet$isCommerceThingsAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.isCommerceThingsAvailableIndex, j2, realmGet$isCommerceThingsAvailable.booleanValue(), false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Apartment apartment, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Apartment apartment2 = apartment;
        Map<RealmModel, Long> map2 = map;
        if (apartment2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartment2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Apartment.class);
        long nativePtr = table.getNativePtr();
        ApartmentColumnInfo apartmentColumnInfo = (ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class);
        long j2 = apartmentColumnInfo.userTokenIndex;
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface = apartment2;
        String realmGet$userToken = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$userToken();
        if (realmGet$userToken == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$userToken);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$userToken) : j;
        map2.put(apartment2, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$id = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, apartmentColumnInfo.idIndex, createRowWithPrimaryKey, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.idIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$uid = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$uid();
        if (realmGet$uid != null) {
            Table.nativeSetString(nativePtr, apartmentColumnInfo.uidIndex, createRowWithPrimaryKey, realmGet$uid, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.uidIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, apartmentColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$complexId = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$complexId();
        if (realmGet$complexId != null) {
            Table.nativeSetString(nativePtr, apartmentColumnInfo.complexIdIndex, createRowWithPrimaryKey, realmGet$complexId, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.complexIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$buildingId = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$buildingId();
        if (realmGet$buildingId != null) {
            Table.nativeSetString(nativePtr, apartmentColumnInfo.buildingIdIndex, createRowWithPrimaryKey, realmGet$buildingId, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.buildingIdIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$stage = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$stage();
        if (realmGet$stage != null) {
            Table.nativeSetLong(nativePtr, apartmentColumnInfo.stageIndex, createRowWithPrimaryKey, realmGet$stage.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.stageIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$acceptingEnabled = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$acceptingEnabled();
        if (realmGet$acceptingEnabled != null) {
            Table.nativeSetLong(nativePtr, apartmentColumnInfo.acceptingEnabledIndex, createRowWithPrimaryKey, realmGet$acceptingEnabled.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.acceptingEnabledIndex, createRowWithPrimaryKey, false);
        }
        Boolean realmGet$showBottomNavigation = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$showBottomNavigation();
        if (realmGet$showBottomNavigation != null) {
            Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.showBottomNavigationIndex, createRowWithPrimaryKey, realmGet$showBottomNavigation.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.showBottomNavigationIndex, createRowWithPrimaryKey, false);
        }
        ApartmentRequest realmGet$apartmentRequest = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$apartmentRequest();
        if (realmGet$apartmentRequest != null) {
            Long l = map2.get(realmGet$apartmentRequest);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insertOrUpdate(realm2, realmGet$apartmentRequest, map2));
            }
            Table.nativeSetLink(nativePtr, apartmentColumnInfo.apartmentRequestIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, apartmentColumnInfo.apartmentRequestIndex, createRowWithPrimaryKey);
        }
        Boolean realmGet$rentAvailable = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$rentAvailable();
        if (realmGet$rentAvailable != null) {
            Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.rentAvailableIndex, createRowWithPrimaryKey, realmGet$rentAvailable.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.rentAvailableIndex, createRowWithPrimaryKey, false);
        }
        Boolean realmGet$isCommerceThingsAvailable = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$isCommerceThingsAvailable();
        if (realmGet$isCommerceThingsAvailable != null) {
            Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.isCommerceThingsAvailableIndex, createRowWithPrimaryKey, realmGet$isCommerceThingsAvailable.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentColumnInfo.isCommerceThingsAvailableIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Apartment.class);
        long nativePtr = table.getNativePtr();
        ApartmentColumnInfo apartmentColumnInfo = (ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class);
        long j3 = apartmentColumnInfo.userTokenIndex;
        while (it.hasNext()) {
            Apartment apartment = (Apartment) it.next();
            if (!map2.containsKey(apartment)) {
                if (apartment instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartment;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(apartment, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface = apartment;
                String realmGet$userToken = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$userToken();
                if (realmGet$userToken == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$userToken);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$userToken) : j;
                map2.put(apartment, Long.valueOf(createRowWithPrimaryKey));
                Integer realmGet$id = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, apartmentColumnInfo.idIndex, createRowWithPrimaryKey, realmGet$id.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.idIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$uid = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$uid();
                if (realmGet$uid != null) {
                    Table.nativeSetString(nativePtr, apartmentColumnInfo.uidIndex, createRowWithPrimaryKey, realmGet$uid, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.uidIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, apartmentColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$complexId = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$complexId();
                if (realmGet$complexId != null) {
                    Table.nativeSetString(nativePtr, apartmentColumnInfo.complexIdIndex, createRowWithPrimaryKey, realmGet$complexId, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.complexIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$buildingId = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$buildingId();
                if (realmGet$buildingId != null) {
                    Table.nativeSetString(nativePtr, apartmentColumnInfo.buildingIdIndex, createRowWithPrimaryKey, realmGet$buildingId, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.buildingIdIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$stage = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$stage();
                if (realmGet$stage != null) {
                    Table.nativeSetLong(nativePtr, apartmentColumnInfo.stageIndex, createRowWithPrimaryKey, realmGet$stage.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.stageIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$acceptingEnabled = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$acceptingEnabled();
                if (realmGet$acceptingEnabled != null) {
                    Table.nativeSetLong(nativePtr, apartmentColumnInfo.acceptingEnabledIndex, createRowWithPrimaryKey, realmGet$acceptingEnabled.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.acceptingEnabledIndex, createRowWithPrimaryKey, false);
                }
                Boolean realmGet$showBottomNavigation = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$showBottomNavigation();
                if (realmGet$showBottomNavigation != null) {
                    Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.showBottomNavigationIndex, createRowWithPrimaryKey, realmGet$showBottomNavigation.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.showBottomNavigationIndex, createRowWithPrimaryKey, false);
                }
                ApartmentRequest realmGet$apartmentRequest = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$apartmentRequest();
                if (realmGet$apartmentRequest != null) {
                    Long l = map2.get(realmGet$apartmentRequest);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.insertOrUpdate(realm2, realmGet$apartmentRequest, map2));
                    }
                    Table.nativeSetLink(nativePtr, apartmentColumnInfo.apartmentRequestIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, apartmentColumnInfo.apartmentRequestIndex, createRowWithPrimaryKey);
                }
                Boolean realmGet$rentAvailable = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$rentAvailable();
                if (realmGet$rentAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.rentAvailableIndex, createRowWithPrimaryKey, realmGet$rentAvailable.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.rentAvailableIndex, createRowWithPrimaryKey, false);
                }
                Boolean realmGet$isCommerceThingsAvailable = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmGet$isCommerceThingsAvailable();
                if (realmGet$isCommerceThingsAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, apartmentColumnInfo.isCommerceThingsAvailableIndex, createRowWithPrimaryKey, realmGet$isCommerceThingsAvailable.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentColumnInfo.isCommerceThingsAvailableIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static Apartment createDetachedCopy(Apartment apartment, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Apartment apartment2;
        if (i > i2 || apartment == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(apartment);
        if (cacheData == null) {
            apartment2 = new Apartment();
            map.put(apartment, new RealmObjectProxy.CacheData(i, apartment2));
        } else if (i >= cacheData.minDepth) {
            return (Apartment) cacheData.object;
        } else {
            cacheData.minDepth = i;
            apartment2 = (Apartment) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface = apartment2;
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2 = apartment;
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$userToken(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$userToken());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$uid(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$uid());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$complexId(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$complexId());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$buildingId(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$buildingId());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$stage(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$stage());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$acceptingEnabled(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$acceptingEnabled());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$showBottomNavigation(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$showBottomNavigation());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$apartmentRequest(ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$apartmentRequest(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$rentAvailable(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$rentAvailable());
        ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface.realmSet$isCommerceThingsAvailable(ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$isCommerceThingsAvailable());
        return apartment2;
    }

    static Apartment update(Realm realm, ApartmentColumnInfo apartmentColumnInfo, Apartment apartment, Apartment apartment2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface = apartment;
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxyInterface ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2 = apartment2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Apartment.class), apartmentColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(apartmentColumnInfo.userTokenIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$userToken());
        osObjectBuilder.addInteger(apartmentColumnInfo.idIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(apartmentColumnInfo.uidIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$uid());
        osObjectBuilder.addString(apartmentColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(apartmentColumnInfo.complexIdIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$complexId());
        osObjectBuilder.addString(apartmentColumnInfo.buildingIdIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$buildingId());
        osObjectBuilder.addInteger(apartmentColumnInfo.stageIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$stage());
        osObjectBuilder.addInteger(apartmentColumnInfo.acceptingEnabledIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$acceptingEnabled());
        osObjectBuilder.addBoolean(apartmentColumnInfo.showBottomNavigationIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$showBottomNavigation());
        ApartmentRequest realmGet$apartmentRequest = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$apartmentRequest();
        if (realmGet$apartmentRequest == null) {
            osObjectBuilder.addNull(apartmentColumnInfo.apartmentRequestIndex);
        } else {
            ApartmentRequest apartmentRequest = (ApartmentRequest) map.get(realmGet$apartmentRequest);
            if (apartmentRequest != null) {
                osObjectBuilder.addObject(apartmentColumnInfo.apartmentRequestIndex, apartmentRequest);
            } else {
                osObjectBuilder.addObject(apartmentColumnInfo.apartmentRequestIndex, ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_ApartmentRequestRealmProxy.ApartmentRequestColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentRequest.class), realmGet$apartmentRequest, true, map, set));
            }
        }
        osObjectBuilder.addBoolean(apartmentColumnInfo.rentAvailableIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$rentAvailable());
        osObjectBuilder.addBoolean(apartmentColumnInfo.isCommerceThingsAvailableIndex, ru_unicorn_ujin_data_realm_profile_apartmentrealmproxyinterface2.realmGet$isCommerceThingsAvailable());
        osObjectBuilder.updateExistingObject();
        return apartment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Apartment = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{userToken:"
            r0.append(r1)
            java.lang.String r1 = r5.realmGet$userToken()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r5.realmGet$userToken()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{id:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$id()
            if (r4 == 0) goto L_0x0043
            java.lang.Integer r4 = r5.realmGet$id()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{uid:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$uid()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r5.realmGet$uid()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{title:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$title()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r5.realmGet$title()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{complexId:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$complexId()
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r5.realmGet$complexId()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{buildingId:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$buildingId()
            if (r4 == 0) goto L_0x00af
            java.lang.String r4 = r5.realmGet$buildingId()
            goto L_0x00b0
        L_0x00af:
            r4 = r2
        L_0x00b0:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{stage:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$stage()
            if (r4 == 0) goto L_0x00ca
            java.lang.Integer r4 = r5.realmGet$stage()
            goto L_0x00cb
        L_0x00ca:
            r4 = r2
        L_0x00cb:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{acceptingEnabled:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$acceptingEnabled()
            if (r4 == 0) goto L_0x00e5
            java.lang.Integer r4 = r5.realmGet$acceptingEnabled()
            goto L_0x00e6
        L_0x00e5:
            r4 = r2
        L_0x00e6:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{showBottomNavigation:"
            r0.append(r4)
            java.lang.Boolean r4 = r5.realmGet$showBottomNavigation()
            if (r4 == 0) goto L_0x0100
            java.lang.Boolean r4 = r5.realmGet$showBottomNavigation()
            goto L_0x0101
        L_0x0100:
            r4 = r2
        L_0x0101:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{apartmentRequest:"
            r0.append(r4)
            ru.unicorn.ujin.data.realm.profile.ApartmentRequest r4 = r5.realmGet$apartmentRequest()
            if (r4 == 0) goto L_0x0119
            java.lang.String r4 = "ApartmentRequest"
            goto L_0x011a
        L_0x0119:
            r4 = r2
        L_0x011a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{rentAvailable:"
            r0.append(r4)
            java.lang.Boolean r4 = r5.realmGet$rentAvailable()
            if (r4 == 0) goto L_0x0134
            java.lang.Boolean r4 = r5.realmGet$rentAvailable()
            goto L_0x0135
        L_0x0134:
            r4 = r2
        L_0x0135:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "{isCommerceThingsAvailable:"
            r0.append(r3)
            java.lang.Boolean r3 = r5.realmGet$isCommerceThingsAvailable()
            if (r3 == 0) goto L_0x014e
            java.lang.Boolean r2 = r5.realmGet$isCommerceThingsAvailable()
        L_0x014e:
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.toString():java.lang.String");
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
        ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy ru_unicorn_ujin_data_realm_profile_apartmentrealmproxy = (ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_apartmentrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_apartmentrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
