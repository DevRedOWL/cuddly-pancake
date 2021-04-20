package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr;
import p046io.realm.BaseRealm;
import p046io.realm.C4752xf2aa007e;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy */
public class C4754xcc2cbaad extends RentType implements RealmObjectProxy, C4755x2c8d850c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<RentTypeAttr> attributesRealmList;
    private RentTypeColumnInfo columnInfo;
    private ProxyState<RentType> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentType";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy$RentTypeColumnInfo */
    static final class RentTypeColumnInfo extends ColumnInfo {
        long attributesIndex;
        long displayNameIndex;
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;

        RentTypeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.displayNameIndex = addColumnDetails("displayName", "displayName", objectSchemaInfo);
            this.attributesIndex = addColumnDetails("attributes", "attributes", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentTypeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentTypeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentTypeColumnInfo rentTypeColumnInfo = (RentTypeColumnInfo) columnInfo;
            RentTypeColumnInfo rentTypeColumnInfo2 = (RentTypeColumnInfo) columnInfo2;
            rentTypeColumnInfo2.idIndex = rentTypeColumnInfo.idIndex;
            rentTypeColumnInfo2.nameIndex = rentTypeColumnInfo.nameIndex;
            rentTypeColumnInfo2.displayNameIndex = rentTypeColumnInfo.displayNameIndex;
            rentTypeColumnInfo2.attributesIndex = rentTypeColumnInfo.attributesIndex;
            rentTypeColumnInfo2.maxColumnIndexValue = rentTypeColumnInfo.maxColumnIndexValue;
        }
    }

    C4754xcc2cbaad() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentTypeColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$displayName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.displayNameIndex);
    }

    public void realmSet$displayName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.displayNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.displayNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.displayNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.displayNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<RentTypeAttr> realmGet$attributes() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<RentTypeAttr> realmList = this.attributesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.attributesRealmList = new RealmList<>(RentTypeAttr.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.attributesIndex), this.proxyState.getRealm$realm());
        return this.attributesRealmList;
    }

    public void realmSet$attributes(RealmList<RentTypeAttr> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("attributes")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<RentTypeAttr> realmList2 = new RealmList<>();
                Iterator<RentTypeAttr> it = realmList.iterator();
                while (it.hasNext()) {
                    RentTypeAttr next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.attributesIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    RentTypeAttr rentTypeAttr = realmList.get(i);
                    this.proxyState.checkValidObject(rentTypeAttr);
                    modelList.addRow(((RealmObjectProxy) rentTypeAttr).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            RentTypeAttr rentTypeAttr2 = realmList.get(i);
            this.proxyState.checkValidObject(rentTypeAttr2);
            modelList.setRow((long) i, ((RealmObjectProxy) rentTypeAttr2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("displayName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("attributes", RealmFieldType.LIST, C4752xf2aa007e.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentTypeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentTypeColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType createOrUpdateUsingJsonObject(p046io.realm.Realm r15, org.json.JSONObject r16, boolean r17) throws org.json.JSONException {
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            io.realm.internal.Table r1 = r15.getTable(r1)
            io.realm.RealmSchema r2 = r15.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy$RentTypeColumnInfo r2 = (p046io.realm.C4754xcc2cbaad.RentTypeColumnInfo) r2
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0064 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0064 }
            r1 = r13
            r2 = r15
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy     // Catch:{ all -> 0x0064 }
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
            java.lang.String r2 = "attributes"
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r7.has(r2)
            if (r1 == 0) goto L_0x0077
            r9.add(r2)
        L_0x0077:
            boolean r1 = r7.has(r11)
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.isNull(r11)
            if (r1 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy r1 = (p046io.realm.C4754xcc2cbaad) r1
            goto L_0x00a5
        L_0x008c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            int r3 = r7.getInt(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy r1 = (p046io.realm.C4754xcc2cbaad) r1
            goto L_0x00a5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            r3 = r1
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxyInterface r3 = (p046io.realm.C4755x2c8d850c) r3
            java.lang.String r4 = "name"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00c1
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00ba
            r3.realmSet$name(r12)
            goto L_0x00c1
        L_0x00ba:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$name(r4)
        L_0x00c1:
            java.lang.String r4 = "displayName"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00da
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00d3
            r3.realmSet$displayName(r12)
            goto L_0x00da
        L_0x00d3:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$displayName(r4)
        L_0x00da:
            boolean r4 = r7.has(r2)
            if (r4 == 0) goto L_0x010e
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L_0x00ea
            r3.realmSet$attributes(r12)
            goto L_0x010e
        L_0x00ea:
            io.realm.RealmList r4 = r3.realmGet$attributes()
            r4.clear()
            org.json.JSONArray r2 = r7.getJSONArray(r2)
            r4 = 0
        L_0x00f6:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x010e
            org.json.JSONObject r5 = r2.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr r5 = p046io.realm.C4752xf2aa007e.createOrUpdateUsingJsonObject(r15, r5, r8)
            io.realm.RealmList r6 = r3.realmGet$attributes()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x00f6
        L_0x010e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4754xcc2cbaad.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType");
    }

    public static RentType createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentType rentType = new RentType();
        C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface = rentType;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("displayName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$displayName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$displayName((String) null);
                }
            } else if (!nextName.equals("attributes")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$attributes((RealmList<RentTypeAttr>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$attributes(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$attributes().add(C4752xf2aa007e.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentType) realm.copyToRealm(rentType, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4754xcc2cbaad newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentType.class), false, Collections.emptyList());
        C4754xcc2cbaad ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxy = new C4754xcc2cbaad();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4754xcc2cbaad.RentTypeColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxyInterface r5 = (p046io.realm.C4755x2c8d850c) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy     // Catch:{ all -> 0x0088 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4754xcc2cbaad.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeRealmProxy$RentTypeColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentType");
    }

    public static RentType copy(Realm realm, RentTypeColumnInfo rentTypeColumnInfo, RentType rentType, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentType);
        if (realmObjectProxy != null) {
            return (RentType) realmObjectProxy;
        }
        C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface = rentType;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentType.class), rentTypeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentTypeColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(rentTypeColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(rentTypeColumnInfo.displayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$displayName());
        C4754xcc2cbaad newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentType, newProxyInstance);
        RealmList<RentTypeAttr> realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$attributes();
        if (realmGet$attributes != null) {
            RealmList<RentTypeAttr> realmGet$attributes2 = newProxyInstance.realmGet$attributes();
            realmGet$attributes2.clear();
            for (int i = 0; i < realmGet$attributes.size(); i++) {
                RentTypeAttr rentTypeAttr = realmGet$attributes.get(i);
                RentTypeAttr rentTypeAttr2 = (RentTypeAttr) map.get(rentTypeAttr);
                if (rentTypeAttr2 != null) {
                    realmGet$attributes2.add(rentTypeAttr2);
                } else {
                    realmGet$attributes2.add(C4752xf2aa007e.copyOrUpdate(realm, (C4752xf2aa007e.RentTypeAttrColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentTypeAttr.class), rentTypeAttr, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentType rentType, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentType rentType2 = rentType;
        Map<RealmModel, Long> map2 = map;
        if (rentType2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentType2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentType.class);
        long nativePtr = table.getNativePtr();
        RentTypeColumnInfo rentTypeColumnInfo = (RentTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentType.class);
        long j3 = rentTypeColumnInfo.idIndex;
        C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface = rentType2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        long j4 = j;
        map2.put(rentType2, Long.valueOf(j4));
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            j2 = j4;
            Table.nativeSetString(nativePtr, rentTypeColumnInfo.nameIndex, j4, realmGet$name, false);
        } else {
            j2 = j4;
        }
        String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$displayName();
        if (realmGet$displayName != null) {
            Table.nativeSetString(nativePtr, rentTypeColumnInfo.displayNameIndex, j2, realmGet$displayName, false);
        }
        RealmList<RentTypeAttr> realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$attributes();
        if (realmGet$attributes == null) {
            return j2;
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), rentTypeColumnInfo.attributesIndex);
        Iterator<RentTypeAttr> it = realmGet$attributes.iterator();
        while (it.hasNext()) {
            RentTypeAttr next = it.next();
            Long l = map2.get(next);
            if (l == null) {
                l = Long.valueOf(C4752xf2aa007e.insert(realm2, next, map2));
            }
            osList.addRow(l.longValue());
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentType.class);
        long nativePtr = table.getNativePtr();
        RentTypeColumnInfo rentTypeColumnInfo = (RentTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentType.class);
        long j3 = rentTypeColumnInfo.idIndex;
        while (it.hasNext()) {
            RentType rentType = (RentType) it.next();
            if (!map2.containsKey(rentType)) {
                if (rentType instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentType;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentType, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface = rentType;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j4 = j;
                map2.put(rentType, Long.valueOf(j4));
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    j2 = j4;
                    Table.nativeSetString(nativePtr, rentTypeColumnInfo.nameIndex, j4, realmGet$name, false);
                } else {
                    j2 = j4;
                }
                String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$displayName();
                if (realmGet$displayName != null) {
                    Table.nativeSetString(nativePtr, rentTypeColumnInfo.displayNameIndex, j2, realmGet$displayName, false);
                }
                RealmList<RentTypeAttr> realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$attributes();
                if (realmGet$attributes != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j2), rentTypeColumnInfo.attributesIndex);
                    Iterator<RentTypeAttr> it2 = realmGet$attributes.iterator();
                    while (it2.hasNext()) {
                        RentTypeAttr next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4752xf2aa007e.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentType rentType, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentType rentType2 = rentType;
        Map<RealmModel, Long> map2 = map;
        if (rentType2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentType2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentType.class);
        long nativePtr = table.getNativePtr();
        RentTypeColumnInfo rentTypeColumnInfo = (RentTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentType.class);
        long j3 = rentTypeColumnInfo.idIndex;
        C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface = rentType2;
        if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id()) != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id()));
        }
        long j4 = j;
        map2.put(rentType2, Long.valueOf(j4));
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            j2 = j4;
            Table.nativeSetString(nativePtr, rentTypeColumnInfo.nameIndex, j4, realmGet$name, false);
        } else {
            j2 = j4;
            Table.nativeSetNull(nativePtr, rentTypeColumnInfo.nameIndex, j2, false);
        }
        String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$displayName();
        if (realmGet$displayName != null) {
            Table.nativeSetString(nativePtr, rentTypeColumnInfo.displayNameIndex, j2, realmGet$displayName, false);
        } else {
            Table.nativeSetNull(nativePtr, rentTypeColumnInfo.displayNameIndex, j2, false);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), rentTypeColumnInfo.attributesIndex);
        RealmList<RentTypeAttr> realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$attributes();
        if (realmGet$attributes == null || ((long) realmGet$attributes.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$attributes != null) {
                Iterator<RentTypeAttr> it = realmGet$attributes.iterator();
                while (it.hasNext()) {
                    RentTypeAttr next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4752xf2aa007e.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$attributes.size();
            for (int i = 0; i < size; i++) {
                RentTypeAttr rentTypeAttr = realmGet$attributes.get(i);
                Long l2 = map2.get(rentTypeAttr);
                if (l2 == null) {
                    l2 = Long.valueOf(C4752xf2aa007e.insertOrUpdate(realm2, rentTypeAttr, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return j5;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentType.class);
        long nativePtr = table.getNativePtr();
        RentTypeColumnInfo rentTypeColumnInfo = (RentTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentType.class);
        long j3 = rentTypeColumnInfo.idIndex;
        while (it.hasNext()) {
            RentType rentType = (RentType) it.next();
            if (!map2.containsKey(rentType)) {
                if (rentType instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentType;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentType, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface = rentType;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(rentType, Long.valueOf(j4));
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    j2 = j4;
                    Table.nativeSetString(nativePtr, rentTypeColumnInfo.nameIndex, j4, realmGet$name, false);
                } else {
                    j2 = j4;
                    Table.nativeSetNull(nativePtr, rentTypeColumnInfo.nameIndex, j4, false);
                }
                String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$displayName();
                if (realmGet$displayName != null) {
                    Table.nativeSetString(nativePtr, rentTypeColumnInfo.displayNameIndex, j2, realmGet$displayName, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentTypeColumnInfo.displayNameIndex, j2, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(j2), rentTypeColumnInfo.attributesIndex);
                RealmList<RentTypeAttr> realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmGet$attributes();
                if (realmGet$attributes == null || ((long) realmGet$attributes.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$attributes != null) {
                        Iterator<RentTypeAttr> it2 = realmGet$attributes.iterator();
                        while (it2.hasNext()) {
                            RentTypeAttr next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4752xf2aa007e.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$attributes.size();
                    for (int i = 0; i < size; i++) {
                        RentTypeAttr rentTypeAttr = realmGet$attributes.get(i);
                        Long l2 = map2.get(rentTypeAttr);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4752xf2aa007e.insertOrUpdate(realm2, rentTypeAttr, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static RentType createDetachedCopy(RentType rentType, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentType rentType2;
        if (i > i2 || rentType == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentType);
        if (cacheData == null) {
            rentType2 = new RentType();
            map.put(rentType, new RealmObjectProxy.CacheData(i, rentType2));
        } else if (i >= cacheData.minDepth) {
            return (RentType) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentType2 = (RentType) cacheData.object;
        }
        C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface = rentType2;
        C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2 = rentType;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$displayName(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2.realmGet$displayName());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$attributes((RealmList<RentTypeAttr>) null);
        } else {
            RealmList<RentTypeAttr> realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2.realmGet$attributes();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface.realmSet$attributes(realmList);
            int i3 = i + 1;
            int size = realmGet$attributes.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4752xf2aa007e.createDetachedCopy(realmGet$attributes.get(i4), i3, i2, map));
            }
        }
        return rentType2;
    }

    static RentType update(Realm realm, RentTypeColumnInfo rentTypeColumnInfo, RentType rentType, RentType rentType2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface = rentType;
        C4755x2c8d850c ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2 = rentType2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentType.class), rentTypeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentTypeColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(rentTypeColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(rentTypeColumnInfo.displayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2.realmGet$displayName());
        RealmList<RentTypeAttr> realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxyinterface2.realmGet$attributes();
        if (realmGet$attributes != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$attributes.size(); i++) {
                RentTypeAttr rentTypeAttr = realmGet$attributes.get(i);
                RentTypeAttr rentTypeAttr2 = (RentTypeAttr) map.get(rentTypeAttr);
                if (rentTypeAttr2 != null) {
                    realmList.add(rentTypeAttr2);
                } else {
                    realmList.add(C4752xf2aa007e.copyOrUpdate(realm, (C4752xf2aa007e.RentTypeAttrColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentTypeAttr.class), rentTypeAttr, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(rentTypeColumnInfo.attributesIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(rentTypeColumnInfo.attributesIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return rentType;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentType = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{displayName:");
        if (realmGet$displayName() != null) {
            str = realmGet$displayName();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{attributes:");
        sb.append("RealmList<RentTypeAttr>[");
        sb.append(realmGet$attributes().size());
        sb.append("]");
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
        C4754xcc2cbaad ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxy = (C4754xcc2cbaad) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttyperealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
