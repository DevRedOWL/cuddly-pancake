package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.AttrRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TypeRent;
import p046io.realm.BaseRealm;
import p046io.realm.C4740x60e6319b;
import p046io.realm.C4762x65e9722d;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy */
public class C4742xdc63beb7 extends PropertyRenta implements RealmObjectProxy, C4743x1ad96c42 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private PropertyRentaColumnInfo columnInfo;
    private ProxyState<PropertyRenta> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PropertyRenta";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy$PropertyRentaColumnInfo */
    static final class PropertyRentaColumnInfo extends ColumnInfo {
        long attributesIndex;
        long buildingIdIndex;
        long idIndex;
        long maxColumnIndexValue;
        long rentCostIndex;
        long titleIndex;
        long typeRentIndex;

        PropertyRentaColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.rentCostIndex = addColumnDetails("rentCost", "rentCost", objectSchemaInfo);
            this.buildingIdIndex = addColumnDetails("buildingId", "buildingId", objectSchemaInfo);
            this.attributesIndex = addColumnDetails("attributes", "attributes", objectSchemaInfo);
            this.typeRentIndex = addColumnDetails("typeRent", "typeRent", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PropertyRentaColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PropertyRentaColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PropertyRentaColumnInfo propertyRentaColumnInfo = (PropertyRentaColumnInfo) columnInfo;
            PropertyRentaColumnInfo propertyRentaColumnInfo2 = (PropertyRentaColumnInfo) columnInfo2;
            propertyRentaColumnInfo2.idIndex = propertyRentaColumnInfo.idIndex;
            propertyRentaColumnInfo2.titleIndex = propertyRentaColumnInfo.titleIndex;
            propertyRentaColumnInfo2.rentCostIndex = propertyRentaColumnInfo.rentCostIndex;
            propertyRentaColumnInfo2.buildingIdIndex = propertyRentaColumnInfo.buildingIdIndex;
            propertyRentaColumnInfo2.attributesIndex = propertyRentaColumnInfo.attributesIndex;
            propertyRentaColumnInfo2.typeRentIndex = propertyRentaColumnInfo.typeRentIndex;
            propertyRentaColumnInfo2.maxColumnIndexValue = propertyRentaColumnInfo.maxColumnIndexValue;
        }
    }

    C4742xdc63beb7() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PropertyRentaColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$rentCost() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.rentCostIndex);
    }

    public void realmSet$rentCost(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rentCostIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.rentCostIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.rentCostIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.rentCostIndex, row$realm.getIndex(), str, true);
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

    public AttrRenta realmGet$attributes() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.attributesIndex)) {
            return null;
        }
        return (AttrRenta) this.proxyState.getRealm$realm().get(AttrRenta.class, this.proxyState.getRow$realm().getLink(this.columnInfo.attributesIndex), false, Collections.emptyList());
    }

    public void realmSet$attributes(AttrRenta attrRenta) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (attrRenta == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.attributesIndex);
                return;
            }
            this.proxyState.checkValidObject(attrRenta);
            this.proxyState.getRow$realm().setLink(this.columnInfo.attributesIndex, ((RealmObjectProxy) attrRenta).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("attributes")) {
            if (attrRenta != null && !RealmObject.isManaged(attrRenta)) {
                attrRenta = (AttrRenta) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(attrRenta, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (attrRenta == null) {
                row$realm.nullifyLink(this.columnInfo.attributesIndex);
                return;
            }
            this.proxyState.checkValidObject(attrRenta);
            row$realm.getTable().setLink(this.columnInfo.attributesIndex, row$realm.getIndex(), ((RealmObjectProxy) attrRenta).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public TypeRent realmGet$typeRent() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.typeRentIndex)) {
            return null;
        }
        return (TypeRent) this.proxyState.getRealm$realm().get(TypeRent.class, this.proxyState.getRow$realm().getLink(this.columnInfo.typeRentIndex), false, Collections.emptyList());
    }

    public void realmSet$typeRent(TypeRent typeRent) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (typeRent == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.typeRentIndex);
                return;
            }
            this.proxyState.checkValidObject(typeRent);
            this.proxyState.getRow$realm().setLink(this.columnInfo.typeRentIndex, ((RealmObjectProxy) typeRent).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("typeRent")) {
            if (typeRent != null && !RealmObject.isManaged(typeRent)) {
                typeRent = (TypeRent) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(typeRent, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (typeRent == null) {
                row$realm.nullifyLink(this.columnInfo.typeRentIndex);
                return;
            }
            this.proxyState.checkValidObject(typeRent);
            row$realm.getTable().setLink(this.columnInfo.typeRentIndex, row$realm.getIndex(), ((RealmObjectProxy) typeRent).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("rentCost", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("buildingId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("attributes", RealmFieldType.OBJECT, C4740x60e6319b.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("typeRent", RealmFieldType.OBJECT, C4762x65e9722d.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PropertyRentaColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PropertyRentaColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy$PropertyRentaColumnInfo r4 = (p046io.realm.C4742xdc63beb7.PropertyRentaColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "typeRent"
            java.lang.String r5 = "attributes"
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0077
            r0.add(r5)
        L_0x0077:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0080
            r0.add(r4)
        L_0x0080:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00a9
            boolean r3 = r14.isNull(r1)
            r6 = 1
            if (r3 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy r3 = (p046io.realm.C4742xdc63beb7) r3
            goto L_0x00b1
        L_0x0097:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy r3 = (p046io.realm.C4742xdc63beb7) r3
            goto L_0x00b1
        L_0x00a9:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00b1:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxyInterface r0 = (p046io.realm.C4743x1ad96c42) r0
            java.lang.String r1 = "title"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00c6
            r0.realmSet$title(r2)
            goto L_0x00cd
        L_0x00c6:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x00cd:
            java.lang.String r1 = "rentCost"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00e6
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00df
            r0.realmSet$rentCost(r2)
            goto L_0x00e6
        L_0x00df:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$rentCost(r1)
        L_0x00e6:
            java.lang.String r1 = "buildingId"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00ff
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00f8
            r0.realmSet$buildingId(r2)
            goto L_0x00ff
        L_0x00f8:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$buildingId(r1)
        L_0x00ff:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x011a
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x010f
            r0.realmSet$attributes(r2)
            goto L_0x011a
        L_0x010f:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.AttrRenta r1 = p046io.realm.C4740x60e6319b.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$attributes(r1)
        L_0x011a:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x0135
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x012a
            r0.realmSet$typeRent(r2)
            goto L_0x0135
        L_0x012a:
            org.json.JSONObject r14 = r14.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TypeRent r13 = p046io.realm.C4762x65e9722d.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$typeRent(r13)
        L_0x0135:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4742xdc63beb7.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta");
    }

    public static PropertyRenta createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        PropertyRenta propertyRenta = new PropertyRenta();
        C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface = propertyRenta;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("rentCost")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$rentCost(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$rentCost((String) null);
                }
            } else if (nextName.equals("buildingId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$buildingId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$buildingId((String) null);
                }
            } else if (nextName.equals("attributes")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$attributes((AttrRenta) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$attributes(C4740x60e6319b.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("typeRent")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$typeRent((TypeRent) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$typeRent(C4762x65e9722d.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (PropertyRenta) realm.copyToRealm(propertyRenta, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4742xdc63beb7 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class), false, Collections.emptyList());
        C4742xdc63beb7 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxy = new C4742xdc63beb7();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4742xdc63beb7.PropertyRentaColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxyInterface r5 = (p046io.realm.C4743x1ad96c42) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4742xdc63beb7.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_PropertyRentaRealmProxy$PropertyRentaColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta");
    }

    public static PropertyRenta copy(Realm realm, PropertyRentaColumnInfo propertyRentaColumnInfo, PropertyRenta propertyRenta, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(propertyRenta);
        if (realmObjectProxy != null) {
            return (PropertyRenta) realmObjectProxy;
        }
        C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface = propertyRenta;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(PropertyRenta.class), propertyRentaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(propertyRentaColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(propertyRentaColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(propertyRentaColumnInfo.rentCostIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$rentCost());
        osObjectBuilder.addString(propertyRentaColumnInfo.buildingIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$buildingId());
        C4742xdc63beb7 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(propertyRenta, newProxyInstance);
        AttrRenta realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$attributes();
        if (realmGet$attributes == null) {
            newProxyInstance.realmSet$attributes((AttrRenta) null);
        } else {
            AttrRenta attrRenta = (AttrRenta) map.get(realmGet$attributes);
            if (attrRenta != null) {
                newProxyInstance.realmSet$attributes(attrRenta);
            } else {
                newProxyInstance.realmSet$attributes(C4740x60e6319b.copyOrUpdate(realm, (C4740x60e6319b.AttrRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AttrRenta.class), realmGet$attributes, z, map, set));
            }
        }
        TypeRent realmGet$typeRent = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$typeRent();
        if (realmGet$typeRent == null) {
            newProxyInstance.realmSet$typeRent((TypeRent) null);
        } else {
            TypeRent typeRent = (TypeRent) map.get(realmGet$typeRent);
            if (typeRent != null) {
                newProxyInstance.realmSet$typeRent(typeRent);
            } else {
                newProxyInstance.realmSet$typeRent(C4762x65e9722d.copyOrUpdate(realm, (C4762x65e9722d.TypeRentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TypeRent.class), realmGet$typeRent, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, PropertyRenta propertyRenta, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        PropertyRenta propertyRenta2 = propertyRenta;
        Map<RealmModel, Long> map2 = map;
        if (propertyRenta2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) propertyRenta2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(PropertyRenta.class);
        long nativePtr = table.getNativePtr();
        PropertyRentaColumnInfo propertyRentaColumnInfo = (PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class);
        long j3 = propertyRentaColumnInfo.idIndex;
        C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface = propertyRenta2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(propertyRenta2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, propertyRentaColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$rentCost = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$rentCost();
        if (realmGet$rentCost != null) {
            Table.nativeSetString(nativePtr, propertyRentaColumnInfo.rentCostIndex, j2, realmGet$rentCost, false);
        }
        String realmGet$buildingId = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$buildingId();
        if (realmGet$buildingId != null) {
            Table.nativeSetString(nativePtr, propertyRentaColumnInfo.buildingIdIndex, j2, realmGet$buildingId, false);
        }
        AttrRenta realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$attributes();
        if (realmGet$attributes != null) {
            Long l = map2.get(realmGet$attributes);
            if (l == null) {
                l = Long.valueOf(C4740x60e6319b.insert(realm2, realmGet$attributes, map2));
            }
            Table.nativeSetLink(nativePtr, propertyRentaColumnInfo.attributesIndex, j2, l.longValue(), false);
        }
        TypeRent realmGet$typeRent = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$typeRent();
        if (realmGet$typeRent != null) {
            Long l2 = map2.get(realmGet$typeRent);
            if (l2 == null) {
                l2 = Long.valueOf(C4762x65e9722d.insert(realm2, realmGet$typeRent, map2));
            }
            Table.nativeSetLink(nativePtr, propertyRentaColumnInfo.typeRentIndex, j2, l2.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(PropertyRenta.class);
        long nativePtr = table.getNativePtr();
        PropertyRentaColumnInfo propertyRentaColumnInfo = (PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class);
        long j2 = propertyRentaColumnInfo.idIndex;
        while (it.hasNext()) {
            PropertyRenta propertyRenta = (PropertyRenta) it.next();
            if (!map2.containsKey(propertyRenta)) {
                if (propertyRenta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) propertyRenta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(propertyRenta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface = propertyRenta;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j3 = j;
                map2.put(propertyRenta, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, propertyRentaColumnInfo.titleIndex, j3, realmGet$title, false);
                }
                String realmGet$rentCost = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$rentCost();
                if (realmGet$rentCost != null) {
                    Table.nativeSetString(nativePtr, propertyRentaColumnInfo.rentCostIndex, j3, realmGet$rentCost, false);
                }
                String realmGet$buildingId = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$buildingId();
                if (realmGet$buildingId != null) {
                    Table.nativeSetString(nativePtr, propertyRentaColumnInfo.buildingIdIndex, j3, realmGet$buildingId, false);
                }
                AttrRenta realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$attributes();
                if (realmGet$attributes != null) {
                    Long l = map2.get(realmGet$attributes);
                    if (l == null) {
                        l = Long.valueOf(C4740x60e6319b.insert(realm2, realmGet$attributes, map2));
                    }
                    table.setLink(propertyRentaColumnInfo.attributesIndex, j3, l.longValue(), false);
                }
                TypeRent realmGet$typeRent = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$typeRent();
                if (realmGet$typeRent != null) {
                    Long l2 = map2.get(realmGet$typeRent);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4762x65e9722d.insert(realm2, realmGet$typeRent, map2));
                    }
                    table.setLink(propertyRentaColumnInfo.typeRentIndex, j3, l2.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, PropertyRenta propertyRenta, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        PropertyRenta propertyRenta2 = propertyRenta;
        Map<RealmModel, Long> map2 = map;
        if (propertyRenta2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) propertyRenta2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(PropertyRenta.class);
        long nativePtr = table.getNativePtr();
        PropertyRentaColumnInfo propertyRentaColumnInfo = (PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class);
        long j2 = propertyRentaColumnInfo.idIndex;
        C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface = propertyRenta2;
        if (ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id()) : j;
        map2.put(propertyRenta2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, propertyRentaColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, propertyRentaColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$rentCost = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$rentCost();
        if (realmGet$rentCost != null) {
            Table.nativeSetString(nativePtr, propertyRentaColumnInfo.rentCostIndex, createRowWithPrimaryKey, realmGet$rentCost, false);
        } else {
            Table.nativeSetNull(nativePtr, propertyRentaColumnInfo.rentCostIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$buildingId = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$buildingId();
        if (realmGet$buildingId != null) {
            Table.nativeSetString(nativePtr, propertyRentaColumnInfo.buildingIdIndex, createRowWithPrimaryKey, realmGet$buildingId, false);
        } else {
            Table.nativeSetNull(nativePtr, propertyRentaColumnInfo.buildingIdIndex, createRowWithPrimaryKey, false);
        }
        AttrRenta realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$attributes();
        if (realmGet$attributes != null) {
            Long l = map2.get(realmGet$attributes);
            if (l == null) {
                l = Long.valueOf(C4740x60e6319b.insertOrUpdate(realm2, realmGet$attributes, map2));
            }
            Table.nativeSetLink(nativePtr, propertyRentaColumnInfo.attributesIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, propertyRentaColumnInfo.attributesIndex, createRowWithPrimaryKey);
        }
        TypeRent realmGet$typeRent = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$typeRent();
        if (realmGet$typeRent != null) {
            Long l2 = map2.get(realmGet$typeRent);
            if (l2 == null) {
                l2 = Long.valueOf(C4762x65e9722d.insertOrUpdate(realm2, realmGet$typeRent, map2));
            }
            Table.nativeSetLink(nativePtr, propertyRentaColumnInfo.typeRentIndex, createRowWithPrimaryKey, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, propertyRentaColumnInfo.typeRentIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(PropertyRenta.class);
        long nativePtr = table.getNativePtr();
        PropertyRentaColumnInfo propertyRentaColumnInfo = (PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class);
        long j3 = propertyRentaColumnInfo.idIndex;
        while (it.hasNext()) {
            PropertyRenta propertyRenta = (PropertyRenta) it.next();
            if (!map2.containsKey(propertyRenta)) {
                if (propertyRenta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) propertyRenta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(propertyRenta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface = propertyRenta;
                if (ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(propertyRenta, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, propertyRentaColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, propertyRentaColumnInfo.titleIndex, j4, false);
                }
                String realmGet$rentCost = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$rentCost();
                if (realmGet$rentCost != null) {
                    Table.nativeSetString(nativePtr, propertyRentaColumnInfo.rentCostIndex, j4, realmGet$rentCost, false);
                } else {
                    Table.nativeSetNull(nativePtr, propertyRentaColumnInfo.rentCostIndex, j4, false);
                }
                String realmGet$buildingId = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$buildingId();
                if (realmGet$buildingId != null) {
                    Table.nativeSetString(nativePtr, propertyRentaColumnInfo.buildingIdIndex, j4, realmGet$buildingId, false);
                } else {
                    Table.nativeSetNull(nativePtr, propertyRentaColumnInfo.buildingIdIndex, j4, false);
                }
                AttrRenta realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$attributes();
                if (realmGet$attributes != null) {
                    Long l = map2.get(realmGet$attributes);
                    if (l == null) {
                        l = Long.valueOf(C4740x60e6319b.insertOrUpdate(realm2, realmGet$attributes, map2));
                    }
                    Table.nativeSetLink(nativePtr, propertyRentaColumnInfo.attributesIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, propertyRentaColumnInfo.attributesIndex, j4);
                }
                TypeRent realmGet$typeRent = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmGet$typeRent();
                if (realmGet$typeRent != null) {
                    Long l2 = map2.get(realmGet$typeRent);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4762x65e9722d.insertOrUpdate(realm2, realmGet$typeRent, map2));
                    }
                    Table.nativeSetLink(nativePtr, propertyRentaColumnInfo.typeRentIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, propertyRentaColumnInfo.typeRentIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static PropertyRenta createDetachedCopy(PropertyRenta propertyRenta, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        PropertyRenta propertyRenta2;
        if (i > i2 || propertyRenta == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(propertyRenta);
        if (cacheData == null) {
            propertyRenta2 = new PropertyRenta();
            map.put(propertyRenta, new RealmObjectProxy.CacheData(i, propertyRenta2));
        } else if (i >= cacheData.minDepth) {
            return (PropertyRenta) cacheData.object;
        } else {
            cacheData.minDepth = i;
            propertyRenta2 = (PropertyRenta) cacheData.object;
        }
        C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface = propertyRenta2;
        C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2 = propertyRenta;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$rentCost(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$rentCost());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$buildingId(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$buildingId());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$attributes(C4740x60e6319b.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$attributes(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface.realmSet$typeRent(C4762x65e9722d.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$typeRent(), i3, i2, map));
        return propertyRenta2;
    }

    static PropertyRenta update(Realm realm, PropertyRentaColumnInfo propertyRentaColumnInfo, PropertyRenta propertyRenta, PropertyRenta propertyRenta2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface = propertyRenta;
        C4743x1ad96c42 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2 = propertyRenta2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(PropertyRenta.class), propertyRentaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(propertyRentaColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(propertyRentaColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(propertyRentaColumnInfo.rentCostIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$rentCost());
        osObjectBuilder.addString(propertyRentaColumnInfo.buildingIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$buildingId());
        AttrRenta realmGet$attributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$attributes();
        if (realmGet$attributes == null) {
            osObjectBuilder.addNull(propertyRentaColumnInfo.attributesIndex);
        } else {
            AttrRenta attrRenta = (AttrRenta) map.get(realmGet$attributes);
            if (attrRenta != null) {
                osObjectBuilder.addObject(propertyRentaColumnInfo.attributesIndex, attrRenta);
            } else {
                osObjectBuilder.addObject(propertyRentaColumnInfo.attributesIndex, C4740x60e6319b.copyOrUpdate(realm, (C4740x60e6319b.AttrRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AttrRenta.class), realmGet$attributes, true, map, set));
            }
        }
        TypeRent realmGet$typeRent = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxyinterface2.realmGet$typeRent();
        if (realmGet$typeRent == null) {
            osObjectBuilder.addNull(propertyRentaColumnInfo.typeRentIndex);
        } else {
            TypeRent typeRent = (TypeRent) map.get(realmGet$typeRent);
            if (typeRent != null) {
                osObjectBuilder.addObject(propertyRentaColumnInfo.typeRentIndex, typeRent);
            } else {
                osObjectBuilder.addObject(propertyRentaColumnInfo.typeRentIndex, C4762x65e9722d.copyOrUpdate(realm, (C4762x65e9722d.TypeRentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TypeRent.class), realmGet$typeRent, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return propertyRenta;
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
        C4742xdc63beb7 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxy = (C4742xdc63beb7) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_propertyrentarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
