package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.realm.Coordinates;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p046io.realm.BaseRealm;
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
import p046io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy */
public class ru_unicorn_ujin_data_realm_ComplexRealmProxy extends Complex implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ComplexColumnInfo columnInfo;
    private RealmList<String> imageListRealmList;
    private RealmList<byte[]> imges_bitmapRealmList;
    private ProxyState<Complex> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Complex";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy$ComplexColumnInfo */
    static final class ComplexColumnInfo extends ColumnInfo {
        long addressIndex;
        long buildingIdIndex;
        long centerIndex;
        long cityIdIndex;
        long dateEndIndex;
        long descriptionIndex;
        long idIndex;
        long imageListIndex;
        long imges_bitmapIndex;
        long isFinishedIndex;
        long maxColumnIndexValue;
        long titleIndex;
        long uidIndex;

        ComplexColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.uidIndex = addColumnDetails("uid", "uid", objectSchemaInfo);
            this.cityIdIndex = addColumnDetails(Complex.Fields.cityId, Complex.Fields.cityId, objectSchemaInfo);
            this.buildingIdIndex = addColumnDetails("buildingId", "buildingId", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.addressIndex = addColumnDetails(Contact.Type.address, Contact.Type.address, objectSchemaInfo);
            this.imageListIndex = addColumnDetails("imageList", "imageList", objectSchemaInfo);
            this.imges_bitmapIndex = addColumnDetails("imges_bitmap", "imges_bitmap", objectSchemaInfo);
            this.dateEndIndex = addColumnDetails(CardFragment.ARG_DATE_END, CardFragment.ARG_DATE_END, objectSchemaInfo);
            this.isFinishedIndex = addColumnDetails("isFinished", "isFinished", objectSchemaInfo);
            this.centerIndex = addColumnDetails("center", "center", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ComplexColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ComplexColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ComplexColumnInfo complexColumnInfo = (ComplexColumnInfo) columnInfo;
            ComplexColumnInfo complexColumnInfo2 = (ComplexColumnInfo) columnInfo2;
            complexColumnInfo2.idIndex = complexColumnInfo.idIndex;
            complexColumnInfo2.uidIndex = complexColumnInfo.uidIndex;
            complexColumnInfo2.cityIdIndex = complexColumnInfo.cityIdIndex;
            complexColumnInfo2.buildingIdIndex = complexColumnInfo.buildingIdIndex;
            complexColumnInfo2.titleIndex = complexColumnInfo.titleIndex;
            complexColumnInfo2.descriptionIndex = complexColumnInfo.descriptionIndex;
            complexColumnInfo2.addressIndex = complexColumnInfo.addressIndex;
            complexColumnInfo2.imageListIndex = complexColumnInfo.imageListIndex;
            complexColumnInfo2.imges_bitmapIndex = complexColumnInfo.imges_bitmapIndex;
            complexColumnInfo2.dateEndIndex = complexColumnInfo.dateEndIndex;
            complexColumnInfo2.isFinishedIndex = complexColumnInfo.isFinishedIndex;
            complexColumnInfo2.centerIndex = complexColumnInfo.centerIndex;
            complexColumnInfo2.maxColumnIndexValue = complexColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ComplexRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ComplexColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$cityId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cityIdIndex);
    }

    public void realmSet$cityId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cityIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cityIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cityIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cityIdIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$address() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.addressIndex);
    }

    public void realmSet$address(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.addressIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.addressIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.addressIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.addressIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<String> realmGet$imageList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.imageListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.imageListRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.imageListIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.imageListRealmList;
    }

    public void realmSet$imageList(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("imageList"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.imageListIndex, RealmFieldType.STRING_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<String> it = realmList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addString(next);
                    }
                }
            }
        }
    }

    public RealmList<byte[]> realmGet$imges_bitmap() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<byte[]> realmList = this.imges_bitmapRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.imges_bitmapRealmList = new RealmList<>(byte[].class, this.proxyState.getRow$realm().getValueList(this.columnInfo.imges_bitmapIndex, RealmFieldType.BINARY_LIST), this.proxyState.getRealm$realm());
        return this.imges_bitmapRealmList;
    }

    public void realmSet$imges_bitmap(RealmList<byte[]> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("imges_bitmap"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.imges_bitmapIndex, RealmFieldType.BINARY_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<byte[]> it = realmList.iterator();
                while (it.hasNext()) {
                    byte[] next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addBinary(next);
                    }
                }
            }
        }
    }

    public String realmGet$dateEnd() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dateEndIndex);
    }

    public void realmSet$dateEnd(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dateEndIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dateEndIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dateEndIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dateEndIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$isFinished() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isFinishedIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isFinishedIndex));
    }

    public void realmSet$isFinished(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isFinishedIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isFinishedIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isFinishedIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isFinishedIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Coordinates realmGet$center() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.centerIndex)) {
            return null;
        }
        return (Coordinates) this.proxyState.getRealm$realm().get(Coordinates.class, this.proxyState.getRow$realm().getLink(this.columnInfo.centerIndex), false, Collections.emptyList());
    }

    public void realmSet$center(Coordinates coordinates) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (coordinates == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.centerIndex);
                return;
            }
            this.proxyState.checkValidObject(coordinates);
            this.proxyState.getRow$realm().setLink(this.columnInfo.centerIndex, ((RealmObjectProxy) coordinates).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("center")) {
            if (coordinates != null && !RealmObject.isManaged(coordinates)) {
                coordinates = (Coordinates) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(coordinates, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (coordinates == null) {
                row$realm.nullifyLink(this.columnInfo.centerIndex);
                return;
            }
            this.proxyState.checkValidObject(coordinates);
            row$realm.getTable().setLink(this.columnInfo.centerIndex, row$realm.getIndex(), ((RealmObjectProxy) coordinates).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 12, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("uid", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Complex.Fields.cityId, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("buildingId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Contact.Type.address, RealmFieldType.STRING, false, false, false);
        builder.addPersistedValueListProperty("imageList", RealmFieldType.STRING_LIST, false);
        builder.addPersistedValueListProperty("imges_bitmap", RealmFieldType.BINARY_LIST, false);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty(CardFragment.ARG_DATE_END, RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("isFinished", RealmFieldType.BOOLEAN, false, false, false);
        builder.addPersistedLinkProperty("center", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ComplexColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ComplexColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Complex createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r3 = p035ru.unicorn.ujin.data.realm.Complex.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r5 = p035ru.unicorn.ujin.data.realm.Complex.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy$ComplexColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy.ComplexColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            java.lang.String r6 = r14.getString(r1)
            long r4 = r3.findFirstString(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r4 = p035ru.unicorn.ujin.data.realm.Complex.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "imges_bitmap"
            java.lang.String r5 = "imageList"
            java.lang.String r6 = "center"
            if (r3 != 0) goto L_0x00b7
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0078
            r0.add(r5)
        L_0x0078:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0081
            r0.add(r4)
        L_0x0081:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x008a
            r0.add(r6)
        L_0x008a:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00af
            boolean r3 = r14.isNull(r1)
            r7 = 1
            if (r3 == 0) goto L_0x00a1
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r1 = p035ru.unicorn.ujin.data.realm.Complex.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r7, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy) r3
            goto L_0x00b7
        L_0x00a1:
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r3 = p035ru.unicorn.ujin.data.realm.Complex.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r7, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy) r3
            goto L_0x00b7
        L_0x00af:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00b7:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface) r0
            java.lang.String r1 = "uid"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x00d4
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00cd
            r0.realmSet$uid(r2)
            goto L_0x00d4
        L_0x00cd:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$uid(r1)
        L_0x00d4:
            java.lang.String r1 = "cityId"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x00ed
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00e6
            r0.realmSet$cityId(r2)
            goto L_0x00ed
        L_0x00e6:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$cityId(r1)
        L_0x00ed:
            java.lang.String r1 = "buildingId"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0106
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00ff
            r0.realmSet$buildingId(r2)
            goto L_0x0106
        L_0x00ff:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$buildingId(r1)
        L_0x0106:
            java.lang.String r1 = "title"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x011f
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x0118
            r0.realmSet$title(r2)
            goto L_0x011f
        L_0x0118:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x011f:
            java.lang.String r1 = "description"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0138
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x0131
            r0.realmSet$description(r2)
            goto L_0x0138
        L_0x0131:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$description(r1)
        L_0x0138:
            java.lang.String r1 = "address"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0151
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x014a
            r0.realmSet$address(r2)
            goto L_0x0151
        L_0x014a:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$address(r1)
        L_0x0151:
            io.realm.RealmList r1 = r0.realmGet$imageList()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r1, r14, r5)
            io.realm.RealmList r1 = r0.realmGet$imges_bitmap()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r1, r14, r4)
            java.lang.String r1 = "dateEnd"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x0178
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x0171
            r0.realmSet$dateEnd(r2)
            goto L_0x0178
        L_0x0171:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$dateEnd(r1)
        L_0x0178:
            java.lang.String r1 = "isFinished"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x0195
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x018a
            r0.realmSet$isFinished(r2)
            goto L_0x0195
        L_0x018a:
            boolean r1 = r14.getBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.realmSet$isFinished(r1)
        L_0x0195:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x01b0
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x01a5
            r0.realmSet$center(r2)
            goto L_0x01b0
        L_0x01a5:
            org.json.JSONObject r14 = r14.getJSONObject(r6)
            ru.unicorn.ujin.data.realm.Coordinates r13 = p046io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$center(r13)
        L_0x01b0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.Complex");
    }

    public static Complex createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Complex complex = new Complex();
        ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface = complex;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("uid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$uid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$uid((String) null);
                }
            } else if (nextName.equals(Complex.Fields.cityId)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$cityId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$cityId((String) null);
                }
            } else if (nextName.equals("buildingId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$buildingId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$buildingId((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals(Contact.Type.address)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$address(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$address((String) null);
                }
            } else if (nextName.equals("imageList")) {
                ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$imageList(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else if (nextName.equals("imges_bitmap")) {
                ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$imges_bitmap(ProxyUtils.createRealmListWithJsonStream(byte[].class, jsonReader));
            } else if (nextName.equals(CardFragment.ARG_DATE_END)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$dateEnd(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$dateEnd((String) null);
                }
            } else if (nextName.equals("isFinished")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$isFinished(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$isFinished((Boolean) null);
                }
            } else if (!nextName.equals("center")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$center((Coordinates) null);
            } else {
                ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$center(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Complex) realm.copyToRealm(complex, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_ComplexRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Complex.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ComplexRealmProxy ru_unicorn_ujin_data_realm_complexrealmproxy = new ru_unicorn_ujin_data_realm_ComplexRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_complexrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Complex copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy.ComplexColumnInfo r9, p035ru.unicorn.ujin.data.realm.Complex r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.Complex r1 = (p035ru.unicorn.ujin.data.realm.Complex) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.Complex> r2 = p035ru.unicorn.ujin.data.realm.Complex.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.Complex r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.Complex r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_ComplexRealmProxy$ComplexColumnInfo, ru.unicorn.ujin.data.realm.Complex, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.Complex");
    }

    public static Complex copy(Realm realm, ComplexColumnInfo complexColumnInfo, Complex complex, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(complex);
        if (realmObjectProxy != null) {
            return (Complex) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface = complex;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Complex.class), complexColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(complexColumnInfo.idIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(complexColumnInfo.uidIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$uid());
        osObjectBuilder.addString(complexColumnInfo.cityIdIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$cityId());
        osObjectBuilder.addString(complexColumnInfo.buildingIdIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$buildingId());
        osObjectBuilder.addString(complexColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(complexColumnInfo.descriptionIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$description());
        osObjectBuilder.addString(complexColumnInfo.addressIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$address());
        osObjectBuilder.addStringList(complexColumnInfo.imageListIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imageList());
        osObjectBuilder.addByteArrayList(complexColumnInfo.imges_bitmapIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imges_bitmap());
        osObjectBuilder.addString(complexColumnInfo.dateEndIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$dateEnd());
        osObjectBuilder.addBoolean(complexColumnInfo.isFinishedIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$isFinished());
        ru_unicorn_ujin_data_realm_ComplexRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(complex, newProxyInstance);
        Coordinates realmGet$center = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$center();
        if (realmGet$center == null) {
            newProxyInstance.realmSet$center((Coordinates) null);
        } else {
            Coordinates coordinates = (Coordinates) map.get(realmGet$center);
            if (coordinates != null) {
                newProxyInstance.realmSet$center(coordinates);
            } else {
                newProxyInstance.realmSet$center(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class), realmGet$center, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Complex complex, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Complex complex2 = complex;
        Map<RealmModel, Long> map2 = map;
        if (complex2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) complex2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Complex.class);
        long nativePtr = table.getNativePtr();
        ComplexColumnInfo complexColumnInfo = (ComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Complex.class);
        long j6 = complexColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface = complex2;
        String realmGet$id = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j6);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j6, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(complex2, Long.valueOf(j2));
        String realmGet$uid = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$uid();
        if (realmGet$uid != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, complexColumnInfo.uidIndex, j2, realmGet$uid, false);
        } else {
            j3 = j2;
        }
        String realmGet$cityId = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$cityId();
        if (realmGet$cityId != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.cityIdIndex, j3, realmGet$cityId, false);
        }
        String realmGet$buildingId = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$buildingId();
        if (realmGet$buildingId != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.buildingIdIndex, j3, realmGet$buildingId, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.titleIndex, j3, realmGet$title, false);
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.descriptionIndex, j3, realmGet$description, false);
        }
        String realmGet$address = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.addressIndex, j3, realmGet$address, false);
        }
        RealmList<String> realmGet$imageList = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imageList();
        if (realmGet$imageList != null) {
            j4 = j3;
            OsList osList = new OsList(table.getUncheckedRow(j4), complexColumnInfo.imageListIndex);
            Iterator<String> it = realmGet$imageList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        } else {
            j4 = j3;
        }
        RealmList<byte[]> realmGet$imges_bitmap = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imges_bitmap();
        if (realmGet$imges_bitmap != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j4), complexColumnInfo.imges_bitmapIndex);
            Iterator<byte[]> it2 = realmGet$imges_bitmap.iterator();
            while (it2.hasNext()) {
                byte[] next2 = it2.next();
                if (next2 == null) {
                    osList2.addNull();
                } else {
                    osList2.addBinary(next2);
                }
            }
        }
        String realmGet$dateEnd = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$dateEnd();
        if (realmGet$dateEnd != null) {
            j5 = j4;
            Table.nativeSetString(nativePtr, complexColumnInfo.dateEndIndex, j4, realmGet$dateEnd, false);
        } else {
            j5 = j4;
        }
        Boolean realmGet$isFinished = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$isFinished();
        if (realmGet$isFinished != null) {
            Table.nativeSetBoolean(nativePtr, complexColumnInfo.isFinishedIndex, j5, realmGet$isFinished.booleanValue(), false);
        }
        Coordinates realmGet$center = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$center();
        if (realmGet$center != null) {
            Long l = map2.get(realmGet$center);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insert(realm2, realmGet$center, map2));
            }
            Table.nativeSetLink(nativePtr, complexColumnInfo.centerIndex, j5, l.longValue(), false);
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Complex.class);
        long nativePtr = table.getNativePtr();
        ComplexColumnInfo complexColumnInfo = (ComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Complex.class);
        long j6 = complexColumnInfo.idIndex;
        while (it.hasNext()) {
            Complex complex = (Complex) it.next();
            if (!map2.containsKey(complex)) {
                if (complex instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) complex;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(complex, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface = complex;
                String realmGet$id = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j6, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(complex, Long.valueOf(j2));
                String realmGet$uid = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$uid();
                if (realmGet$uid != null) {
                    j3 = j2;
                    Table.nativeSetString(nativePtr, complexColumnInfo.uidIndex, j2, realmGet$uid, false);
                } else {
                    j3 = j2;
                }
                String realmGet$cityId = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$cityId();
                if (realmGet$cityId != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.cityIdIndex, j3, realmGet$cityId, false);
                }
                String realmGet$buildingId = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$buildingId();
                if (realmGet$buildingId != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.buildingIdIndex, j3, realmGet$buildingId, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.titleIndex, j3, realmGet$title, false);
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.descriptionIndex, j3, realmGet$description, false);
                }
                String realmGet$address = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.addressIndex, j3, realmGet$address, false);
                }
                RealmList<String> realmGet$imageList = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imageList();
                if (realmGet$imageList != null) {
                    j4 = j3;
                    OsList osList = new OsList(table.getUncheckedRow(j4), complexColumnInfo.imageListIndex);
                    Iterator<String> it2 = realmGet$imageList.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                } else {
                    j4 = j3;
                }
                RealmList<byte[]> realmGet$imges_bitmap = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imges_bitmap();
                if (realmGet$imges_bitmap != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j4), complexColumnInfo.imges_bitmapIndex);
                    Iterator<byte[]> it3 = realmGet$imges_bitmap.iterator();
                    while (it3.hasNext()) {
                        byte[] next2 = it3.next();
                        if (next2 == null) {
                            osList2.addNull();
                        } else {
                            osList2.addBinary(next2);
                        }
                    }
                }
                String realmGet$dateEnd = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$dateEnd();
                if (realmGet$dateEnd != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, complexColumnInfo.dateEndIndex, j4, realmGet$dateEnd, false);
                } else {
                    j5 = j4;
                }
                Boolean realmGet$isFinished = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$isFinished();
                if (realmGet$isFinished != null) {
                    Table.nativeSetBoolean(nativePtr, complexColumnInfo.isFinishedIndex, j5, realmGet$isFinished.booleanValue(), false);
                }
                Coordinates realmGet$center = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$center();
                if (realmGet$center != null) {
                    Long l = map2.get(realmGet$center);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insert(realm2, realmGet$center, map2));
                    }
                    table.setLink(complexColumnInfo.centerIndex, j5, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Complex complex, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Complex complex2 = complex;
        Map<RealmModel, Long> map2 = map;
        if (complex2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) complex2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Complex.class);
        long nativePtr = table.getNativePtr();
        ComplexColumnInfo complexColumnInfo = (ComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Complex.class);
        long j4 = complexColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface = complex2;
        String realmGet$id = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
        map2.put(complex2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$uid = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$uid();
        if (realmGet$uid != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, complexColumnInfo.uidIndex, createRowWithPrimaryKey, realmGet$uid, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, complexColumnInfo.uidIndex, j2, false);
        }
        String realmGet$cityId = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$cityId();
        if (realmGet$cityId != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.cityIdIndex, j2, realmGet$cityId, false);
        } else {
            Table.nativeSetNull(nativePtr, complexColumnInfo.cityIdIndex, j2, false);
        }
        String realmGet$buildingId = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$buildingId();
        if (realmGet$buildingId != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.buildingIdIndex, j2, realmGet$buildingId, false);
        } else {
            Table.nativeSetNull(nativePtr, complexColumnInfo.buildingIdIndex, j2, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, complexColumnInfo.titleIndex, j2, false);
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.descriptionIndex, j2, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, complexColumnInfo.descriptionIndex, j2, false);
        }
        String realmGet$address = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(nativePtr, complexColumnInfo.addressIndex, j2, realmGet$address, false);
        } else {
            Table.nativeSetNull(nativePtr, complexColumnInfo.addressIndex, j2, false);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), complexColumnInfo.imageListIndex);
        osList.removeAll();
        RealmList<String> realmGet$imageList = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imageList();
        if (realmGet$imageList != null) {
            Iterator<String> it = realmGet$imageList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j5), complexColumnInfo.imges_bitmapIndex);
        osList2.removeAll();
        RealmList<byte[]> realmGet$imges_bitmap = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imges_bitmap();
        if (realmGet$imges_bitmap != null) {
            Iterator<byte[]> it2 = realmGet$imges_bitmap.iterator();
            while (it2.hasNext()) {
                byte[] next2 = it2.next();
                if (next2 == null) {
                    osList2.addNull();
                } else {
                    osList2.addBinary(next2);
                }
            }
        }
        String realmGet$dateEnd = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$dateEnd();
        if (realmGet$dateEnd != null) {
            j3 = j5;
            Table.nativeSetString(nativePtr, complexColumnInfo.dateEndIndex, j5, realmGet$dateEnd, false);
        } else {
            j3 = j5;
            Table.nativeSetNull(nativePtr, complexColumnInfo.dateEndIndex, j3, false);
        }
        Boolean realmGet$isFinished = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$isFinished();
        if (realmGet$isFinished != null) {
            Table.nativeSetBoolean(nativePtr, complexColumnInfo.isFinishedIndex, j3, realmGet$isFinished.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, complexColumnInfo.isFinishedIndex, j3, false);
        }
        Coordinates realmGet$center = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$center();
        if (realmGet$center != null) {
            Long l = map2.get(realmGet$center);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insertOrUpdate(realm2, realmGet$center, map2));
            }
            Table.nativeSetLink(nativePtr, complexColumnInfo.centerIndex, j3, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, complexColumnInfo.centerIndex, j3);
        }
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Complex.class);
        long nativePtr = table.getNativePtr();
        ComplexColumnInfo complexColumnInfo = (ComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Complex.class);
        long j5 = complexColumnInfo.idIndex;
        while (it.hasNext()) {
            Complex complex = (Complex) it.next();
            if (!map2.containsKey(complex)) {
                if (complex instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) complex;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(complex, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface = complex;
                String realmGet$id = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j5);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j5, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j5, realmGet$id) : j;
                map2.put(complex, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$uid = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$uid();
                if (realmGet$uid != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j5;
                    Table.nativeSetString(nativePtr, complexColumnInfo.uidIndex, createRowWithPrimaryKey, realmGet$uid, false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j5;
                    Table.nativeSetNull(nativePtr, complexColumnInfo.uidIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$cityId = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$cityId();
                if (realmGet$cityId != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.cityIdIndex, j3, realmGet$cityId, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexColumnInfo.cityIdIndex, j3, false);
                }
                String realmGet$buildingId = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$buildingId();
                if (realmGet$buildingId != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.buildingIdIndex, j3, realmGet$buildingId, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexColumnInfo.buildingIdIndex, j3, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexColumnInfo.titleIndex, j3, false);
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.descriptionIndex, j3, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexColumnInfo.descriptionIndex, j3, false);
                }
                String realmGet$address = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Table.nativeSetString(nativePtr, complexColumnInfo.addressIndex, j3, realmGet$address, false);
                } else {
                    Table.nativeSetNull(nativePtr, complexColumnInfo.addressIndex, j3, false);
                }
                long j6 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j6), complexColumnInfo.imageListIndex);
                osList.removeAll();
                RealmList<String> realmGet$imageList = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imageList();
                if (realmGet$imageList != null) {
                    Iterator<String> it2 = realmGet$imageList.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j6), complexColumnInfo.imges_bitmapIndex);
                osList2.removeAll();
                RealmList<byte[]> realmGet$imges_bitmap = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imges_bitmap();
                if (realmGet$imges_bitmap != null) {
                    Iterator<byte[]> it3 = realmGet$imges_bitmap.iterator();
                    while (it3.hasNext()) {
                        byte[] next2 = it3.next();
                        if (next2 == null) {
                            osList2.addNull();
                        } else {
                            osList2.addBinary(next2);
                        }
                    }
                }
                String realmGet$dateEnd = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$dateEnd();
                if (realmGet$dateEnd != null) {
                    j4 = j6;
                    Table.nativeSetString(nativePtr, complexColumnInfo.dateEndIndex, j6, realmGet$dateEnd, false);
                } else {
                    j4 = j6;
                    Table.nativeSetNull(nativePtr, complexColumnInfo.dateEndIndex, j4, false);
                }
                Boolean realmGet$isFinished = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$isFinished();
                if (realmGet$isFinished != null) {
                    Table.nativeSetBoolean(nativePtr, complexColumnInfo.isFinishedIndex, j4, realmGet$isFinished.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, complexColumnInfo.isFinishedIndex, j4, false);
                }
                Coordinates realmGet$center = ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$center();
                if (realmGet$center != null) {
                    Long l = map2.get(realmGet$center);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insertOrUpdate(realm2, realmGet$center, map2));
                    }
                    Table.nativeSetLink(nativePtr, complexColumnInfo.centerIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, complexColumnInfo.centerIndex, j4);
                }
                j5 = j2;
            }
        }
    }

    public static Complex createDetachedCopy(Complex complex, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Complex complex2;
        if (i > i2 || complex == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(complex);
        if (cacheData == null) {
            complex2 = new Complex();
            map.put(complex, new RealmObjectProxy.CacheData(i, complex2));
        } else if (i >= cacheData.minDepth) {
            return (Complex) cacheData.object;
        } else {
            cacheData.minDepth = i;
            complex2 = (Complex) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface = complex2;
        ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface2 = complex;
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$uid(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$uid());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$cityId(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$cityId());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$buildingId(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$buildingId());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$description(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$address());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$imageList(new RealmList());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imageList().addAll(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$imageList());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$imges_bitmap(new RealmList());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmGet$imges_bitmap().addAll(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$imges_bitmap());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$dateEnd(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$dateEnd());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$isFinished(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$isFinished());
        ru_unicorn_ujin_data_realm_complexrealmproxyinterface.realmSet$center(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$center(), i + 1, i2, map));
        return complex2;
    }

    static Complex update(Realm realm, ComplexColumnInfo complexColumnInfo, Complex complex, Complex complex2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface = complex;
        ru_unicorn_ujin_data_realm_ComplexRealmProxyInterface ru_unicorn_ujin_data_realm_complexrealmproxyinterface2 = complex2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Complex.class), complexColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(complexColumnInfo.idIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(complexColumnInfo.uidIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$uid());
        osObjectBuilder.addString(complexColumnInfo.cityIdIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$cityId());
        osObjectBuilder.addString(complexColumnInfo.buildingIdIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$buildingId());
        osObjectBuilder.addString(complexColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(complexColumnInfo.descriptionIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$description());
        osObjectBuilder.addString(complexColumnInfo.addressIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$address());
        osObjectBuilder.addStringList(complexColumnInfo.imageListIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$imageList());
        osObjectBuilder.addByteArrayList(complexColumnInfo.imges_bitmapIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$imges_bitmap());
        osObjectBuilder.addString(complexColumnInfo.dateEndIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$dateEnd());
        osObjectBuilder.addBoolean(complexColumnInfo.isFinishedIndex, ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$isFinished());
        Coordinates realmGet$center = ru_unicorn_ujin_data_realm_complexrealmproxyinterface2.realmGet$center();
        if (realmGet$center == null) {
            osObjectBuilder.addNull(complexColumnInfo.centerIndex);
        } else {
            Coordinates coordinates = (Coordinates) map.get(realmGet$center);
            if (coordinates != null) {
                osObjectBuilder.addObject(complexColumnInfo.centerIndex, coordinates);
            } else {
                osObjectBuilder.addObject(complexColumnInfo.centerIndex, ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class), realmGet$center, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return complex;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Complex = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{uid:");
        sb.append(realmGet$uid() != null ? realmGet$uid() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{cityId:");
        sb.append(realmGet$cityId() != null ? realmGet$cityId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{buildingId:");
        sb.append(realmGet$buildingId() != null ? realmGet$buildingId() : str);
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
        sb.append("{address:");
        sb.append(realmGet$address() != null ? realmGet$address() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{imageList:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$imageList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{imges_bitmap:");
        sb.append("RealmList<byte[]>[");
        sb.append(realmGet$imges_bitmap().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{dateEnd:");
        sb.append(realmGet$dateEnd() != null ? realmGet$dateEnd() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{isFinished:");
        sb.append(realmGet$isFinished() != null ? realmGet$isFinished() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{center:");
        if (realmGet$center() != null) {
            str = ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_ComplexRealmProxy ru_unicorn_ujin_data_realm_complexrealmproxy = (ru_unicorn_ujin_data_realm_ComplexRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_complexrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_complexrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_complexrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
