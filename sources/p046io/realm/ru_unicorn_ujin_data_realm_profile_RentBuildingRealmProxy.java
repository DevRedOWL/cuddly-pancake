package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.profile.RentBuilding;
import p035ru.unicorn.ujin.data.realm.profile.RentBuildingAddress;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
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
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy extends RentBuilding implements RealmObjectProxy, C4631xa4a4e594 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentBuildingColumnInfo columnInfo;
    private ProxyState<RentBuilding> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentBuilding";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy$RentBuildingColumnInfo */
    static final class RentBuildingColumnInfo extends ColumnInfo {
        long addressIndex;
        long apartmentCountIndex;
        long entranceCountIndex;
        long floorIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        RentBuildingColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.floorIndex = addColumnDetails("floor", "floor", objectSchemaInfo);
            this.apartmentCountIndex = addColumnDetails("apartmentCount", "apartmentCount", objectSchemaInfo);
            this.entranceCountIndex = addColumnDetails("entranceCount", "entranceCount", objectSchemaInfo);
            this.addressIndex = addColumnDetails(Contact.Type.address, Contact.Type.address, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentBuildingColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentBuildingColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentBuildingColumnInfo rentBuildingColumnInfo = (RentBuildingColumnInfo) columnInfo;
            RentBuildingColumnInfo rentBuildingColumnInfo2 = (RentBuildingColumnInfo) columnInfo2;
            rentBuildingColumnInfo2.idIndex = rentBuildingColumnInfo.idIndex;
            rentBuildingColumnInfo2.titleIndex = rentBuildingColumnInfo.titleIndex;
            rentBuildingColumnInfo2.floorIndex = rentBuildingColumnInfo.floorIndex;
            rentBuildingColumnInfo2.apartmentCountIndex = rentBuildingColumnInfo.apartmentCountIndex;
            rentBuildingColumnInfo2.entranceCountIndex = rentBuildingColumnInfo.entranceCountIndex;
            rentBuildingColumnInfo2.addressIndex = rentBuildingColumnInfo.addressIndex;
            rentBuildingColumnInfo2.maxColumnIndexValue = rentBuildingColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentBuildingColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(long j) {
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

    public String realmGet$floor() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.floorIndex);
    }

    public void realmSet$floor(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.floorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.floorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.floorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.floorIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Long realmGet$apartmentCount() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.apartmentCountIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.apartmentCountIndex));
    }

    public void realmSet$apartmentCount(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentCountIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.apartmentCountIndex, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentCountIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.apartmentCountIndex, row$realm.getIndex(), l.longValue(), true);
            }
        }
    }

    public Long realmGet$entranceCount() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.entranceCountIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.entranceCountIndex));
    }

    public void realmSet$entranceCount(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.entranceCountIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.entranceCountIndex, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.entranceCountIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.entranceCountIndex, row$realm.getIndex(), l.longValue(), true);
            }
        }
    }

    public RentBuildingAddress realmGet$address() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.addressIndex)) {
            return null;
        }
        return (RentBuildingAddress) this.proxyState.getRealm$realm().get(RentBuildingAddress.class, this.proxyState.getRow$realm().getLink(this.columnInfo.addressIndex), false, Collections.emptyList());
    }

    public void realmSet$address(RentBuildingAddress rentBuildingAddress) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (rentBuildingAddress == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.addressIndex);
                return;
            }
            this.proxyState.checkValidObject(rentBuildingAddress);
            this.proxyState.getRow$realm().setLink(this.columnInfo.addressIndex, ((RealmObjectProxy) rentBuildingAddress).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(Contact.Type.address)) {
            if (rentBuildingAddress != null && !RealmObject.isManaged(rentBuildingAddress)) {
                rentBuildingAddress = (RentBuildingAddress) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(rentBuildingAddress, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (rentBuildingAddress == null) {
                row$realm.nullifyLink(this.columnInfo.addressIndex);
                return;
            }
            this.proxyState.checkValidObject(rentBuildingAddress);
            row$realm.getTable().setLink(this.columnInfo.addressIndex, row$realm.getIndex(), ((RealmObjectProxy) rentBuildingAddress).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("floor", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("apartmentCount", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("entranceCount", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty(Contact.Type.address, RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentBuildingColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentBuildingColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.RentBuilding createOrUpdateUsingJsonObject(p046io.realm.Realm r15, org.json.JSONObject r16, boolean r17) throws org.json.JSONException {
        /*
            r0 = r15
            r7 = r16
            r8 = r17
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "id"
            r12 = 0
            if (r8 == 0) goto L_0x0069
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r1 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            io.realm.internal.Table r1 = r15.getTable(r1)
            io.realm.RealmSchema r2 = r15.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r3 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy$RentBuildingColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.RentBuildingColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r7.isNull(r11)
            r5 = -1
            if (r4 != 0) goto L_0x0035
            long r13 = r7.getLong(r11)
            long r2 = r1.findFirstLong(r2, r13)
            goto L_0x0036
        L_0x0035:
            r2 = r5
        L_0x0036:
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0069
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0064 }
            io.realm.RealmSchema r1 = r15.getSchema()     // Catch:{ all -> 0x0064 }
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r2 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0064 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0064 }
            r1 = r13
            r2 = r15
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            r13.clear()
            goto L_0x006a
        L_0x0064:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x0069:
            r1 = r12
        L_0x006a:
            java.lang.String r2 = "address"
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r7.has(r2)
            if (r1 == 0) goto L_0x0077
            r9.add(r2)
        L_0x0077:
            boolean r1 = r7.has(r11)
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.isNull(r11)
            if (r1 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r1 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy) r1
            goto L_0x00a5
        L_0x008c:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r1 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            long r3 = r7.getLong(r11)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy) r1
            goto L_0x00a5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxyInterface r3 = (p046io.realm.C4631xa4a4e594) r3
            java.lang.String r4 = "title"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00c1
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00ba
            r3.realmSet$title(r12)
            goto L_0x00c1
        L_0x00ba:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$title(r4)
        L_0x00c1:
            java.lang.String r4 = "floor"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00da
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00d3
            r3.realmSet$floor(r12)
            goto L_0x00da
        L_0x00d3:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$floor(r4)
        L_0x00da:
            java.lang.String r4 = "apartmentCount"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00f7
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00ec
            r3.realmSet$apartmentCount(r12)
            goto L_0x00f7
        L_0x00ec:
            long r4 = r7.getLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.realmSet$apartmentCount(r4)
        L_0x00f7:
            java.lang.String r4 = "entranceCount"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x0114
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x0109
            r3.realmSet$entranceCount(r12)
            goto L_0x0114
        L_0x0109:
            long r4 = r7.getLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.realmSet$entranceCount(r4)
        L_0x0114:
            boolean r4 = r7.has(r2)
            if (r4 == 0) goto L_0x012f
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L_0x0124
            r3.realmSet$address(r12)
            goto L_0x012f
        L_0x0124:
            org.json.JSONObject r2 = r7.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.profile.RentBuildingAddress r0 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.createOrUpdateUsingJsonObject(r15, r2, r8)
            r3.realmSet$address(r0)
        L_0x012f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.profile.RentBuilding");
    }

    public static RentBuilding createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentBuilding rentBuilding = new RentBuilding();
        C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface = rentBuilding;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("floor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$floor(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$floor((String) null);
                }
            } else if (nextName.equals("apartmentCount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$apartmentCount(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$apartmentCount((Long) null);
                }
            } else if (nextName.equals("entranceCount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$entranceCount(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$entranceCount((Long) null);
                }
            } else if (!nextName.equals(Contact.Type.address)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$address((RentBuildingAddress) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentBuilding) realm.copyToRealm(rentBuilding, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuilding.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxy = new ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.RentBuilding copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.RentBuildingColumnInfo r9, p035ru.unicorn.ujin.data.realm.profile.RentBuilding r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.profile.RentBuilding r1 = (p035ru.unicorn.ujin.data.realm.profile.RentBuilding) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentBuilding> r2 = p035ru.unicorn.ujin.data.realm.profile.RentBuilding.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxyInterface r5 = (p046io.realm.C4631xa4a4e594) r5
            long r5 = r5.realmGet$id()
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            r0 = 0
            goto L_0x008d
        L_0x0069:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0087 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0087 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0087 }
            io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0087 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0087 }
            r0.clear()
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008c:
            r0 = r11
        L_0x008d:
            r3 = r1
            if (r0 == 0) goto L_0x009a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.profile.RentBuilding r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.data.realm.profile.RentBuilding r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy$RentBuildingColumnInfo, ru.unicorn.ujin.data.realm.profile.RentBuilding, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.profile.RentBuilding");
    }

    public static RentBuilding copy(Realm realm, RentBuildingColumnInfo rentBuildingColumnInfo, RentBuilding rentBuilding, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentBuilding);
        if (realmObjectProxy != null) {
            return (RentBuilding) realmObjectProxy;
        }
        C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface = rentBuilding;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentBuilding.class), rentBuildingColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentBuildingColumnInfo.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(rentBuildingColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(rentBuildingColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$floor());
        osObjectBuilder.addInteger(rentBuildingColumnInfo.apartmentCountIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$apartmentCount());
        osObjectBuilder.addInteger(rentBuildingColumnInfo.entranceCountIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$entranceCount());
        ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentBuilding, newProxyInstance);
        RentBuildingAddress realmGet$address = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$address();
        if (realmGet$address == null) {
            newProxyInstance.realmSet$address((RentBuildingAddress) null);
        } else {
            RentBuildingAddress rentBuildingAddress = (RentBuildingAddress) map.get(realmGet$address);
            if (rentBuildingAddress != null) {
                newProxyInstance.realmSet$address(rentBuildingAddress);
            } else {
                newProxyInstance.realmSet$address(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.RentBuildingAddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuildingAddress.class), realmGet$address, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentBuilding rentBuilding, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentBuilding rentBuilding2 = rentBuilding;
        Map<RealmModel, Long> map2 = map;
        if (rentBuilding2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuilding2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentBuilding.class);
        long nativePtr = table.getNativePtr();
        RentBuildingColumnInfo rentBuildingColumnInfo = (RentBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuilding.class);
        long j3 = rentBuildingColumnInfo.idIndex;
        C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface = rentBuilding2;
        Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map2.put(rentBuilding2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentBuildingColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$floor = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, rentBuildingColumnInfo.floorIndex, j2, realmGet$floor, false);
        }
        Long realmGet$apartmentCount = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$apartmentCount();
        if (realmGet$apartmentCount != null) {
            Table.nativeSetLong(nativePtr, rentBuildingColumnInfo.apartmentCountIndex, j2, realmGet$apartmentCount.longValue(), false);
        }
        Long realmGet$entranceCount = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$entranceCount();
        if (realmGet$entranceCount != null) {
            Table.nativeSetLong(nativePtr, rentBuildingColumnInfo.entranceCountIndex, j2, realmGet$entranceCount.longValue(), false);
        }
        RentBuildingAddress realmGet$address = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Long l = map2.get(realmGet$address);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insert(realm2, realmGet$address, map2));
            }
            Table.nativeSetLink(nativePtr, rentBuildingColumnInfo.addressIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentBuilding.class);
        long nativePtr = table.getNativePtr();
        RentBuildingColumnInfo rentBuildingColumnInfo = (RentBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuilding.class);
        long j3 = rentBuildingColumnInfo.idIndex;
        while (it.hasNext()) {
            RentBuilding rentBuilding = (RentBuilding) it.next();
            if (!map2.containsKey(rentBuilding)) {
                if (rentBuilding instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuilding;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentBuilding, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface = rentBuilding;
                Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j4 = j;
                map2.put(rentBuilding, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, rentBuildingColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j3;
                }
                String realmGet$floor = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, rentBuildingColumnInfo.floorIndex, j4, realmGet$floor, false);
                }
                Long realmGet$apartmentCount = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$apartmentCount();
                if (realmGet$apartmentCount != null) {
                    Table.nativeSetLong(nativePtr, rentBuildingColumnInfo.apartmentCountIndex, j4, realmGet$apartmentCount.longValue(), false);
                }
                Long realmGet$entranceCount = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$entranceCount();
                if (realmGet$entranceCount != null) {
                    Table.nativeSetLong(nativePtr, rentBuildingColumnInfo.entranceCountIndex, j4, realmGet$entranceCount.longValue(), false);
                }
                RentBuildingAddress realmGet$address = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Long l = map2.get(realmGet$address);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insert(realm2, realmGet$address, map2));
                    }
                    table.setLink(rentBuildingColumnInfo.addressIndex, j4, l.longValue(), false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentBuilding rentBuilding, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        RentBuilding rentBuilding2 = rentBuilding;
        Map<RealmModel, Long> map2 = map;
        if (rentBuilding2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuilding2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentBuilding.class);
        long nativePtr = table.getNativePtr();
        RentBuildingColumnInfo rentBuildingColumnInfo = (RentBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuilding.class);
        long j = rentBuildingColumnInfo.idIndex;
        C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface = rentBuilding2;
        long nativeFindFirstInt = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map2.put(rentBuilding2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentBuildingColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$floor = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, rentBuildingColumnInfo.floorIndex, createRowWithPrimaryKey, realmGet$floor, false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingColumnInfo.floorIndex, createRowWithPrimaryKey, false);
        }
        Long realmGet$apartmentCount = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$apartmentCount();
        if (realmGet$apartmentCount != null) {
            Table.nativeSetLong(nativePtr, rentBuildingColumnInfo.apartmentCountIndex, createRowWithPrimaryKey, realmGet$apartmentCount.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingColumnInfo.apartmentCountIndex, createRowWithPrimaryKey, false);
        }
        Long realmGet$entranceCount = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$entranceCount();
        if (realmGet$entranceCount != null) {
            Table.nativeSetLong(nativePtr, rentBuildingColumnInfo.entranceCountIndex, createRowWithPrimaryKey, realmGet$entranceCount.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentBuildingColumnInfo.entranceCountIndex, createRowWithPrimaryKey, false);
        }
        RentBuildingAddress realmGet$address = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Long l = map2.get(realmGet$address);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insertOrUpdate(realm2, realmGet$address, map2));
            }
            Table.nativeSetLink(nativePtr, rentBuildingColumnInfo.addressIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentBuildingColumnInfo.addressIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentBuilding.class);
        long nativePtr = table.getNativePtr();
        RentBuildingColumnInfo rentBuildingColumnInfo = (RentBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuilding.class);
        long j3 = rentBuildingColumnInfo.idIndex;
        while (it.hasNext()) {
            RentBuilding rentBuilding = (RentBuilding) it.next();
            if (!map2.containsKey(rentBuilding)) {
                if (rentBuilding instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentBuilding;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentBuilding, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface = rentBuilding;
                if (Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(rentBuilding, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, rentBuildingColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, rentBuildingColumnInfo.titleIndex, j4, false);
                }
                String realmGet$floor = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, rentBuildingColumnInfo.floorIndex, j4, realmGet$floor, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingColumnInfo.floorIndex, j4, false);
                }
                Long realmGet$apartmentCount = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$apartmentCount();
                if (realmGet$apartmentCount != null) {
                    Table.nativeSetLong(nativePtr, rentBuildingColumnInfo.apartmentCountIndex, j4, realmGet$apartmentCount.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingColumnInfo.apartmentCountIndex, j4, false);
                }
                Long realmGet$entranceCount = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$entranceCount();
                if (realmGet$entranceCount != null) {
                    Table.nativeSetLong(nativePtr, rentBuildingColumnInfo.entranceCountIndex, j4, realmGet$entranceCount.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentBuildingColumnInfo.entranceCountIndex, j4, false);
                }
                RentBuildingAddress realmGet$address = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Long l = map2.get(realmGet$address);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.insertOrUpdate(realm2, realmGet$address, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentBuildingColumnInfo.addressIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentBuildingColumnInfo.addressIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static RentBuilding createDetachedCopy(RentBuilding rentBuilding, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentBuilding rentBuilding2;
        if (i > i2 || rentBuilding == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentBuilding);
        if (cacheData == null) {
            rentBuilding2 = new RentBuilding();
            map.put(rentBuilding, new RealmObjectProxy.CacheData(i, rentBuilding2));
        } else if (i >= cacheData.minDepth) {
            return (RentBuilding) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentBuilding2 = (RentBuilding) cacheData.object;
        }
        C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface = rentBuilding2;
        C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2 = rentBuilding;
        ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$floor(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$floor());
        ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$apartmentCount(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$apartmentCount());
        ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$entranceCount(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$entranceCount());
        ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$address(), i + 1, i2, map));
        return rentBuilding2;
    }

    static RentBuilding update(Realm realm, RentBuildingColumnInfo rentBuildingColumnInfo, RentBuilding rentBuilding, RentBuilding rentBuilding2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface = rentBuilding;
        C4631xa4a4e594 ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2 = rentBuilding2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentBuilding.class), rentBuildingColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentBuildingColumnInfo.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(rentBuildingColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(rentBuildingColumnInfo.floorIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$floor());
        osObjectBuilder.addInteger(rentBuildingColumnInfo.apartmentCountIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$apartmentCount());
        osObjectBuilder.addInteger(rentBuildingColumnInfo.entranceCountIndex, ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$entranceCount());
        RentBuildingAddress realmGet$address = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxyinterface2.realmGet$address();
        if (realmGet$address == null) {
            osObjectBuilder.addNull(rentBuildingColumnInfo.addressIndex);
        } else {
            RentBuildingAddress rentBuildingAddress = (RentBuildingAddress) map.get(realmGet$address);
            if (rentBuildingAddress != null) {
                osObjectBuilder.addObject(rentBuildingColumnInfo.addressIndex, rentBuildingAddress);
            } else {
                osObjectBuilder.addObject(rentBuildingColumnInfo.addressIndex, ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.RentBuildingAddressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuildingAddress.class), realmGet$address, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return rentBuilding;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentBuilding = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{floor:");
        sb.append(realmGet$floor() != null ? realmGet$floor() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentCount:");
        sb.append(realmGet$apartmentCount() != null ? realmGet$apartmentCount() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{entranceCount:");
        sb.append(realmGet$entranceCount() != null ? realmGet$entranceCount() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{address:");
        if (realmGet$address() != null) {
            str = ru_unicorn_ujin_data_realm_profile_RentBuildingAddressRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxy = (ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_rentbuildingrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
