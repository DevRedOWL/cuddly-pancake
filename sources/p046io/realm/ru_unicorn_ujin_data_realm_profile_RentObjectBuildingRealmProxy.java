package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.profile.RentBuilding;
import p035ru.unicorn.ujin.data.realm.profile.RentComplex;
import p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding;
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
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy extends RentObjectBuilding implements RealmObjectProxy, C4633x54f3d855 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentObjectBuildingColumnInfo columnInfo;
    private ProxyState<RentObjectBuilding> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentObjectBuilding";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy$RentObjectBuildingColumnInfo */
    static final class RentObjectBuildingColumnInfo extends ColumnInfo {
        long buildingIndex;
        long complexIndex;
        long idIndex;
        long maxColumnIndexValue;

        RentObjectBuildingColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.complexIndex = addColumnDetails("complex", "complex", objectSchemaInfo);
            this.buildingIndex = addColumnDetails("building", "building", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentObjectBuildingColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentObjectBuildingColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentObjectBuildingColumnInfo rentObjectBuildingColumnInfo = (RentObjectBuildingColumnInfo) columnInfo;
            RentObjectBuildingColumnInfo rentObjectBuildingColumnInfo2 = (RentObjectBuildingColumnInfo) columnInfo2;
            rentObjectBuildingColumnInfo2.idIndex = rentObjectBuildingColumnInfo.idIndex;
            rentObjectBuildingColumnInfo2.complexIndex = rentObjectBuildingColumnInfo.complexIndex;
            rentObjectBuildingColumnInfo2.buildingIndex = rentObjectBuildingColumnInfo.buildingIndex;
            rentObjectBuildingColumnInfo2.maxColumnIndexValue = rentObjectBuildingColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentObjectBuildingColumnInfo) realmObjectContext.getColumnInfo();
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

    public RentComplex realmGet$complex() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.complexIndex)) {
            return null;
        }
        return (RentComplex) this.proxyState.getRealm$realm().get(RentComplex.class, this.proxyState.getRow$realm().getLink(this.columnInfo.complexIndex), false, Collections.emptyList());
    }

    public void realmSet$complex(RentComplex rentComplex) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (rentComplex == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.complexIndex);
                return;
            }
            this.proxyState.checkValidObject(rentComplex);
            this.proxyState.getRow$realm().setLink(this.columnInfo.complexIndex, ((RealmObjectProxy) rentComplex).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("complex")) {
            if (rentComplex != null && !RealmObject.isManaged(rentComplex)) {
                rentComplex = (RentComplex) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(rentComplex, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (rentComplex == null) {
                row$realm.nullifyLink(this.columnInfo.complexIndex);
                return;
            }
            this.proxyState.checkValidObject(rentComplex);
            row$realm.getTable().setLink(this.columnInfo.complexIndex, row$realm.getIndex(), ((RealmObjectProxy) rentComplex).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RentBuilding realmGet$building() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.buildingIndex)) {
            return null;
        }
        return (RentBuilding) this.proxyState.getRealm$realm().get(RentBuilding.class, this.proxyState.getRow$realm().getLink(this.columnInfo.buildingIndex), false, Collections.emptyList());
    }

    public void realmSet$building(RentBuilding rentBuilding) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (rentBuilding == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.buildingIndex);
                return;
            }
            this.proxyState.checkValidObject(rentBuilding);
            this.proxyState.getRow$realm().setLink(this.columnInfo.buildingIndex, ((RealmObjectProxy) rentBuilding).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("building")) {
            if (rentBuilding != null && !RealmObject.isManaged(rentBuilding)) {
                rentBuilding = (RentBuilding) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(rentBuilding, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (rentBuilding == null) {
                row$realm.nullifyLink(this.columnInfo.buildingIndex);
                return;
            }
            this.proxyState.checkValidObject(rentBuilding);
            row$realm.getTable().setLink(this.columnInfo.buildingIndex, row$realm.getIndex(), ((RealmObjectProxy) rentBuilding).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder.addPersistedLinkProperty("complex", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("building", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentObjectBuildingColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentObjectBuildingColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r1 = 0
            java.lang.String r2 = "id"
            if (r15 == 0) goto L_0x0063
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r3 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r5 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy$RentObjectBuildingColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.RentObjectBuildingColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r2)
            r7 = -1
            if (r6 != 0) goto L_0x0030
            long r9 = r14.getLong(r2)
            long r4 = r3.findFirstLong(r4, r9)
            goto L_0x0031
        L_0x0030:
            r4 = r7
        L_0x0031:
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x005e }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x005e }
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r4 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x005e }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005e }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005e }
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy     // Catch:{ all -> 0x005e }
            r3.<init>()     // Catch:{ all -> 0x005e }
            r6.clear()
            goto L_0x0064
        L_0x005e:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0063:
            r3 = r1
        L_0x0064:
            java.lang.String r4 = "building"
            java.lang.String r5 = "complex"
            if (r3 != 0) goto L_0x00ad
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0073
            r0.add(r5)
        L_0x0073:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x007c
            r0.add(r4)
        L_0x007c:
            boolean r3 = r14.has(r2)
            if (r3 == 0) goto L_0x00a5
            boolean r3 = r14.isNull(r2)
            r6 = 1
            if (r3 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r2 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r2, r1, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy) r3
            goto L_0x00ad
        L_0x0093:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r3 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            long r7 = r14.getLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r2, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy) r3
            goto L_0x00ad
        L_0x00a5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00ad:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxyInterface r0 = (p046io.realm.C4633x54f3d855) r0
            boolean r2 = r14.has(r5)
            if (r2 == 0) goto L_0x00cb
            boolean r2 = r14.isNull(r5)
            if (r2 == 0) goto L_0x00c0
            r0.realmSet$complex(r1)
            goto L_0x00cb
        L_0x00c0:
            org.json.JSONObject r2 = r14.getJSONObject(r5)
            ru.unicorn.ujin.data.realm.profile.RentComplex r2 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.createOrUpdateUsingJsonObject(r13, r2, r15)
            r0.realmSet$complex(r2)
        L_0x00cb:
            boolean r2 = r14.has(r4)
            if (r2 == 0) goto L_0x00e6
            boolean r2 = r14.isNull(r4)
            if (r2 == 0) goto L_0x00db
            r0.realmSet$building(r1)
            goto L_0x00e6
        L_0x00db:
            org.json.JSONObject r14 = r14.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.profile.RentBuilding r13 = p046io.realm.ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$building(r13)
        L_0x00e6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.profile.RentObjectBuilding");
    }

    public static RentObjectBuilding createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentObjectBuilding rentObjectBuilding = new RentObjectBuilding();
        C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface = rentObjectBuilding;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("complex")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmSet$complex((RentComplex) null);
                } else {
                    ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmSet$complex(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("building")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmSet$building((RentBuilding) null);
            } else {
                ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmSet$building(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentObjectBuilding) realm.copyToRealm(rentObjectBuilding, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObjectBuilding.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxy = new ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.RentObjectBuildingColumnInfo r9, p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r1 = (p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.RentObjectBuilding> r2 = p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxyInterface r5 = (p046io.realm.C4633x54f3d855) r5
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
            io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy     // Catch:{ all -> 0x0087 }
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
            ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy$RentObjectBuildingColumnInfo, ru.unicorn.ujin.data.realm.profile.RentObjectBuilding, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.profile.RentObjectBuilding");
    }

    public static RentObjectBuilding copy(Realm realm, RentObjectBuildingColumnInfo rentObjectBuildingColumnInfo, RentObjectBuilding rentObjectBuilding, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentObjectBuilding);
        if (realmObjectProxy != null) {
            return (RentObjectBuilding) realmObjectProxy;
        }
        C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface = rentObjectBuilding;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentObjectBuilding.class), rentObjectBuildingColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentObjectBuildingColumnInfo.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id()));
        ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentObjectBuilding, newProxyInstance);
        RentComplex realmGet$complex = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$complex();
        if (realmGet$complex == null) {
            newProxyInstance.realmSet$complex((RentComplex) null);
        } else {
            RentComplex rentComplex = (RentComplex) map.get(realmGet$complex);
            if (rentComplex != null) {
                newProxyInstance.realmSet$complex(rentComplex);
            } else {
                newProxyInstance.realmSet$complex(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.RentComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentComplex.class), realmGet$complex, z, map, set));
            }
        }
        RentBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$building();
        if (realmGet$building == null) {
            newProxyInstance.realmSet$building((RentBuilding) null);
        } else {
            RentBuilding rentBuilding = (RentBuilding) map.get(realmGet$building);
            if (rentBuilding != null) {
                newProxyInstance.realmSet$building(rentBuilding);
            } else {
                newProxyInstance.realmSet$building(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.RentBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuilding.class), realmGet$building, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentObjectBuilding rentObjectBuilding, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentObjectBuilding rentObjectBuilding2 = rentObjectBuilding;
        Map<RealmModel, Long> map2 = map;
        if (rentObjectBuilding2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentObjectBuilding2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentObjectBuilding.class);
        long nativePtr = table.getNativePtr();
        RentObjectBuildingColumnInfo rentObjectBuildingColumnInfo = (RentObjectBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObjectBuilding.class);
        long j3 = rentObjectBuildingColumnInfo.idIndex;
        C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface = rentObjectBuilding2;
        Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map2.put(rentObjectBuilding2, Long.valueOf(j2));
        RentComplex realmGet$complex = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$complex();
        if (realmGet$complex != null) {
            Long l = map2.get(realmGet$complex);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insert(realm2, realmGet$complex, map2));
            }
            Table.nativeSetLink(nativePtr, rentObjectBuildingColumnInfo.complexIndex, j2, l.longValue(), false);
        }
        RentBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$building();
        if (realmGet$building != null) {
            Long l2 = map2.get(realmGet$building);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insert(realm2, realmGet$building, map2));
            }
            Table.nativeSetLink(nativePtr, rentObjectBuildingColumnInfo.buildingIndex, j2, l2.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentObjectBuilding.class);
        long nativePtr = table.getNativePtr();
        RentObjectBuildingColumnInfo rentObjectBuildingColumnInfo = (RentObjectBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObjectBuilding.class);
        long j2 = rentObjectBuildingColumnInfo.idIndex;
        while (it.hasNext()) {
            RentObjectBuilding rentObjectBuilding = (RentObjectBuilding) it.next();
            if (!map2.containsKey(rentObjectBuilding)) {
                if (rentObjectBuilding instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentObjectBuilding;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentObjectBuilding, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface = rentObjectBuilding;
                Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(rentObjectBuilding, Long.valueOf(j3));
                RentComplex realmGet$complex = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$complex();
                if (realmGet$complex != null) {
                    Long l = map2.get(realmGet$complex);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insert(realm2, realmGet$complex, map2));
                    }
                    table.setLink(rentObjectBuildingColumnInfo.complexIndex, j3, l.longValue(), false);
                }
                RentBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$building();
                if (realmGet$building != null) {
                    Long l2 = map2.get(realmGet$building);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insert(realm2, realmGet$building, map2));
                    }
                    table.setLink(rentObjectBuildingColumnInfo.buildingIndex, j3, l2.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentObjectBuilding rentObjectBuilding, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        RentObjectBuilding rentObjectBuilding2 = rentObjectBuilding;
        Map<RealmModel, Long> map2 = map;
        if (rentObjectBuilding2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentObjectBuilding2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentObjectBuilding.class);
        long nativePtr = table.getNativePtr();
        RentObjectBuildingColumnInfo rentObjectBuildingColumnInfo = (RentObjectBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObjectBuilding.class);
        long j = rentObjectBuildingColumnInfo.idIndex;
        C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface = rentObjectBuilding2;
        long nativeFindFirstInt = Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map2.put(rentObjectBuilding2, Long.valueOf(createRowWithPrimaryKey));
        RentComplex realmGet$complex = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$complex();
        if (realmGet$complex != null) {
            Long l = map2.get(realmGet$complex);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insertOrUpdate(realm2, realmGet$complex, map2));
            }
            Table.nativeSetLink(nativePtr, rentObjectBuildingColumnInfo.complexIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentObjectBuildingColumnInfo.complexIndex, createRowWithPrimaryKey);
        }
        RentBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$building();
        if (realmGet$building != null) {
            Long l2 = map2.get(realmGet$building);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insertOrUpdate(realm2, realmGet$building, map2));
            }
            Table.nativeSetLink(nativePtr, rentObjectBuildingColumnInfo.buildingIndex, createRowWithPrimaryKey, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentObjectBuildingColumnInfo.buildingIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentObjectBuilding.class);
        long nativePtr = table.getNativePtr();
        RentObjectBuildingColumnInfo rentObjectBuildingColumnInfo = (RentObjectBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentObjectBuilding.class);
        long j3 = rentObjectBuildingColumnInfo.idIndex;
        while (it.hasNext()) {
            RentObjectBuilding rentObjectBuilding = (RentObjectBuilding) it.next();
            if (!map2.containsKey(rentObjectBuilding)) {
                if (rentObjectBuilding instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentObjectBuilding;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentObjectBuilding, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface = rentObjectBuilding;
                if (Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(rentObjectBuilding, Long.valueOf(j4));
                RentComplex realmGet$complex = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$complex();
                if (realmGet$complex != null) {
                    Long l = map2.get(realmGet$complex);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.insertOrUpdate(realm2, realmGet$complex, map2));
                    }
                    j2 = j3;
                    Table.nativeSetLink(nativePtr, rentObjectBuildingColumnInfo.complexIndex, j4, l.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeNullifyLink(nativePtr, rentObjectBuildingColumnInfo.complexIndex, j4);
                }
                RentBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmGet$building();
                if (realmGet$building != null) {
                    Long l2 = map2.get(realmGet$building);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.insertOrUpdate(realm2, realmGet$building, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentObjectBuildingColumnInfo.buildingIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentObjectBuildingColumnInfo.buildingIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static RentObjectBuilding createDetachedCopy(RentObjectBuilding rentObjectBuilding, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentObjectBuilding rentObjectBuilding2;
        if (i > i2 || rentObjectBuilding == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentObjectBuilding);
        if (cacheData == null) {
            rentObjectBuilding2 = new RentObjectBuilding();
            map.put(rentObjectBuilding, new RealmObjectProxy.CacheData(i, rentObjectBuilding2));
        } else if (i >= cacheData.minDepth) {
            return (RentObjectBuilding) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentObjectBuilding2 = (RentObjectBuilding) cacheData.object;
        }
        C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface = rentObjectBuilding2;
        C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface2 = rentObjectBuilding;
        ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface2.realmGet$id());
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmSet$complex(ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface2.realmGet$complex(), i3, i2, map));
        ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface.realmSet$building(ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface2.realmGet$building(), i3, i2, map));
        return rentObjectBuilding2;
    }

    static RentObjectBuilding update(Realm realm, RentObjectBuildingColumnInfo rentObjectBuildingColumnInfo, RentObjectBuilding rentObjectBuilding, RentObjectBuilding rentObjectBuilding2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface = rentObjectBuilding;
        C4633x54f3d855 ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface2 = rentObjectBuilding2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentObjectBuilding.class), rentObjectBuildingColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentObjectBuildingColumnInfo.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface2.realmGet$id()));
        RentComplex realmGet$complex = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface2.realmGet$complex();
        if (realmGet$complex == null) {
            osObjectBuilder.addNull(rentObjectBuildingColumnInfo.complexIndex);
        } else {
            RentComplex rentComplex = (RentComplex) map.get(realmGet$complex);
            if (rentComplex != null) {
                osObjectBuilder.addObject(rentObjectBuildingColumnInfo.complexIndex, rentComplex);
            } else {
                osObjectBuilder.addObject(rentObjectBuildingColumnInfo.complexIndex, ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.RentComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentComplex.class), realmGet$complex, true, map, set));
            }
        }
        RentBuilding realmGet$building = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxyinterface2.realmGet$building();
        if (realmGet$building == null) {
            osObjectBuilder.addNull(rentObjectBuildingColumnInfo.buildingIndex);
        } else {
            RentBuilding rentBuilding = (RentBuilding) map.get(realmGet$building);
            if (rentBuilding != null) {
                osObjectBuilder.addObject(rentObjectBuildingColumnInfo.buildingIndex, rentBuilding);
            } else {
                osObjectBuilder.addObject(rentObjectBuildingColumnInfo.buildingIndex, ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.RentBuildingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentBuilding.class), realmGet$building, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return rentObjectBuilding;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentObjectBuilding = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{complex:");
        String str = "null";
        sb.append(realmGet$complex() != null ? ru_unicorn_ujin_data_realm_profile_RentComplexRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{building:");
        if (realmGet$building() != null) {
            str = ru_unicorn_ujin_data_realm_profile_RentBuildingRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxy = (ru_unicorn_ujin_data_realm_profile_RentObjectBuildingRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_rentobjectbuildingrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
