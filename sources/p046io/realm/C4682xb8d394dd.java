package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy */
public class C4682xb8d394dd extends ProfileAdress implements RealmObjectProxy, C4683x72c120dc {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ProfileAdressColumnInfo columnInfo;
    private ProxyState<ProfileAdress> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ProfileAdress";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy$ProfileAdressColumnInfo */
    static final class ProfileAdressColumnInfo extends ColumnInfo {
        long addressIndex;
        long idIndex;
        long maxColumnIndexValue;

        ProfileAdressColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.addressIndex = addColumnDetails(Contact.Type.address, Contact.Type.address, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ProfileAdressColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ProfileAdressColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ProfileAdressColumnInfo profileAdressColumnInfo = (ProfileAdressColumnInfo) columnInfo;
            ProfileAdressColumnInfo profileAdressColumnInfo2 = (ProfileAdressColumnInfo) columnInfo2;
            profileAdressColumnInfo2.idIndex = profileAdressColumnInfo.idIndex;
            profileAdressColumnInfo2.addressIndex = profileAdressColumnInfo.addressIndex;
            profileAdressColumnInfo2.maxColumnIndexValue = profileAdressColumnInfo.maxColumnIndexValue;
        }
    }

    C4682xb8d394dd() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ProfileAdressColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public int realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$address() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.addressIndex);
    }

    public void realmSet$address(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.addressIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'address' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.addressIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'address' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty(Contact.Type.address, RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ProfileAdressColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ProfileAdressColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0061
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy$ProfileAdressColumnInfo r3 = (p046io.realm.C4682xb8d394dd.ProfileAdressColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r2)
            r6 = -1
            if (r5 != 0) goto L_0x002e
            long r8 = r13.getLong(r2)
            long r3 = r14.findFirstLong(r3, r8)
            goto L_0x002f
        L_0x002e:
            r3 = r6
        L_0x002f:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0061
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005c }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005c }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005c }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005c }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy     // Catch:{ all -> 0x005c }
            r14.<init>()     // Catch:{ all -> 0x005c }
            r5.clear()
            goto L_0x0062
        L_0x005c:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0061:
            r14 = r1
        L_0x0062:
            if (r14 != 0) goto L_0x0095
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x008d
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007b
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy r14 = (p046io.realm.C4682xb8d394dd) r14
            goto L_0x0095
        L_0x007b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            int r2 = r13.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy r14 = (p046io.realm.C4682xb8d394dd) r14
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0095:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxyInterface r12 = (p046io.realm.C4683x72c120dc) r12
            java.lang.String r0 = "address"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00aa
            r12.realmSet$address(r1)
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$address(r13)
        L_0x00b1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4682xb8d394dd.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress");
    }

    public static ProfileAdress createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ProfileAdress profileAdress = new ProfileAdress();
        C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface = profileAdress;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (!nextName.equals(Contact.Type.address)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmSet$address(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmSet$address((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ProfileAdress) realm.copyToRealm(profileAdress, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4682xb8d394dd newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileAdress.class), false, Collections.emptyList());
        C4682xb8d394dd ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxy = new C4682xb8d394dd();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4682xb8d394dd.ProfileAdressColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxyInterface r5 = (p046io.realm.C4683x72c120dc) r5
            int r5 = r5.realmGet$id()
            long r5 = (long) r5
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            r0 = 0
            goto L_0x008e
        L_0x006a:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0088 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0088 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0088 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0088 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0088 }
            r0.clear()
            goto L_0x008d
        L_0x0088:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008d:
            r0 = r11
        L_0x008e:
            r3 = r1
            if (r0 == 0) goto L_0x009b
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4682xb8d394dd.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_corona_model_ProfileAdressRealmProxy$ProfileAdressColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress");
    }

    public static ProfileAdress copy(Realm realm, ProfileAdressColumnInfo profileAdressColumnInfo, ProfileAdress profileAdress, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(profileAdress);
        if (realmObjectProxy != null) {
            return (ProfileAdress) realmObjectProxy;
        }
        C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface = profileAdress;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ProfileAdress.class), profileAdressColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(profileAdressColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(profileAdressColumnInfo.addressIndex, ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$address());
        C4682xb8d394dd newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(profileAdress, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ProfileAdress profileAdress, Map<RealmModel, Long> map) {
        long j;
        long j2;
        ProfileAdress profileAdress2 = profileAdress;
        if (profileAdress2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) profileAdress2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ProfileAdress.class);
        long nativePtr = table.getNativePtr();
        ProfileAdressColumnInfo profileAdressColumnInfo = (ProfileAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileAdress.class);
        long j3 = profileAdressColumnInfo.idIndex;
        C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface = profileAdress2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map.put(profileAdress2, Long.valueOf(j2));
        String realmGet$address = ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(nativePtr, profileAdressColumnInfo.addressIndex, j2, realmGet$address, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ProfileAdress.class);
        long nativePtr = table.getNativePtr();
        ProfileAdressColumnInfo profileAdressColumnInfo = (ProfileAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileAdress.class);
        long j2 = profileAdressColumnInfo.idIndex;
        while (it.hasNext()) {
            ProfileAdress profileAdress = (ProfileAdress) it.next();
            if (!map2.containsKey(profileAdress)) {
                if (profileAdress instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) profileAdress;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(profileAdress, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface = profileAdress;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(profileAdress, Long.valueOf(j3));
                String realmGet$address = ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Table.nativeSetString(nativePtr, profileAdressColumnInfo.addressIndex, j3, realmGet$address, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ProfileAdress profileAdress, Map<RealmModel, Long> map) {
        ProfileAdress profileAdress2 = profileAdress;
        if (profileAdress2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) profileAdress2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ProfileAdress.class);
        long nativePtr = table.getNativePtr();
        ProfileAdressColumnInfo profileAdressColumnInfo = (ProfileAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileAdress.class);
        long j = profileAdressColumnInfo.idIndex;
        C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface = profileAdress2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map.put(profileAdress2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$address = ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(nativePtr, profileAdressColumnInfo.addressIndex, createRowWithPrimaryKey, realmGet$address, false);
        } else {
            Table.nativeSetNull(nativePtr, profileAdressColumnInfo.addressIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ProfileAdress.class);
        long nativePtr = table.getNativePtr();
        ProfileAdressColumnInfo profileAdressColumnInfo = (ProfileAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileAdress.class);
        long j2 = profileAdressColumnInfo.idIndex;
        while (it.hasNext()) {
            ProfileAdress profileAdress = (ProfileAdress) it.next();
            if (!map2.containsKey(profileAdress)) {
                if (profileAdress instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) profileAdress;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(profileAdress, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface = profileAdress;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$id()));
                }
                long j3 = j;
                map2.put(profileAdress, Long.valueOf(j3));
                String realmGet$address = ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Table.nativeSetString(nativePtr, profileAdressColumnInfo.addressIndex, j3, realmGet$address, false);
                } else {
                    Table.nativeSetNull(nativePtr, profileAdressColumnInfo.addressIndex, j3, false);
                }
            }
        }
    }

    public static ProfileAdress createDetachedCopy(ProfileAdress profileAdress, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ProfileAdress profileAdress2;
        if (i > i2 || profileAdress == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(profileAdress);
        if (cacheData == null) {
            profileAdress2 = new ProfileAdress();
            map.put(profileAdress, new RealmObjectProxy.CacheData(i, profileAdress2));
        } else if (i >= cacheData.minDepth) {
            return (ProfileAdress) cacheData.object;
        } else {
            cacheData.minDepth = i;
            profileAdress2 = (ProfileAdress) cacheData.object;
        }
        C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface = profileAdress2;
        C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface2 = profileAdress;
        ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface.realmSet$address(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface2.realmGet$address());
        return profileAdress2;
    }

    static ProfileAdress update(Realm realm, ProfileAdressColumnInfo profileAdressColumnInfo, ProfileAdress profileAdress, ProfileAdress profileAdress2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface = profileAdress;
        C4683x72c120dc ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface2 = profileAdress2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ProfileAdress.class), profileAdressColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(profileAdressColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(profileAdressColumnInfo.addressIndex, ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxyinterface2.realmGet$address());
        osObjectBuilder.updateExistingObject();
        return profileAdress;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "ProfileAdress = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{address:" + realmGet$address() + "}" + "]";
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
        C4682xb8d394dd ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxy = (C4682xb8d394dd) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_corona_model_profileadressrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
