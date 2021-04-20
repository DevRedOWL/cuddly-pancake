package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ApartmentScenarioOptionAdd;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options;
import p046io.realm.BaseRealm;
import p046io.realm.C4798x7bd56e2e;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy */
public class C4802x9a8f8638 extends Options implements RealmObjectProxy, C4803x4cff85e1 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private OptionsColumnInfo columnInfo;
    private ProxyState<Options> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Options";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy$OptionsColumnInfo */
    static final class OptionsColumnInfo extends ColumnInfo {
        long apartmentScenarioIdIndex;
        long apartmentScenarioOptionAddIndex;
        long apartmentScenarioOptionHrefIndex;
        long apartmentScenarioOptionHrefTextIndex;
        long apartmentScenarioOptionIdIndex;
        long apartmentScenarioOptionStateIndex;
        long apartmentScenarioOptionTypeIndex;
        long headerIndex;
        long maxColumnIndexValue;
        long optionDescriptionIndex;
        long optionNameIndex;

        OptionsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.headerIndex = addColumnDetails("header", "header", objectSchemaInfo);
            this.apartmentScenarioOptionIdIndex = addColumnDetails("apartmentScenarioOptionId", "apartmentScenarioOptionId", objectSchemaInfo);
            this.apartmentScenarioIdIndex = addColumnDetails("apartmentScenarioId", "apartmentScenarioId", objectSchemaInfo);
            this.apartmentScenarioOptionTypeIndex = addColumnDetails("apartmentScenarioOptionType", "apartmentScenarioOptionType", objectSchemaInfo);
            this.apartmentScenarioOptionHrefIndex = addColumnDetails("apartmentScenarioOptionHref", "apartmentScenarioOptionHref", objectSchemaInfo);
            this.apartmentScenarioOptionHrefTextIndex = addColumnDetails("apartmentScenarioOptionHrefText", "apartmentScenarioOptionHrefText", objectSchemaInfo);
            this.apartmentScenarioOptionStateIndex = addColumnDetails("apartmentScenarioOptionState", "apartmentScenarioOptionState", objectSchemaInfo);
            this.optionNameIndex = addColumnDetails("optionName", "optionName", objectSchemaInfo);
            this.optionDescriptionIndex = addColumnDetails("optionDescription", "optionDescription", objectSchemaInfo);
            this.apartmentScenarioOptionAddIndex = addColumnDetails("apartmentScenarioOptionAdd", "apartmentScenarioOptionAdd", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        OptionsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new OptionsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            OptionsColumnInfo optionsColumnInfo = (OptionsColumnInfo) columnInfo;
            OptionsColumnInfo optionsColumnInfo2 = (OptionsColumnInfo) columnInfo2;
            optionsColumnInfo2.headerIndex = optionsColumnInfo.headerIndex;
            optionsColumnInfo2.apartmentScenarioOptionIdIndex = optionsColumnInfo.apartmentScenarioOptionIdIndex;
            optionsColumnInfo2.apartmentScenarioIdIndex = optionsColumnInfo.apartmentScenarioIdIndex;
            optionsColumnInfo2.apartmentScenarioOptionTypeIndex = optionsColumnInfo.apartmentScenarioOptionTypeIndex;
            optionsColumnInfo2.apartmentScenarioOptionHrefIndex = optionsColumnInfo.apartmentScenarioOptionHrefIndex;
            optionsColumnInfo2.apartmentScenarioOptionHrefTextIndex = optionsColumnInfo.apartmentScenarioOptionHrefTextIndex;
            optionsColumnInfo2.apartmentScenarioOptionStateIndex = optionsColumnInfo.apartmentScenarioOptionStateIndex;
            optionsColumnInfo2.optionNameIndex = optionsColumnInfo.optionNameIndex;
            optionsColumnInfo2.optionDescriptionIndex = optionsColumnInfo.optionDescriptionIndex;
            optionsColumnInfo2.apartmentScenarioOptionAddIndex = optionsColumnInfo.apartmentScenarioOptionAddIndex;
            optionsColumnInfo2.maxColumnIndexValue = optionsColumnInfo.maxColumnIndexValue;
        }
    }

    C4802x9a8f8638() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (OptionsColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$header() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.headerIndex);
    }

    public void realmSet$header(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.headerIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.headerIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.headerIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.headerIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$apartmentScenarioOptionId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.apartmentScenarioOptionIdIndex);
    }

    public void realmSet$apartmentScenarioOptionId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'apartmentScenarioOptionId' cannot be changed after object was created.");
        }
    }

    public String realmGet$apartmentScenarioId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.apartmentScenarioIdIndex);
    }

    public void realmSet$apartmentScenarioId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentScenarioIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.apartmentScenarioIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentScenarioIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.apartmentScenarioIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$apartmentScenarioOptionType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.apartmentScenarioOptionTypeIndex);
    }

    public void realmSet$apartmentScenarioOptionType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentScenarioOptionTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.apartmentScenarioOptionTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentScenarioOptionTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.apartmentScenarioOptionTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$apartmentScenarioOptionHref() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.apartmentScenarioOptionHrefIndex);
    }

    public void realmSet$apartmentScenarioOptionHref(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentScenarioOptionHrefIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.apartmentScenarioOptionHrefIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentScenarioOptionHrefIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.apartmentScenarioOptionHrefIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$apartmentScenarioOptionHrefText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.apartmentScenarioOptionHrefTextIndex);
    }

    public void realmSet$apartmentScenarioOptionHrefText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentScenarioOptionHrefTextIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.apartmentScenarioOptionHrefTextIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentScenarioOptionHrefTextIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.apartmentScenarioOptionHrefTextIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$apartmentScenarioOptionState() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.apartmentScenarioOptionStateIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.apartmentScenarioOptionStateIndex));
    }

    public void realmSet$apartmentScenarioOptionState(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentScenarioOptionStateIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.apartmentScenarioOptionStateIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentScenarioOptionStateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.apartmentScenarioOptionStateIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$optionName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.optionNameIndex);
    }

    public void realmSet$optionName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.optionNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.optionNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.optionNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.optionNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$optionDescription() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.optionDescriptionIndex);
    }

    public void realmSet$optionDescription(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.optionDescriptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.optionDescriptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.optionDescriptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.optionDescriptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public ApartmentScenarioOptionAdd realmGet$apartmentScenarioOptionAdd() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.apartmentScenarioOptionAddIndex)) {
            return null;
        }
        return (ApartmentScenarioOptionAdd) this.proxyState.getRealm$realm().get(ApartmentScenarioOptionAdd.class, this.proxyState.getRow$realm().getLink(this.columnInfo.apartmentScenarioOptionAddIndex), false, Collections.emptyList());
    }

    public void realmSet$apartmentScenarioOptionAdd(ApartmentScenarioOptionAdd apartmentScenarioOptionAdd) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (apartmentScenarioOptionAdd == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.apartmentScenarioOptionAddIndex);
                return;
            }
            this.proxyState.checkValidObject(apartmentScenarioOptionAdd);
            this.proxyState.getRow$realm().setLink(this.columnInfo.apartmentScenarioOptionAddIndex, ((RealmObjectProxy) apartmentScenarioOptionAdd).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("apartmentScenarioOptionAdd")) {
            if (apartmentScenarioOptionAdd != null && !RealmObject.isManaged(apartmentScenarioOptionAdd)) {
                apartmentScenarioOptionAdd = (ApartmentScenarioOptionAdd) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(apartmentScenarioOptionAdd, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (apartmentScenarioOptionAdd == null) {
                row$realm.nullifyLink(this.columnInfo.apartmentScenarioOptionAddIndex);
                return;
            }
            this.proxyState.checkValidObject(apartmentScenarioOptionAdd);
            row$realm.getTable().setLink(this.columnInfo.apartmentScenarioOptionAddIndex, row$realm.getIndex(), ((RealmObjectProxy) apartmentScenarioOptionAdd).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 10, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("header", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("apartmentScenarioOptionId", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("apartmentScenarioId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("apartmentScenarioOptionType", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("apartmentScenarioOptionHref", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("apartmentScenarioOptionHrefText", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("apartmentScenarioOptionState", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("optionName", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("optionDescription", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("apartmentScenarioOptionAdd", RealmFieldType.OBJECT, C4798x7bd56e2e.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OptionsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new OptionsColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "apartmentScenarioOptionId"
            r12 = 0
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy$OptionsColumnInfo r2 = (p046io.realm.C4802x9a8f8638.OptionsColumnInfo) r2
            long r2 = r2.apartmentScenarioOptionIdIndex
            boolean r4 = r15.isNull(r11)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            java.lang.String r4 = r15.getString(r11)
            long r2 = r1.findFirstString(r2, r4)
        L_0x0036:
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006b
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0066 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0066 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r12
        L_0x006c:
            java.lang.String r2 = "apartmentScenarioOptionAdd"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy r1 = (p046io.realm.C4802x9a8f8638) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy r1 = (p046io.realm.C4802x9a8f8638) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'apartmentScenarioOptionId'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxyInterface r3 = (p046io.realm.C4803x4cff85e1) r3
            java.lang.String r4 = "header"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00bf
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b8
            r3.realmSet$header(r12)
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$header(r4)
        L_0x00bf:
            java.lang.String r4 = "apartmentScenarioId"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00d8
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00d1
            r3.realmSet$apartmentScenarioId(r12)
            goto L_0x00d8
        L_0x00d1:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$apartmentScenarioId(r4)
        L_0x00d8:
            java.lang.String r4 = "apartmentScenarioOptionType"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00f1
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00ea
            r3.realmSet$apartmentScenarioOptionType(r12)
            goto L_0x00f1
        L_0x00ea:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$apartmentScenarioOptionType(r4)
        L_0x00f1:
            java.lang.String r4 = "apartmentScenarioOptionHref"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x010a
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0103
            r3.realmSet$apartmentScenarioOptionHref(r12)
            goto L_0x010a
        L_0x0103:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$apartmentScenarioOptionHref(r4)
        L_0x010a:
            java.lang.String r4 = "apartmentScenarioOptionHrefText"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0123
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x011c
            r3.realmSet$apartmentScenarioOptionHrefText(r12)
            goto L_0x0123
        L_0x011c:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$apartmentScenarioOptionHrefText(r4)
        L_0x0123:
            java.lang.String r4 = "apartmentScenarioOptionState"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0140
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0135
            r3.realmSet$apartmentScenarioOptionState(r12)
            goto L_0x0140
        L_0x0135:
            int r4 = r15.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.realmSet$apartmentScenarioOptionState(r4)
        L_0x0140:
            java.lang.String r4 = "optionName"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0159
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0152
            r3.realmSet$optionName(r12)
            goto L_0x0159
        L_0x0152:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$optionName(r4)
        L_0x0159:
            java.lang.String r4 = "optionDescription"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0172
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x016b
            r3.realmSet$optionDescription(r12)
            goto L_0x0172
        L_0x016b:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$optionDescription(r4)
        L_0x0172:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x018d
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x0182
            r3.realmSet$apartmentScenarioOptionAdd(r12)
            goto L_0x018d
        L_0x0182:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.ApartmentScenarioOptionAdd r0 = p046io.realm.C4798x7bd56e2e.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$apartmentScenarioOptionAdd(r0)
        L_0x018d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4802x9a8f8638.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options");
    }

    public static Options createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Options options = new Options();
        C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface = options;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("header")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$header(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$header((String) null);
                }
            } else if (nextName.equals("apartmentScenarioOptionId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionId((String) null);
                }
                z = true;
            } else if (nextName.equals("apartmentScenarioId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioId((String) null);
                }
            } else if (nextName.equals("apartmentScenarioOptionType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionType((String) null);
                }
            } else if (nextName.equals("apartmentScenarioOptionHref")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionHref(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionHref((String) null);
                }
            } else if (nextName.equals("apartmentScenarioOptionHrefText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionHrefText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionHrefText((String) null);
                }
            } else if (nextName.equals("apartmentScenarioOptionState")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionState(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionState((Integer) null);
                }
            } else if (nextName.equals("optionName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$optionName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$optionName((String) null);
                }
            } else if (nextName.equals("optionDescription")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$optionDescription(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$optionDescription((String) null);
                }
            } else if (!nextName.equals("apartmentScenarioOptionAdd")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionAdd((ApartmentScenarioOptionAdd) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionAdd(C4798x7bd56e2e.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Options) realm.copyToRealm(options, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'apartmentScenarioOptionId'.");
    }

    private static C4802x9a8f8638 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Options.class), false, Collections.emptyList());
        C4802x9a8f8638 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxy = new C4802x9a8f8638();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4802x9a8f8638.OptionsColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.apartmentScenarioOptionIdIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxyInterface r5 = (p046io.realm.C4803x4cff85e1) r5
            java.lang.String r5 = r5.realmGet$apartmentScenarioOptionId()
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4802x9a8f8638.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_OptionsRealmProxy$OptionsColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.scenario_settings.Options");
    }

    public static Options copy(Realm realm, OptionsColumnInfo optionsColumnInfo, Options options, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(options);
        if (realmObjectProxy != null) {
            return (Options) realmObjectProxy;
        }
        C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface = options;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Options.class), optionsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(optionsColumnInfo.headerIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$header());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioOptionIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionId());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioId());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioOptionTypeIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionType());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioOptionHrefIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHref());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioOptionHrefTextIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHrefText());
        osObjectBuilder.addInteger(optionsColumnInfo.apartmentScenarioOptionStateIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionState());
        osObjectBuilder.addString(optionsColumnInfo.optionNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionName());
        osObjectBuilder.addString(optionsColumnInfo.optionDescriptionIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionDescription());
        C4802x9a8f8638 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(options, newProxyInstance);
        ApartmentScenarioOptionAdd realmGet$apartmentScenarioOptionAdd = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionAdd();
        if (realmGet$apartmentScenarioOptionAdd == null) {
            newProxyInstance.realmSet$apartmentScenarioOptionAdd((ApartmentScenarioOptionAdd) null);
        } else {
            ApartmentScenarioOptionAdd apartmentScenarioOptionAdd = (ApartmentScenarioOptionAdd) map.get(realmGet$apartmentScenarioOptionAdd);
            if (apartmentScenarioOptionAdd != null) {
                newProxyInstance.realmSet$apartmentScenarioOptionAdd(apartmentScenarioOptionAdd);
            } else {
                newProxyInstance.realmSet$apartmentScenarioOptionAdd(C4798x7bd56e2e.copyOrUpdate(realm, (C4798x7bd56e2e.ApartmentScenarioOptionAddColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentScenarioOptionAdd.class), realmGet$apartmentScenarioOptionAdd, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Options options, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Options options2 = options;
        Map<RealmModel, Long> map2 = map;
        if (options2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) options2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Options.class);
        long nativePtr = table.getNativePtr();
        OptionsColumnInfo optionsColumnInfo = (OptionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Options.class);
        long j3 = optionsColumnInfo.apartmentScenarioOptionIdIndex;
        C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface = options2;
        String realmGet$apartmentScenarioOptionId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionId();
        if (realmGet$apartmentScenarioOptionId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$apartmentScenarioOptionId);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$apartmentScenarioOptionId);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$apartmentScenarioOptionId);
            j2 = j;
        }
        map2.put(options2, Long.valueOf(j2));
        String realmGet$header = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$header();
        if (realmGet$header != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.headerIndex, j2, realmGet$header, false);
        }
        String realmGet$apartmentScenarioId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioId();
        if (realmGet$apartmentScenarioId != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioIdIndex, j2, realmGet$apartmentScenarioId, false);
        }
        String realmGet$apartmentScenarioOptionType = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionType();
        if (realmGet$apartmentScenarioOptionType != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionTypeIndex, j2, realmGet$apartmentScenarioOptionType, false);
        }
        String realmGet$apartmentScenarioOptionHref = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHref();
        if (realmGet$apartmentScenarioOptionHref != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefIndex, j2, realmGet$apartmentScenarioOptionHref, false);
        }
        String realmGet$apartmentScenarioOptionHrefText = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHrefText();
        if (realmGet$apartmentScenarioOptionHrefText != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefTextIndex, j2, realmGet$apartmentScenarioOptionHrefText, false);
        }
        Integer realmGet$apartmentScenarioOptionState = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionState();
        if (realmGet$apartmentScenarioOptionState != null) {
            Table.nativeSetLong(nativePtr, optionsColumnInfo.apartmentScenarioOptionStateIndex, j2, realmGet$apartmentScenarioOptionState.longValue(), false);
        }
        String realmGet$optionName = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionName();
        if (realmGet$optionName != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.optionNameIndex, j2, realmGet$optionName, false);
        }
        String realmGet$optionDescription = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionDescription();
        if (realmGet$optionDescription != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.optionDescriptionIndex, j2, realmGet$optionDescription, false);
        }
        ApartmentScenarioOptionAdd realmGet$apartmentScenarioOptionAdd = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionAdd();
        if (realmGet$apartmentScenarioOptionAdd != null) {
            Long l = map2.get(realmGet$apartmentScenarioOptionAdd);
            if (l == null) {
                l = Long.valueOf(C4798x7bd56e2e.insert(realm2, realmGet$apartmentScenarioOptionAdd, map2));
            }
            Table.nativeSetLink(nativePtr, optionsColumnInfo.apartmentScenarioOptionAddIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Options.class);
        long nativePtr = table.getNativePtr();
        OptionsColumnInfo optionsColumnInfo = (OptionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Options.class);
        long j4 = optionsColumnInfo.apartmentScenarioOptionIdIndex;
        while (it.hasNext()) {
            Options options = (Options) it.next();
            if (!map2.containsKey(options)) {
                if (options instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) options;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(options, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface = options;
                String realmGet$apartmentScenarioOptionId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionId();
                if (realmGet$apartmentScenarioOptionId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$apartmentScenarioOptionId);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$apartmentScenarioOptionId);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$apartmentScenarioOptionId);
                    j2 = j;
                }
                map2.put(options, Long.valueOf(j2));
                String realmGet$header = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$header();
                if (realmGet$header != null) {
                    j3 = j4;
                    Table.nativeSetString(nativePtr, optionsColumnInfo.headerIndex, j2, realmGet$header, false);
                } else {
                    j3 = j4;
                }
                String realmGet$apartmentScenarioId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioId();
                if (realmGet$apartmentScenarioId != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioIdIndex, j2, realmGet$apartmentScenarioId, false);
                }
                String realmGet$apartmentScenarioOptionType = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionType();
                if (realmGet$apartmentScenarioOptionType != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionTypeIndex, j2, realmGet$apartmentScenarioOptionType, false);
                }
                String realmGet$apartmentScenarioOptionHref = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHref();
                if (realmGet$apartmentScenarioOptionHref != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefIndex, j2, realmGet$apartmentScenarioOptionHref, false);
                }
                String realmGet$apartmentScenarioOptionHrefText = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHrefText();
                if (realmGet$apartmentScenarioOptionHrefText != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefTextIndex, j2, realmGet$apartmentScenarioOptionHrefText, false);
                }
                Integer realmGet$apartmentScenarioOptionState = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionState();
                if (realmGet$apartmentScenarioOptionState != null) {
                    Table.nativeSetLong(nativePtr, optionsColumnInfo.apartmentScenarioOptionStateIndex, j2, realmGet$apartmentScenarioOptionState.longValue(), false);
                }
                String realmGet$optionName = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionName();
                if (realmGet$optionName != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.optionNameIndex, j2, realmGet$optionName, false);
                }
                String realmGet$optionDescription = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionDescription();
                if (realmGet$optionDescription != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.optionDescriptionIndex, j2, realmGet$optionDescription, false);
                }
                ApartmentScenarioOptionAdd realmGet$apartmentScenarioOptionAdd = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionAdd();
                if (realmGet$apartmentScenarioOptionAdd != null) {
                    Long l = map2.get(realmGet$apartmentScenarioOptionAdd);
                    if (l == null) {
                        l = Long.valueOf(C4798x7bd56e2e.insert(realm2, realmGet$apartmentScenarioOptionAdd, map2));
                    }
                    table.setLink(optionsColumnInfo.apartmentScenarioOptionAddIndex, j2, l.longValue(), false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Options options, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Options options2 = options;
        Map<RealmModel, Long> map2 = map;
        if (options2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) options2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Options.class);
        long nativePtr = table.getNativePtr();
        OptionsColumnInfo optionsColumnInfo = (OptionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Options.class);
        long j2 = optionsColumnInfo.apartmentScenarioOptionIdIndex;
        C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface = options2;
        String realmGet$apartmentScenarioOptionId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionId();
        if (realmGet$apartmentScenarioOptionId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$apartmentScenarioOptionId);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$apartmentScenarioOptionId) : j;
        map2.put(options2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$header = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$header();
        if (realmGet$header != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.headerIndex, createRowWithPrimaryKey, realmGet$header, false);
        } else {
            Table.nativeSetNull(nativePtr, optionsColumnInfo.headerIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$apartmentScenarioId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioId();
        if (realmGet$apartmentScenarioId != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioIdIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioId, false);
        } else {
            Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$apartmentScenarioOptionType = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionType();
        if (realmGet$apartmentScenarioOptionType != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionTypeIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioOptionType, false);
        } else {
            Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioOptionTypeIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$apartmentScenarioOptionHref = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHref();
        if (realmGet$apartmentScenarioOptionHref != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioOptionHref, false);
        } else {
            Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$apartmentScenarioOptionHrefText = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHrefText();
        if (realmGet$apartmentScenarioOptionHrefText != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefTextIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioOptionHrefText, false);
        } else {
            Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefTextIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$apartmentScenarioOptionState = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionState();
        if (realmGet$apartmentScenarioOptionState != null) {
            Table.nativeSetLong(nativePtr, optionsColumnInfo.apartmentScenarioOptionStateIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioOptionState.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioOptionStateIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$optionName = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionName();
        if (realmGet$optionName != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.optionNameIndex, createRowWithPrimaryKey, realmGet$optionName, false);
        } else {
            Table.nativeSetNull(nativePtr, optionsColumnInfo.optionNameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$optionDescription = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionDescription();
        if (realmGet$optionDescription != null) {
            Table.nativeSetString(nativePtr, optionsColumnInfo.optionDescriptionIndex, createRowWithPrimaryKey, realmGet$optionDescription, false);
        } else {
            Table.nativeSetNull(nativePtr, optionsColumnInfo.optionDescriptionIndex, createRowWithPrimaryKey, false);
        }
        ApartmentScenarioOptionAdd realmGet$apartmentScenarioOptionAdd = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionAdd();
        if (realmGet$apartmentScenarioOptionAdd != null) {
            Long l = map2.get(realmGet$apartmentScenarioOptionAdd);
            if (l == null) {
                l = Long.valueOf(C4798x7bd56e2e.insertOrUpdate(realm2, realmGet$apartmentScenarioOptionAdd, map2));
            }
            Table.nativeSetLink(nativePtr, optionsColumnInfo.apartmentScenarioOptionAddIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, optionsColumnInfo.apartmentScenarioOptionAddIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Options.class);
        long nativePtr = table.getNativePtr();
        OptionsColumnInfo optionsColumnInfo = (OptionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Options.class);
        long j3 = optionsColumnInfo.apartmentScenarioOptionIdIndex;
        while (it.hasNext()) {
            Options options = (Options) it.next();
            if (!map2.containsKey(options)) {
                if (options instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) options;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(options, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface = options;
                String realmGet$apartmentScenarioOptionId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionId();
                if (realmGet$apartmentScenarioOptionId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$apartmentScenarioOptionId);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$apartmentScenarioOptionId) : j;
                map2.put(options, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$header = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$header();
                if (realmGet$header != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, optionsColumnInfo.headerIndex, createRowWithPrimaryKey, realmGet$header, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, optionsColumnInfo.headerIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$apartmentScenarioId = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioId();
                if (realmGet$apartmentScenarioId != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioIdIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioId, false);
                } else {
                    Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$apartmentScenarioOptionType = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionType();
                if (realmGet$apartmentScenarioOptionType != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionTypeIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioOptionType, false);
                } else {
                    Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioOptionTypeIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$apartmentScenarioOptionHref = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHref();
                if (realmGet$apartmentScenarioOptionHref != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioOptionHref, false);
                } else {
                    Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$apartmentScenarioOptionHrefText = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionHrefText();
                if (realmGet$apartmentScenarioOptionHrefText != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefTextIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioOptionHrefText, false);
                } else {
                    Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioOptionHrefTextIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$apartmentScenarioOptionState = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionState();
                if (realmGet$apartmentScenarioOptionState != null) {
                    Table.nativeSetLong(nativePtr, optionsColumnInfo.apartmentScenarioOptionStateIndex, createRowWithPrimaryKey, realmGet$apartmentScenarioOptionState.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, optionsColumnInfo.apartmentScenarioOptionStateIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$optionName = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionName();
                if (realmGet$optionName != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.optionNameIndex, createRowWithPrimaryKey, realmGet$optionName, false);
                } else {
                    Table.nativeSetNull(nativePtr, optionsColumnInfo.optionNameIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$optionDescription = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$optionDescription();
                if (realmGet$optionDescription != null) {
                    Table.nativeSetString(nativePtr, optionsColumnInfo.optionDescriptionIndex, createRowWithPrimaryKey, realmGet$optionDescription, false);
                } else {
                    Table.nativeSetNull(nativePtr, optionsColumnInfo.optionDescriptionIndex, createRowWithPrimaryKey, false);
                }
                ApartmentScenarioOptionAdd realmGet$apartmentScenarioOptionAdd = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmGet$apartmentScenarioOptionAdd();
                if (realmGet$apartmentScenarioOptionAdd != null) {
                    Long l = map2.get(realmGet$apartmentScenarioOptionAdd);
                    if (l == null) {
                        l = Long.valueOf(C4798x7bd56e2e.insertOrUpdate(realm2, realmGet$apartmentScenarioOptionAdd, map2));
                    }
                    Table.nativeSetLink(nativePtr, optionsColumnInfo.apartmentScenarioOptionAddIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, optionsColumnInfo.apartmentScenarioOptionAddIndex, createRowWithPrimaryKey);
                }
                j3 = j2;
            }
        }
    }

    public static Options createDetachedCopy(Options options, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Options options2;
        if (i > i2 || options == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(options);
        if (cacheData == null) {
            options2 = new Options();
            map.put(options, new RealmObjectProxy.CacheData(i, options2));
        } else if (i >= cacheData.minDepth) {
            return (Options) cacheData.object;
        } else {
            cacheData.minDepth = i;
            options2 = (Options) cacheData.object;
        }
        C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface = options2;
        C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2 = options;
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$header(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$header());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionId(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionId());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioId(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioId());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionType(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionType());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionHref(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionHref());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionHrefText(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionHrefText());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionState(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionState());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$optionName(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$optionName());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$optionDescription(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$optionDescription());
        ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface.realmSet$apartmentScenarioOptionAdd(C4798x7bd56e2e.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionAdd(), i + 1, i2, map));
        return options2;
    }

    static Options update(Realm realm, OptionsColumnInfo optionsColumnInfo, Options options, Options options2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface = options;
        C4803x4cff85e1 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2 = options2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Options.class), optionsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(optionsColumnInfo.headerIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$header());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioOptionIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionId());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioId());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioOptionTypeIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionType());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioOptionHrefIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionHref());
        osObjectBuilder.addString(optionsColumnInfo.apartmentScenarioOptionHrefTextIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionHrefText());
        osObjectBuilder.addInteger(optionsColumnInfo.apartmentScenarioOptionStateIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionState());
        osObjectBuilder.addString(optionsColumnInfo.optionNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$optionName());
        osObjectBuilder.addString(optionsColumnInfo.optionDescriptionIndex, ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$optionDescription());
        ApartmentScenarioOptionAdd realmGet$apartmentScenarioOptionAdd = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxyinterface2.realmGet$apartmentScenarioOptionAdd();
        if (realmGet$apartmentScenarioOptionAdd == null) {
            osObjectBuilder.addNull(optionsColumnInfo.apartmentScenarioOptionAddIndex);
        } else {
            ApartmentScenarioOptionAdd apartmentScenarioOptionAdd = (ApartmentScenarioOptionAdd) map.get(realmGet$apartmentScenarioOptionAdd);
            if (apartmentScenarioOptionAdd != null) {
                osObjectBuilder.addObject(optionsColumnInfo.apartmentScenarioOptionAddIndex, apartmentScenarioOptionAdd);
            } else {
                osObjectBuilder.addObject(optionsColumnInfo.apartmentScenarioOptionAddIndex, C4798x7bd56e2e.copyOrUpdate(realm, (C4798x7bd56e2e.ApartmentScenarioOptionAddColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentScenarioOptionAdd.class), realmGet$apartmentScenarioOptionAdd, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return options;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Options = proxy[");
        sb.append("{header:");
        String str = "null";
        sb.append(realmGet$header() != null ? realmGet$header() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentScenarioOptionId:");
        sb.append(realmGet$apartmentScenarioOptionId() != null ? realmGet$apartmentScenarioOptionId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentScenarioId:");
        sb.append(realmGet$apartmentScenarioId() != null ? realmGet$apartmentScenarioId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentScenarioOptionType:");
        sb.append(realmGet$apartmentScenarioOptionType() != null ? realmGet$apartmentScenarioOptionType() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentScenarioOptionHref:");
        sb.append(realmGet$apartmentScenarioOptionHref() != null ? realmGet$apartmentScenarioOptionHref() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentScenarioOptionHrefText:");
        sb.append(realmGet$apartmentScenarioOptionHrefText() != null ? realmGet$apartmentScenarioOptionHrefText() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentScenarioOptionState:");
        sb.append(realmGet$apartmentScenarioOptionState() != null ? realmGet$apartmentScenarioOptionState() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{optionName:");
        sb.append(realmGet$optionName() != null ? realmGet$optionName() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{optionDescription:");
        sb.append(realmGet$optionDescription() != null ? realmGet$optionDescription() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentScenarioOptionAdd:");
        if (realmGet$apartmentScenarioOptionAdd() != null) {
            str = C4798x7bd56e2e.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4802x9a8f8638 ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxy = (C4802x9a8f8638) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_optionsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
