package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ManagePermissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;
import p046io.realm.BaseRealm;
import p046io.realm.C4764xd43a5daf;
import p046io.realm.C4770xc85b1268;
import p046io.realm.C4772xa5d8f71d;
import p046io.realm.C4774x33c567d4;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy */
public class C4768x32c48847 extends Rent implements RealmObjectProxy, C4769x39a64b2 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentColumnInfo columnInfo;
    private ProxyState<Rent> proxyState;
    private RealmList<Renters> rentersRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Rent";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy$RentColumnInfo */
    static final class RentColumnInfo extends ColumnInfo {
        long canManageIndex;
        long finishDateHumanIndex;
        long finishDateIndex;
        long idIndex;
        long maxColumnIndexValue;
        long ownerContractorIdIndex;
        long propertyIdIndex;
        long rentersIndex;
        long startDateHumanIndex;
        long startDateIndex;
        long stateIndex;
        long talkingInfoIndex;
        long timezoneIndex;

        RentColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.propertyIdIndex = addColumnDetails("propertyId", "propertyId", objectSchemaInfo);
            this.ownerContractorIdIndex = addColumnDetails("ownerContractorId", "ownerContractorId", objectSchemaInfo);
            this.startDateIndex = addColumnDetails("startDate", "startDate", objectSchemaInfo);
            this.finishDateIndex = addColumnDetails("finishDate", "finishDate", objectSchemaInfo);
            this.startDateHumanIndex = addColumnDetails("startDateHuman", "startDateHuman", objectSchemaInfo);
            this.finishDateHumanIndex = addColumnDetails("finishDateHuman", "finishDateHuman", objectSchemaInfo);
            this.timezoneIndex = addColumnDetails("timezone", "timezone", objectSchemaInfo);
            this.stateIndex = addColumnDetails("state", "state", objectSchemaInfo);
            this.rentersIndex = addColumnDetails("renters", "renters", objectSchemaInfo);
            this.canManageIndex = addColumnDetails("canManage", "canManage", objectSchemaInfo);
            this.talkingInfoIndex = addColumnDetails("talkingInfo", "talkingInfo", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentColumnInfo rentColumnInfo = (RentColumnInfo) columnInfo;
            RentColumnInfo rentColumnInfo2 = (RentColumnInfo) columnInfo2;
            rentColumnInfo2.idIndex = rentColumnInfo.idIndex;
            rentColumnInfo2.propertyIdIndex = rentColumnInfo.propertyIdIndex;
            rentColumnInfo2.ownerContractorIdIndex = rentColumnInfo.ownerContractorIdIndex;
            rentColumnInfo2.startDateIndex = rentColumnInfo.startDateIndex;
            rentColumnInfo2.finishDateIndex = rentColumnInfo.finishDateIndex;
            rentColumnInfo2.startDateHumanIndex = rentColumnInfo.startDateHumanIndex;
            rentColumnInfo2.finishDateHumanIndex = rentColumnInfo.finishDateHumanIndex;
            rentColumnInfo2.timezoneIndex = rentColumnInfo.timezoneIndex;
            rentColumnInfo2.stateIndex = rentColumnInfo.stateIndex;
            rentColumnInfo2.rentersIndex = rentColumnInfo.rentersIndex;
            rentColumnInfo2.canManageIndex = rentColumnInfo.canManageIndex;
            rentColumnInfo2.talkingInfoIndex = rentColumnInfo.talkingInfoIndex;
            rentColumnInfo2.maxColumnIndexValue = rentColumnInfo.maxColumnIndexValue;
        }
    }

    C4768x32c48847() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentColumnInfo) realmObjectContext.getColumnInfo();
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

    public Integer realmGet$propertyId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.propertyIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.propertyIdIndex));
    }

    public void realmSet$propertyId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.propertyIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.propertyIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.propertyIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.propertyIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$ownerContractorId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.ownerContractorIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.ownerContractorIdIndex));
    }

    public void realmSet$ownerContractorId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ownerContractorIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.ownerContractorIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.ownerContractorIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.ownerContractorIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public long realmGet$startDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.startDateIndex);
    }

    public void realmSet$startDate(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.startDateIndex, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.startDateIndex, row$realm.getIndex(), j, true);
        }
    }

    public long realmGet$finishDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.finishDateIndex);
    }

    public void realmSet$finishDate(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.finishDateIndex, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.finishDateIndex, row$realm.getIndex(), j, true);
        }
    }

    public String realmGet$startDateHuman() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.startDateHumanIndex);
    }

    public void realmSet$startDateHuman(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.startDateHumanIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.startDateHumanIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.startDateHumanIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.startDateHumanIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$finishDateHuman() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.finishDateHumanIndex);
    }

    public void realmSet$finishDateHuman(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.finishDateHumanIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.finishDateHumanIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.finishDateHumanIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.finishDateHumanIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$timezone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.timezoneIndex);
    }

    public void realmSet$timezone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.timezoneIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.timezoneIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.timezoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.timezoneIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RentState realmGet$state() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.stateIndex)) {
            return null;
        }
        return (RentState) this.proxyState.getRealm$realm().get(RentState.class, this.proxyState.getRow$realm().getLink(this.columnInfo.stateIndex), false, Collections.emptyList());
    }

    public void realmSet$state(RentState rentState) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (rentState == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.stateIndex);
                return;
            }
            this.proxyState.checkValidObject(rentState);
            this.proxyState.getRow$realm().setLink(this.columnInfo.stateIndex, ((RealmObjectProxy) rentState).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("state")) {
            if (rentState != null && !RealmObject.isManaged(rentState)) {
                rentState = (RentState) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(rentState, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (rentState == null) {
                row$realm.nullifyLink(this.columnInfo.stateIndex);
                return;
            }
            this.proxyState.checkValidObject(rentState);
            row$realm.getTable().setLink(this.columnInfo.stateIndex, row$realm.getIndex(), ((RealmObjectProxy) rentState).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RealmList<Renters> realmGet$renters() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Renters> realmList = this.rentersRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.rentersRealmList = new RealmList<>(Renters.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.rentersIndex), this.proxyState.getRealm$realm());
        return this.rentersRealmList;
    }

    public void realmSet$renters(RealmList<Renters> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("renters")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Renters> realmList2 = new RealmList<>();
                Iterator<Renters> it = realmList.iterator();
                while (it.hasNext()) {
                    Renters next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.rentersIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Renters renters = realmList.get(i);
                    this.proxyState.checkValidObject(renters);
                    modelList.addRow(((RealmObjectProxy) renters).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Renters renters2 = realmList.get(i);
            this.proxyState.checkValidObject(renters2);
            modelList.setRow((long) i, ((RealmObjectProxy) renters2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public ManagePermissions realmGet$canManage() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.canManageIndex)) {
            return null;
        }
        return (ManagePermissions) this.proxyState.getRealm$realm().get(ManagePermissions.class, this.proxyState.getRow$realm().getLink(this.columnInfo.canManageIndex), false, Collections.emptyList());
    }

    public void realmSet$canManage(ManagePermissions managePermissions) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (managePermissions == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.canManageIndex);
                return;
            }
            this.proxyState.checkValidObject(managePermissions);
            this.proxyState.getRow$realm().setLink(this.columnInfo.canManageIndex, ((RealmObjectProxy) managePermissions).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("canManage")) {
            if (managePermissions != null && !RealmObject.isManaged(managePermissions)) {
                managePermissions = (ManagePermissions) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(managePermissions, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (managePermissions == null) {
                row$realm.nullifyLink(this.columnInfo.canManageIndex);
                return;
            }
            this.proxyState.checkValidObject(managePermissions);
            row$realm.getTable().setLink(this.columnInfo.canManageIndex, row$realm.getIndex(), ((RealmObjectProxy) managePermissions).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public TalkingInfo realmGet$talkingInfo() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.talkingInfoIndex)) {
            return null;
        }
        return (TalkingInfo) this.proxyState.getRealm$realm().get(TalkingInfo.class, this.proxyState.getRow$realm().getLink(this.columnInfo.talkingInfoIndex), false, Collections.emptyList());
    }

    public void realmSet$talkingInfo(TalkingInfo talkingInfo) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (talkingInfo == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.talkingInfoIndex);
                return;
            }
            this.proxyState.checkValidObject(talkingInfo);
            this.proxyState.getRow$realm().setLink(this.columnInfo.talkingInfoIndex, ((RealmObjectProxy) talkingInfo).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("talkingInfo")) {
            if (talkingInfo != null && !RealmObject.isManaged(talkingInfo)) {
                talkingInfo = (TalkingInfo) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(talkingInfo, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (talkingInfo == null) {
                row$realm.nullifyLink(this.columnInfo.talkingInfoIndex);
                return;
            }
            this.proxyState.checkValidObject(talkingInfo);
            row$realm.getTable().setLink(this.columnInfo.talkingInfoIndex, row$realm.getIndex(), ((RealmObjectProxy) talkingInfo).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 12, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("propertyId", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("ownerContractorId", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("startDate", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("finishDate", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("startDateHuman", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("finishDateHuman", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("timezone", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("state", RealmFieldType.OBJECT, C4770xc85b1268.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("renters", RealmFieldType.LIST, C4772xa5d8f71d.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("canManage", RealmFieldType.OBJECT, C4764xd43a5daf.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("talkingInfo", RealmFieldType.OBJECT, C4774x33c567d4.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy$RentColumnInfo r4 = (p046io.realm.C4768x32c48847.RentColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "talkingInfo"
            java.lang.String r5 = "canManage"
            java.lang.String r6 = "renters"
            java.lang.String r7 = "state"
            if (r3 != 0) goto L_0x00c2
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x007a
            r0.add(r7)
        L_0x007a:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0083
            r0.add(r6)
        L_0x0083:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x008c
            r0.add(r5)
        L_0x008c:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0095
            r0.add(r4)
        L_0x0095:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00ba
            boolean r3 = r14.isNull(r1)
            r8 = 1
            if (r3 == 0) goto L_0x00ac
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy r3 = (p046io.realm.C4768x32c48847) r3
            goto L_0x00c2
        L_0x00ac:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy r3 = (p046io.realm.C4768x32c48847) r3
            goto L_0x00c2
        L_0x00ba:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00c2:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxyInterface r0 = (p046io.realm.C4769x39a64b2) r0
            java.lang.String r1 = "propertyId"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x00e2
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00d7
            r0.realmSet$propertyId(r2)
            goto L_0x00e2
        L_0x00d7:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$propertyId(r1)
        L_0x00e2:
            java.lang.String r1 = "ownerContractorId"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x00ff
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00f4
            r0.realmSet$ownerContractorId(r2)
            goto L_0x00ff
        L_0x00f4:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$ownerContractorId(r1)
        L_0x00ff:
            java.lang.String r1 = "startDate"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x011d
            boolean r8 = r14.isNull(r1)
            if (r8 != 0) goto L_0x0115
            long r8 = r14.getLong(r1)
            r0.realmSet$startDate(r8)
            goto L_0x011d
        L_0x0115:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'startDate' to null."
            r13.<init>(r14)
            throw r13
        L_0x011d:
            java.lang.String r1 = "finishDate"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x013b
            boolean r8 = r14.isNull(r1)
            if (r8 != 0) goto L_0x0133
            long r8 = r14.getLong(r1)
            r0.realmSet$finishDate(r8)
            goto L_0x013b
        L_0x0133:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'finishDate' to null."
            r13.<init>(r14)
            throw r13
        L_0x013b:
            java.lang.String r1 = "startDateHuman"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0154
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x014d
            r0.realmSet$startDateHuman(r2)
            goto L_0x0154
        L_0x014d:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$startDateHuman(r1)
        L_0x0154:
            java.lang.String r1 = "finishDateHuman"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x016d
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0166
            r0.realmSet$finishDateHuman(r2)
            goto L_0x016d
        L_0x0166:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$finishDateHuman(r1)
        L_0x016d:
            java.lang.String r1 = "timezone"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0186
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x017f
            r0.realmSet$timezone(r2)
            goto L_0x0186
        L_0x017f:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$timezone(r1)
        L_0x0186:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x01a1
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0196
            r0.realmSet$state(r2)
            goto L_0x01a1
        L_0x0196:
            org.json.JSONObject r1 = r14.getJSONObject(r7)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentState r1 = p046io.realm.C4770xc85b1268.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$state(r1)
        L_0x01a1:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x01d5
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x01b1
            r0.realmSet$renters(r2)
            goto L_0x01d5
        L_0x01b1:
            io.realm.RealmList r1 = r0.realmGet$renters()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r6)
            r6 = 0
        L_0x01bd:
            int r7 = r1.length()
            if (r6 >= r7) goto L_0x01d5
            org.json.JSONObject r7 = r1.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r7 = p046io.realm.C4772xa5d8f71d.createOrUpdateUsingJsonObject(r13, r7, r15)
            io.realm.RealmList r8 = r0.realmGet$renters()
            r8.add(r7)
            int r6 = r6 + 1
            goto L_0x01bd
        L_0x01d5:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x01f0
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x01e5
            r0.realmSet$canManage(r2)
            goto L_0x01f0
        L_0x01e5:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ManagePermissions r1 = p046io.realm.C4764xd43a5daf.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$canManage(r1)
        L_0x01f0:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x020b
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x0200
            r0.realmSet$talkingInfo(r2)
            goto L_0x020b
        L_0x0200:
            org.json.JSONObject r14 = r14.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r13 = p046io.realm.C4774x33c567d4.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$talkingInfo(r13)
        L_0x020b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4768x32c48847.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent");
    }

    public static Rent createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Rent rent = new Rent();
        C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface = rent;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("propertyId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$propertyId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$propertyId((Integer) null);
                }
            } else if (nextName.equals("ownerContractorId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$ownerContractorId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$ownerContractorId((Integer) null);
                }
            } else if (nextName.equals("startDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$startDate(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'startDate' to null.");
                }
            } else if (nextName.equals("finishDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$finishDate(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'finishDate' to null.");
                }
            } else if (nextName.equals("startDateHuman")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$startDateHuman(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$startDateHuman((String) null);
                }
            } else if (nextName.equals("finishDateHuman")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$finishDateHuman(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$finishDateHuman((String) null);
                }
            } else if (nextName.equals("timezone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$timezone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$timezone((String) null);
                }
            } else if (nextName.equals("state")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$state((RentState) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$state(C4770xc85b1268.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("renters")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$renters((RealmList<Renters>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$renters(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$renters().add(C4772xa5d8f71d.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("canManage")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$canManage((ManagePermissions) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$canManage(C4764xd43a5daf.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("talkingInfo")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$talkingInfo((TalkingInfo) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$talkingInfo(C4774x33c567d4.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Rent) realm.copyToRealm(rent, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4768x32c48847 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Rent.class), false, Collections.emptyList());
        C4768x32c48847 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxy = new C4768x32c48847();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4768x32c48847.RentColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxyInterface r5 = (p046io.realm.C4769x39a64b2) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4768x32c48847.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentRealmProxy$RentColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Rent");
    }

    public static Rent copy(Realm realm, RentColumnInfo rentColumnInfo, Rent rent, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        RentColumnInfo rentColumnInfo2 = rentColumnInfo;
        Rent rent2 = rent;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(rent2);
        if (realmObjectProxy != null) {
            return (Rent) realmObjectProxy;
        }
        C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface = rent2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Rent.class), rentColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentColumnInfo2.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(rentColumnInfo2.propertyIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$propertyId());
        osObjectBuilder.addInteger(rentColumnInfo2.ownerContractorIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$ownerContractorId());
        osObjectBuilder.addInteger(rentColumnInfo2.startDateIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDate()));
        osObjectBuilder.addInteger(rentColumnInfo2.finishDateIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDate()));
        osObjectBuilder.addString(rentColumnInfo2.startDateHumanIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDateHuman());
        osObjectBuilder.addString(rentColumnInfo2.finishDateHumanIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDateHuman());
        osObjectBuilder.addString(rentColumnInfo2.timezoneIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$timezone());
        C4768x32c48847 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(rent2, newProxyInstance);
        RentState realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$state();
        if (realmGet$state == null) {
            newProxyInstance.realmSet$state((RentState) null);
        } else {
            RentState rentState = (RentState) map2.get(realmGet$state);
            if (rentState != null) {
                newProxyInstance.realmSet$state(rentState);
            } else {
                newProxyInstance.realmSet$state(C4770xc85b1268.copyOrUpdate(realm, (C4770xc85b1268.RentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentState.class), realmGet$state, z, map, set));
            }
        }
        RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$renters();
        if (realmGet$renters != null) {
            RealmList<Renters> realmGet$renters2 = newProxyInstance.realmGet$renters();
            realmGet$renters2.clear();
            for (int i = 0; i < realmGet$renters.size(); i++) {
                Renters renters = realmGet$renters.get(i);
                Renters renters2 = (Renters) map2.get(renters);
                if (renters2 != null) {
                    realmGet$renters2.add(renters2);
                } else {
                    realmGet$renters2.add(C4772xa5d8f71d.copyOrUpdate(realm, (C4772xa5d8f71d.RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class), renters, z, map, set));
                }
            }
        }
        ManagePermissions realmGet$canManage = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$canManage();
        if (realmGet$canManage == null) {
            newProxyInstance.realmSet$canManage((ManagePermissions) null);
        } else {
            ManagePermissions managePermissions = (ManagePermissions) map2.get(realmGet$canManage);
            if (managePermissions != null) {
                newProxyInstance.realmSet$canManage(managePermissions);
            } else {
                newProxyInstance.realmSet$canManage(C4764xd43a5daf.copyOrUpdate(realm, (C4764xd43a5daf.ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class), realmGet$canManage, z, map, set));
            }
        }
        TalkingInfo realmGet$talkingInfo = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$talkingInfo();
        if (realmGet$talkingInfo == null) {
            newProxyInstance.realmSet$talkingInfo((TalkingInfo) null);
        } else {
            TalkingInfo talkingInfo = (TalkingInfo) map2.get(realmGet$talkingInfo);
            if (talkingInfo != null) {
                newProxyInstance.realmSet$talkingInfo(talkingInfo);
            } else {
                newProxyInstance.realmSet$talkingInfo(C4774x33c567d4.copyOrUpdate(realm, (C4774x33c567d4.TalkingInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingInfo.class), realmGet$talkingInfo, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Rent rent, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Rent rent2 = rent;
        Map<RealmModel, Long> map2 = map;
        if (rent2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rent2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Rent.class);
        long nativePtr = table.getNativePtr();
        RentColumnInfo rentColumnInfo = (RentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Rent.class);
        long j6 = rentColumnInfo.idIndex;
        C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface = rent2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$id();
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
        map2.put(rent2, Long.valueOf(j2));
        Integer realmGet$propertyId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$propertyId();
        if (realmGet$propertyId != null) {
            j3 = j2;
            Table.nativeSetLong(nativePtr, rentColumnInfo.propertyIdIndex, j2, realmGet$propertyId.longValue(), false);
        } else {
            j3 = j2;
        }
        Integer realmGet$ownerContractorId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$ownerContractorId();
        if (realmGet$ownerContractorId != null) {
            Table.nativeSetLong(nativePtr, rentColumnInfo.ownerContractorIdIndex, j3, realmGet$ownerContractorId.longValue(), false);
        }
        long j7 = nativePtr;
        long j8 = j3;
        Table.nativeSetLong(j7, rentColumnInfo.startDateIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDate(), false);
        Table.nativeSetLong(j7, rentColumnInfo.finishDateIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDate(), false);
        String realmGet$startDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDateHuman();
        if (realmGet$startDateHuman != null) {
            Table.nativeSetString(nativePtr, rentColumnInfo.startDateHumanIndex, j3, realmGet$startDateHuman, false);
        }
        String realmGet$finishDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDateHuman();
        if (realmGet$finishDateHuman != null) {
            Table.nativeSetString(nativePtr, rentColumnInfo.finishDateHumanIndex, j3, realmGet$finishDateHuman, false);
        }
        String realmGet$timezone = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$timezone();
        if (realmGet$timezone != null) {
            Table.nativeSetString(nativePtr, rentColumnInfo.timezoneIndex, j3, realmGet$timezone, false);
        }
        RentState realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Long l = map2.get(realmGet$state);
            if (l == null) {
                l = Long.valueOf(C4770xc85b1268.insert(realm2, realmGet$state, map2));
            }
            Table.nativeSetLink(nativePtr, rentColumnInfo.stateIndex, j3, l.longValue(), false);
        }
        RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$renters();
        if (realmGet$renters != null) {
            j4 = j3;
            OsList osList = new OsList(table.getUncheckedRow(j4), rentColumnInfo.rentersIndex);
            Iterator<Renters> it = realmGet$renters.iterator();
            while (it.hasNext()) {
                Renters next = it.next();
                Long l2 = map2.get(next);
                if (l2 == null) {
                    l2 = Long.valueOf(C4772xa5d8f71d.insert(realm2, next, map2));
                }
                osList.addRow(l2.longValue());
            }
        } else {
            j4 = j3;
        }
        ManagePermissions realmGet$canManage = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$canManage();
        if (realmGet$canManage != null) {
            Long l3 = map2.get(realmGet$canManage);
            if (l3 == null) {
                l3 = Long.valueOf(C4764xd43a5daf.insert(realm2, realmGet$canManage, map2));
            }
            j5 = j4;
            Table.nativeSetLink(nativePtr, rentColumnInfo.canManageIndex, j4, l3.longValue(), false);
        } else {
            j5 = j4;
        }
        TalkingInfo realmGet$talkingInfo = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$talkingInfo();
        if (realmGet$talkingInfo != null) {
            Long l4 = map2.get(realmGet$talkingInfo);
            if (l4 == null) {
                l4 = Long.valueOf(C4774x33c567d4.insert(realm2, realmGet$talkingInfo, map2));
            }
            Table.nativeSetLink(nativePtr, rentColumnInfo.talkingInfoIndex, j5, l4.longValue(), false);
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Rent.class);
        long nativePtr = table.getNativePtr();
        RentColumnInfo rentColumnInfo = (RentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Rent.class);
        long j7 = rentColumnInfo.idIndex;
        while (it.hasNext()) {
            Rent rent = (Rent) it.next();
            if (!map2.containsKey(rent)) {
                if (rent instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rent;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rent, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface = rent;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j7);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j7, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j7, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(rent, Long.valueOf(j2));
                Integer realmGet$propertyId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$propertyId();
                if (realmGet$propertyId != null) {
                    j4 = j2;
                    j3 = j7;
                    Table.nativeSetLong(nativePtr, rentColumnInfo.propertyIdIndex, j2, realmGet$propertyId.longValue(), false);
                } else {
                    j4 = j2;
                    j3 = j7;
                }
                Integer realmGet$ownerContractorId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$ownerContractorId();
                if (realmGet$ownerContractorId != null) {
                    Table.nativeSetLong(nativePtr, rentColumnInfo.ownerContractorIdIndex, j4, realmGet$ownerContractorId.longValue(), false);
                }
                long j8 = nativePtr;
                long j9 = j4;
                Table.nativeSetLong(j8, rentColumnInfo.startDateIndex, j9, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDate(), false);
                Table.nativeSetLong(j8, rentColumnInfo.finishDateIndex, j9, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDate(), false);
                String realmGet$startDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDateHuman();
                if (realmGet$startDateHuman != null) {
                    Table.nativeSetString(nativePtr, rentColumnInfo.startDateHumanIndex, j4, realmGet$startDateHuman, false);
                }
                String realmGet$finishDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDateHuman();
                if (realmGet$finishDateHuman != null) {
                    Table.nativeSetString(nativePtr, rentColumnInfo.finishDateHumanIndex, j4, realmGet$finishDateHuman, false);
                }
                String realmGet$timezone = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$timezone();
                if (realmGet$timezone != null) {
                    Table.nativeSetString(nativePtr, rentColumnInfo.timezoneIndex, j4, realmGet$timezone, false);
                }
                RentState realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Long l = map2.get(realmGet$state);
                    if (l == null) {
                        l = Long.valueOf(C4770xc85b1268.insert(realm2, realmGet$state, map2));
                    }
                    table.setLink(rentColumnInfo.stateIndex, j4, l.longValue(), false);
                }
                RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$renters();
                if (realmGet$renters != null) {
                    j5 = j4;
                    OsList osList = new OsList(table.getUncheckedRow(j5), rentColumnInfo.rentersIndex);
                    Iterator<Renters> it2 = realmGet$renters.iterator();
                    while (it2.hasNext()) {
                        Renters next = it2.next();
                        Long l2 = map2.get(next);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4772xa5d8f71d.insert(realm2, next, map2));
                        }
                        osList.addRow(l2.longValue());
                    }
                } else {
                    j5 = j4;
                }
                ManagePermissions realmGet$canManage = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$canManage();
                if (realmGet$canManage != null) {
                    Long l3 = map2.get(realmGet$canManage);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4764xd43a5daf.insert(realm2, realmGet$canManage, map2));
                    }
                    j6 = j5;
                    table.setLink(rentColumnInfo.canManageIndex, j5, l3.longValue(), false);
                } else {
                    j6 = j5;
                }
                TalkingInfo realmGet$talkingInfo = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$talkingInfo();
                if (realmGet$talkingInfo != null) {
                    Long l4 = map2.get(realmGet$talkingInfo);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4774x33c567d4.insert(realm2, realmGet$talkingInfo, map2));
                    }
                    table.setLink(rentColumnInfo.talkingInfoIndex, j6, l4.longValue(), false);
                }
                j7 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Rent rent, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Rent rent2 = rent;
        Map<RealmModel, Long> map2 = map;
        if (rent2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rent2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Rent.class);
        long nativePtr = table.getNativePtr();
        RentColumnInfo rentColumnInfo = (RentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Rent.class);
        long j4 = rentColumnInfo.idIndex;
        C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface = rent2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
        map2.put(rent2, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$propertyId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$propertyId();
        if (realmGet$propertyId != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetLong(nativePtr, rentColumnInfo.propertyIdIndex, createRowWithPrimaryKey, realmGet$propertyId.longValue(), false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, rentColumnInfo.propertyIdIndex, j2, false);
        }
        Integer realmGet$ownerContractorId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$ownerContractorId();
        if (realmGet$ownerContractorId != null) {
            Table.nativeSetLong(nativePtr, rentColumnInfo.ownerContractorIdIndex, j2, realmGet$ownerContractorId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentColumnInfo.ownerContractorIdIndex, j2, false);
        }
        long j5 = nativePtr;
        long j6 = j2;
        Table.nativeSetLong(j5, rentColumnInfo.startDateIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDate(), false);
        Table.nativeSetLong(j5, rentColumnInfo.finishDateIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDate(), false);
        String realmGet$startDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDateHuman();
        if (realmGet$startDateHuman != null) {
            Table.nativeSetString(nativePtr, rentColumnInfo.startDateHumanIndex, j2, realmGet$startDateHuman, false);
        } else {
            Table.nativeSetNull(nativePtr, rentColumnInfo.startDateHumanIndex, j2, false);
        }
        String realmGet$finishDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDateHuman();
        if (realmGet$finishDateHuman != null) {
            Table.nativeSetString(nativePtr, rentColumnInfo.finishDateHumanIndex, j2, realmGet$finishDateHuman, false);
        } else {
            Table.nativeSetNull(nativePtr, rentColumnInfo.finishDateHumanIndex, j2, false);
        }
        String realmGet$timezone = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$timezone();
        if (realmGet$timezone != null) {
            Table.nativeSetString(nativePtr, rentColumnInfo.timezoneIndex, j2, realmGet$timezone, false);
        } else {
            Table.nativeSetNull(nativePtr, rentColumnInfo.timezoneIndex, j2, false);
        }
        RentState realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Long l = map2.get(realmGet$state);
            if (l == null) {
                l = Long.valueOf(C4770xc85b1268.insertOrUpdate(realm2, realmGet$state, map2));
            }
            Table.nativeSetLink(nativePtr, rentColumnInfo.stateIndex, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentColumnInfo.stateIndex, j2);
        }
        long j7 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j7), rentColumnInfo.rentersIndex);
        RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$renters();
        if (realmGet$renters == null || ((long) realmGet$renters.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$renters != null) {
                Iterator<Renters> it = realmGet$renters.iterator();
                while (it.hasNext()) {
                    Renters next = it.next();
                    Long l2 = map2.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4772xa5d8f71d.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l2.longValue());
                }
            }
        } else {
            int size = realmGet$renters.size();
            for (int i = 0; i < size; i++) {
                Renters renters = realmGet$renters.get(i);
                Long l3 = map2.get(renters);
                if (l3 == null) {
                    l3 = Long.valueOf(C4772xa5d8f71d.insertOrUpdate(realm2, renters, map2));
                }
                osList.setRow((long) i, l3.longValue());
            }
        }
        ManagePermissions realmGet$canManage = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$canManage();
        if (realmGet$canManage != null) {
            Long l4 = map2.get(realmGet$canManage);
            if (l4 == null) {
                l4 = Long.valueOf(C4764xd43a5daf.insertOrUpdate(realm2, realmGet$canManage, map2));
            }
            j3 = j7;
            Table.nativeSetLink(nativePtr, rentColumnInfo.canManageIndex, j7, l4.longValue(), false);
        } else {
            j3 = j7;
            Table.nativeNullifyLink(nativePtr, rentColumnInfo.canManageIndex, j3);
        }
        TalkingInfo realmGet$talkingInfo = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$talkingInfo();
        if (realmGet$talkingInfo != null) {
            Long l5 = map2.get(realmGet$talkingInfo);
            if (l5 == null) {
                l5 = Long.valueOf(C4774x33c567d4.insertOrUpdate(realm2, realmGet$talkingInfo, map2));
            }
            Table.nativeSetLink(nativePtr, rentColumnInfo.talkingInfoIndex, j3, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentColumnInfo.talkingInfoIndex, j3);
        }
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Rent.class);
        long nativePtr = table.getNativePtr();
        RentColumnInfo rentColumnInfo = (RentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Rent.class);
        long j6 = rentColumnInfo.idIndex;
        while (it.hasNext()) {
            Rent rent = (Rent) it.next();
            if (!map2.containsKey(rent)) {
                if (rent instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rent;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rent, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface = rent;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j6, realmGet$id) : j;
                map2.put(rent, Long.valueOf(createRowWithPrimaryKey));
                Integer realmGet$propertyId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$propertyId();
                if (realmGet$propertyId != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j6;
                    Table.nativeSetLong(nativePtr, rentColumnInfo.propertyIdIndex, createRowWithPrimaryKey, realmGet$propertyId.longValue(), false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j6;
                    Table.nativeSetNull(nativePtr, rentColumnInfo.propertyIdIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$ownerContractorId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$ownerContractorId();
                if (realmGet$ownerContractorId != null) {
                    Table.nativeSetLong(nativePtr, rentColumnInfo.ownerContractorIdIndex, j3, realmGet$ownerContractorId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentColumnInfo.ownerContractorIdIndex, j3, false);
                }
                long j7 = nativePtr;
                long j8 = j3;
                Table.nativeSetLong(j7, rentColumnInfo.startDateIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDate(), false);
                Table.nativeSetLong(j7, rentColumnInfo.finishDateIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDate(), false);
                String realmGet$startDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$startDateHuman();
                if (realmGet$startDateHuman != null) {
                    Table.nativeSetString(nativePtr, rentColumnInfo.startDateHumanIndex, j3, realmGet$startDateHuman, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentColumnInfo.startDateHumanIndex, j3, false);
                }
                String realmGet$finishDateHuman = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$finishDateHuman();
                if (realmGet$finishDateHuman != null) {
                    Table.nativeSetString(nativePtr, rentColumnInfo.finishDateHumanIndex, j3, realmGet$finishDateHuman, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentColumnInfo.finishDateHumanIndex, j3, false);
                }
                String realmGet$timezone = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$timezone();
                if (realmGet$timezone != null) {
                    Table.nativeSetString(nativePtr, rentColumnInfo.timezoneIndex, j3, realmGet$timezone, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentColumnInfo.timezoneIndex, j3, false);
                }
                RentState realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Long l = map2.get(realmGet$state);
                    if (l == null) {
                        l = Long.valueOf(C4770xc85b1268.insertOrUpdate(realm2, realmGet$state, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentColumnInfo.stateIndex, j3, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentColumnInfo.stateIndex, j3);
                }
                long j9 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j9), rentColumnInfo.rentersIndex);
                RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$renters();
                if (realmGet$renters == null || ((long) realmGet$renters.size()) != osList.size()) {
                    j4 = j9;
                    osList.removeAll();
                    if (realmGet$renters != null) {
                        Iterator<Renters> it2 = realmGet$renters.iterator();
                        while (it2.hasNext()) {
                            Renters next = it2.next();
                            Long l2 = map2.get(next);
                            if (l2 == null) {
                                l2 = Long.valueOf(C4772xa5d8f71d.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l2.longValue());
                        }
                    }
                } else {
                    int size = realmGet$renters.size();
                    int i = 0;
                    while (i < size) {
                        Renters renters = realmGet$renters.get(i);
                        Long l3 = map2.get(renters);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4772xa5d8f71d.insertOrUpdate(realm2, renters, map2));
                        }
                        osList.setRow((long) i, l3.longValue());
                        i++;
                        j9 = j9;
                    }
                    j4 = j9;
                }
                ManagePermissions realmGet$canManage = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$canManage();
                if (realmGet$canManage != null) {
                    Long l4 = map2.get(realmGet$canManage);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4764xd43a5daf.insertOrUpdate(realm2, realmGet$canManage, map2));
                    }
                    j5 = j4;
                    Table.nativeSetLink(nativePtr, rentColumnInfo.canManageIndex, j4, l4.longValue(), false);
                } else {
                    j5 = j4;
                    Table.nativeNullifyLink(nativePtr, rentColumnInfo.canManageIndex, j5);
                }
                TalkingInfo realmGet$talkingInfo = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmGet$talkingInfo();
                if (realmGet$talkingInfo != null) {
                    Long l5 = map2.get(realmGet$talkingInfo);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4774x33c567d4.insertOrUpdate(realm2, realmGet$talkingInfo, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentColumnInfo.talkingInfoIndex, j5, l5.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentColumnInfo.talkingInfoIndex, j5);
                }
                j6 = j2;
            }
        }
    }

    public static Rent createDetachedCopy(Rent rent, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Rent rent2;
        if (i > i2 || rent == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rent);
        if (cacheData == null) {
            rent2 = new Rent();
            map.put(rent, new RealmObjectProxy.CacheData(i, rent2));
        } else if (i >= cacheData.minDepth) {
            return (Rent) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rent2 = (Rent) cacheData.object;
        }
        C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface = rent2;
        C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2 = rent;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$propertyId(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$propertyId());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$ownerContractorId(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$ownerContractorId());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$startDate(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$startDate());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$finishDate(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$finishDate());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$startDateHuman(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$startDateHuman());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$finishDateHuman(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$finishDateHuman());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$timezone(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$timezone());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$state(C4770xc85b1268.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$state(), i3, i2, map));
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$renters((RealmList<Renters>) null);
        } else {
            RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$renters();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$renters(realmList);
            int size = realmGet$renters.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4772xa5d8f71d.createDetachedCopy(realmGet$renters.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$canManage(C4764xd43a5daf.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$canManage(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface.realmSet$talkingInfo(C4774x33c567d4.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$talkingInfo(), i3, i2, map));
        return rent2;
    }

    static Rent update(Realm realm, RentColumnInfo rentColumnInfo, Rent rent, Rent rent2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RentColumnInfo rentColumnInfo2 = rentColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface = rent;
        C4769x39a64b2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2 = rent2;
        Realm realm2 = realm;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Rent.class), rentColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentColumnInfo2.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(rentColumnInfo2.propertyIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$propertyId());
        osObjectBuilder.addInteger(rentColumnInfo2.ownerContractorIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$ownerContractorId());
        osObjectBuilder.addInteger(rentColumnInfo2.startDateIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$startDate()));
        osObjectBuilder.addInteger(rentColumnInfo2.finishDateIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$finishDate()));
        osObjectBuilder.addString(rentColumnInfo2.startDateHumanIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$startDateHuman());
        osObjectBuilder.addString(rentColumnInfo2.finishDateHumanIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$finishDateHuman());
        osObjectBuilder.addString(rentColumnInfo2.timezoneIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$timezone());
        RentState realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$state();
        if (realmGet$state == null) {
            osObjectBuilder.addNull(rentColumnInfo2.stateIndex);
        } else {
            RentState rentState = (RentState) map2.get(realmGet$state);
            if (rentState != null) {
                osObjectBuilder.addObject(rentColumnInfo2.stateIndex, rentState);
            } else {
                osObjectBuilder.addObject(rentColumnInfo2.stateIndex, C4770xc85b1268.copyOrUpdate(realm, (C4770xc85b1268.RentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentState.class), realmGet$state, true, map, set));
            }
        }
        RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$renters();
        if (realmGet$renters != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$renters.size(); i++) {
                Renters renters = realmGet$renters.get(i);
                Renters renters2 = (Renters) map2.get(renters);
                if (renters2 != null) {
                    realmList.add(renters2);
                } else {
                    realmList.add(C4772xa5d8f71d.copyOrUpdate(realm, (C4772xa5d8f71d.RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class), renters, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(rentColumnInfo2.rentersIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(rentColumnInfo2.rentersIndex, new RealmList());
        }
        ManagePermissions realmGet$canManage = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$canManage();
        if (realmGet$canManage == null) {
            osObjectBuilder.addNull(rentColumnInfo2.canManageIndex);
        } else {
            ManagePermissions managePermissions = (ManagePermissions) map2.get(realmGet$canManage);
            if (managePermissions != null) {
                osObjectBuilder.addObject(rentColumnInfo2.canManageIndex, managePermissions);
            } else {
                osObjectBuilder.addObject(rentColumnInfo2.canManageIndex, C4764xd43a5daf.copyOrUpdate(realm, (C4764xd43a5daf.ManagePermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ManagePermissions.class), realmGet$canManage, true, map, set));
            }
        }
        TalkingInfo realmGet$talkingInfo = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxyinterface2.realmGet$talkingInfo();
        if (realmGet$talkingInfo == null) {
            osObjectBuilder.addNull(rentColumnInfo2.talkingInfoIndex);
        } else {
            TalkingInfo talkingInfo = (TalkingInfo) map2.get(realmGet$talkingInfo);
            if (talkingInfo != null) {
                osObjectBuilder.addObject(rentColumnInfo2.talkingInfoIndex, talkingInfo);
            } else {
                osObjectBuilder.addObject(rentColumnInfo2.talkingInfoIndex, C4774x33c567d4.copyOrUpdate(realm, (C4774x33c567d4.TalkingInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingInfo.class), realmGet$talkingInfo, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return rent;
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
        C4768x32c48847 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxy = (C4768x32c48847) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
