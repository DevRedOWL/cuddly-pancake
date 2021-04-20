package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Status;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser;
import p046io.realm.BaseRealm;
import p046io.realm.C4822xab1ed299;
import p046io.realm.C4824xe6f53cf6;
import p046io.realm.C4826x725684ea;
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
import p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy */
public class C4818xb7a5caf9 extends Appointment implements RealmObjectProxy, C4819x36140a40 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<FileData> attachmentsRealmList;
    private AppointmentColumnInfo columnInfo;
    private ProxyState<Appointment> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Appointment";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy$AppointmentColumnInfo */
    static final class AppointmentColumnInfo extends ColumnInfo {
        long attachmentsIndex;
        long dateIndex;
        long descriptionIndex;
        long idIndex;
        long maxColumnIndexValue;
        long registeredNameIndex;
        long statusIndex;
        long timeEndIndex;
        long timeStartIndex;
        long titleIndex;
        long toUserIdIndex;
        long toUserIndex;
        long userIndex;

        AppointmentColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.attachmentsIndex = addColumnDetails("attachments", "attachments", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.statusIndex = addColumnDetails(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, objectSchemaInfo);
            this.timeEndIndex = addColumnDetails("timeEnd", "timeEnd", objectSchemaInfo);
            this.timeStartIndex = addColumnDetails("timeStart", "timeStart", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.toUserIndex = addColumnDetails("toUser", "toUser", objectSchemaInfo);
            this.toUserIdIndex = addColumnDetails("toUserId", "toUserId", objectSchemaInfo);
            this.userIndex = addColumnDetails("user", "user", objectSchemaInfo);
            this.registeredNameIndex = addColumnDetails("registeredName", "registeredName", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AppointmentColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new AppointmentColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AppointmentColumnInfo appointmentColumnInfo = (AppointmentColumnInfo) columnInfo;
            AppointmentColumnInfo appointmentColumnInfo2 = (AppointmentColumnInfo) columnInfo2;
            appointmentColumnInfo2.idIndex = appointmentColumnInfo.idIndex;
            appointmentColumnInfo2.attachmentsIndex = appointmentColumnInfo.attachmentsIndex;
            appointmentColumnInfo2.dateIndex = appointmentColumnInfo.dateIndex;
            appointmentColumnInfo2.descriptionIndex = appointmentColumnInfo.descriptionIndex;
            appointmentColumnInfo2.statusIndex = appointmentColumnInfo.statusIndex;
            appointmentColumnInfo2.timeEndIndex = appointmentColumnInfo.timeEndIndex;
            appointmentColumnInfo2.timeStartIndex = appointmentColumnInfo.timeStartIndex;
            appointmentColumnInfo2.titleIndex = appointmentColumnInfo.titleIndex;
            appointmentColumnInfo2.toUserIndex = appointmentColumnInfo.toUserIndex;
            appointmentColumnInfo2.toUserIdIndex = appointmentColumnInfo.toUserIdIndex;
            appointmentColumnInfo2.userIndex = appointmentColumnInfo.userIndex;
            appointmentColumnInfo2.registeredNameIndex = appointmentColumnInfo.registeredNameIndex;
            appointmentColumnInfo2.maxColumnIndexValue = appointmentColumnInfo.maxColumnIndexValue;
        }
    }

    C4818xb7a5caf9() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (AppointmentColumnInfo) realmObjectContext.getColumnInfo();
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

    public RealmList<FileData> realmGet$attachments() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<FileData> realmList = this.attachmentsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.attachmentsRealmList = new RealmList<>(FileData.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.attachmentsIndex), this.proxyState.getRealm$realm());
        return this.attachmentsRealmList;
    }

    public void realmSet$attachments(RealmList<FileData> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("attachments")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<FileData> realmList2 = new RealmList<>();
                Iterator<FileData> it = realmList.iterator();
                while (it.hasNext()) {
                    FileData next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.attachmentsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    FileData fileData = realmList.get(i);
                    this.proxyState.checkValidObject(fileData);
                    modelList.addRow(((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            FileData fileData2 = realmList.get(i);
            this.proxyState.checkValidObject(fileData2);
            modelList.setRow((long) i, ((RealmObjectProxy) fileData2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public String realmGet$date() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dateIndex);
    }

    public void realmSet$date(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dateIndex, row$realm.getIndex(), str, true);
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

    public Status realmGet$status() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.statusIndex)) {
            return null;
        }
        return (Status) this.proxyState.getRealm$realm().get(Status.class, this.proxyState.getRow$realm().getLink(this.columnInfo.statusIndex), false, Collections.emptyList());
    }

    public void realmSet$status(Status status) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (status == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.statusIndex);
                return;
            }
            this.proxyState.checkValidObject(status);
            this.proxyState.getRow$realm().setLink(this.columnInfo.statusIndex, ((RealmObjectProxy) status).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(NotificationCompat.CATEGORY_STATUS)) {
            if (status != null && !RealmObject.isManaged(status)) {
                status = (Status) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(status, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (status == null) {
                row$realm.nullifyLink(this.columnInfo.statusIndex);
                return;
            }
            this.proxyState.checkValidObject(status);
            row$realm.getTable().setLink(this.columnInfo.statusIndex, row$realm.getIndex(), ((RealmObjectProxy) status).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$timeEnd() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.timeEndIndex);
    }

    public void realmSet$timeEnd(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.timeEndIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.timeEndIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.timeEndIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.timeEndIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$timeStart() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.timeStartIndex);
    }

    public void realmSet$timeStart(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.timeStartIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.timeStartIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.timeStartIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.timeStartIndex, row$realm.getIndex(), str, true);
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

    public ToUser realmGet$toUser() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.toUserIndex)) {
            return null;
        }
        return (ToUser) this.proxyState.getRealm$realm().get(ToUser.class, this.proxyState.getRow$realm().getLink(this.columnInfo.toUserIndex), false, Collections.emptyList());
    }

    public void realmSet$toUser(ToUser toUser) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (toUser == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.toUserIndex);
                return;
            }
            this.proxyState.checkValidObject(toUser);
            this.proxyState.getRow$realm().setLink(this.columnInfo.toUserIndex, ((RealmObjectProxy) toUser).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("toUser")) {
            if (toUser != null && !RealmObject.isManaged(toUser)) {
                toUser = (ToUser) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(toUser, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (toUser == null) {
                row$realm.nullifyLink(this.columnInfo.toUserIndex);
                return;
            }
            this.proxyState.checkValidObject(toUser);
            row$realm.getTable().setLink(this.columnInfo.toUserIndex, row$realm.getIndex(), ((RealmObjectProxy) toUser).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Integer realmGet$toUserId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.toUserIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.toUserIdIndex));
    }

    public void realmSet$toUserId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.toUserIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.toUserIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.toUserIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.toUserIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public FromUser realmGet$user() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.userIndex)) {
            return null;
        }
        return (FromUser) this.proxyState.getRealm$realm().get(FromUser.class, this.proxyState.getRow$realm().getLink(this.columnInfo.userIndex), false, Collections.emptyList());
    }

    public void realmSet$user(FromUser fromUser) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (fromUser == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.userIndex);
                return;
            }
            this.proxyState.checkValidObject(fromUser);
            this.proxyState.getRow$realm().setLink(this.columnInfo.userIndex, ((RealmObjectProxy) fromUser).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("user")) {
            if (fromUser != null && !RealmObject.isManaged(fromUser)) {
                fromUser = (FromUser) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(fromUser, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (fromUser == null) {
                row$realm.nullifyLink(this.columnInfo.userIndex);
                return;
            }
            this.proxyState.checkValidObject(fromUser);
            row$realm.getTable().setLink(this.columnInfo.userIndex, row$realm.getIndex(), ((RealmObjectProxy) fromUser).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$registeredName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.registeredNameIndex);
    }

    public void realmSet$registeredName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.registeredNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.registeredNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.registeredNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.registeredNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 12, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder.addPersistedLinkProperty("attachments", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("date", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty(NotificationCompat.CATEGORY_STATUS, RealmFieldType.OBJECT, C4824xe6f53cf6.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("timeEnd", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("timeStart", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("toUser", RealmFieldType.OBJECT, C4826x725684ea.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("toUserId", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, C4822xab1ed299.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("registeredName", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AppointmentColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AppointmentColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r3 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r5 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy$AppointmentColumnInfo r4 = (p046io.realm.C4818xb7a5caf9.AppointmentColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r4 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "user"
            java.lang.String r5 = "toUser"
            java.lang.String r6 = "status"
            java.lang.String r7 = "attachments"
            if (r3 != 0) goto L_0x00c8
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x007c
            r0.add(r7)
        L_0x007c:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0085
            r0.add(r6)
        L_0x0085:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x008e
            r0.add(r5)
        L_0x008e:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0097
            r0.add(r4)
        L_0x0097:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00c0
            boolean r3 = r14.isNull(r1)
            r8 = 1
            if (r3 == 0) goto L_0x00ae
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r1 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy r3 = (p046io.realm.C4818xb7a5caf9) r3
            goto L_0x00c8
        L_0x00ae:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r3 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy r3 = (p046io.realm.C4818xb7a5caf9) r3
            goto L_0x00c8
        L_0x00c0:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00c8:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxyInterface r0 = (p046io.realm.C4819x36140a40) r0
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x00ff
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x00db
            r0.realmSet$attachments(r2)
            goto L_0x00ff
        L_0x00db:
            io.realm.RealmList r1 = r0.realmGet$attachments()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r7)
            r7 = 0
        L_0x00e7:
            int r8 = r1.length()
            if (r7 >= r8) goto L_0x00ff
            org.json.JSONObject r8 = r1.getJSONObject(r7)
            ru.unicorn.ujin.data.realm.FileData r8 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r13, r8, r15)
            io.realm.RealmList r9 = r0.realmGet$attachments()
            r9.add(r8)
            int r7 = r7 + 1
            goto L_0x00e7
        L_0x00ff:
            java.lang.String r1 = "date"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0118
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x0111
            r0.realmSet$date(r2)
            goto L_0x0118
        L_0x0111:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$date(r1)
        L_0x0118:
            java.lang.String r1 = "description"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0131
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x012a
            r0.realmSet$description(r2)
            goto L_0x0131
        L_0x012a:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$description(r1)
        L_0x0131:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x014c
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0141
            r0.realmSet$status(r2)
            goto L_0x014c
        L_0x0141:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.view.fragments.makearecord.model.Status r1 = p046io.realm.C4824xe6f53cf6.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$status(r1)
        L_0x014c:
            java.lang.String r1 = "timeEnd"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0165
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x015e
            r0.realmSet$timeEnd(r2)
            goto L_0x0165
        L_0x015e:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$timeEnd(r1)
        L_0x0165:
            java.lang.String r1 = "timeStart"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x017e
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0177
            r0.realmSet$timeStart(r2)
            goto L_0x017e
        L_0x0177:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$timeStart(r1)
        L_0x017e:
            java.lang.String r1 = "title"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0197
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0190
            r0.realmSet$title(r2)
            goto L_0x0197
        L_0x0190:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x0197:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x01b2
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x01a7
            r0.realmSet$toUser(r2)
            goto L_0x01b2
        L_0x01a7:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.fragments.makearecord.model.ToUser r1 = p046io.realm.C4826x725684ea.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$toUser(r1)
        L_0x01b2:
            java.lang.String r1 = "toUserId"
            boolean r5 = r14.has(r1)
            if (r5 == 0) goto L_0x01d0
            boolean r5 = r14.isNull(r1)
            if (r5 == 0) goto L_0x01c5
            r0.realmSet$toUserId(r2)
            goto L_0x01d0
        L_0x01c5:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$toUserId(r1)
        L_0x01d0:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x01eb
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x01e0
            r0.realmSet$user(r2)
            goto L_0x01eb
        L_0x01e0:
            org.json.JSONObject r1 = r14.getJSONObject(r4)
            ru.unicorn.ujin.view.fragments.makearecord.model.FromUser r13 = p046io.realm.C4822xab1ed299.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$user(r13)
        L_0x01eb:
            java.lang.String r13 = "registeredName"
            boolean r15 = r14.has(r13)
            if (r15 == 0) goto L_0x0204
            boolean r15 = r14.isNull(r13)
            if (r15 == 0) goto L_0x01fd
            r0.realmSet$registeredName(r2)
            goto L_0x0204
        L_0x01fd:
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$registeredName(r13)
        L_0x0204:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4818xb7a5caf9.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.fragments.makearecord.model.Appointment");
    }

    public static Appointment createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Appointment appointment = new Appointment();
        C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface = appointment;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("attachments")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$attachments((RealmList<FileData>) null);
                } else {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$attachments(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$attachments().add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("date")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$date(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$date((String) null);
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals(NotificationCompat.CATEGORY_STATUS)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$status((Status) null);
                } else {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$status(C4824xe6f53cf6.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("timeEnd")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$timeEnd(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$timeEnd((String) null);
                }
            } else if (nextName.equals("timeStart")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$timeStart(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$timeStart((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("toUser")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$toUser((ToUser) null);
                } else {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$toUser(C4826x725684ea.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("toUserId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$toUserId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$toUserId((Integer) null);
                }
            } else if (nextName.equals("user")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$user((FromUser) null);
                } else {
                    ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$user(C4822xab1ed299.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("registeredName")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$registeredName(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$registeredName((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Appointment) realm.copyToRealm(appointment, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4818xb7a5caf9 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Appointment.class), false, Collections.emptyList());
        C4818xb7a5caf9 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxy = new C4818xb7a5caf9();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4818xb7a5caf9.AppointmentColumnInfo r9, p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.fragments.makearecord.model.Appointment r1 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.Appointment> r2 = p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxyInterface r5 = (p046io.realm.C4819x36140a40) r5
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
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.fragments.makearecord.model.Appointment r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.fragments.makearecord.model.Appointment r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4818xb7a5caf9.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_AppointmentRealmProxy$AppointmentColumnInfo, ru.unicorn.ujin.view.fragments.makearecord.model.Appointment, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.fragments.makearecord.model.Appointment");
    }

    public static Appointment copy(Realm realm, AppointmentColumnInfo appointmentColumnInfo, Appointment appointment, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(appointment);
        if (realmObjectProxy != null) {
            return (Appointment) realmObjectProxy;
        }
        C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface = appointment;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Appointment.class), appointmentColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(appointmentColumnInfo.idIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(appointmentColumnInfo.dateIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$date());
        osObjectBuilder.addString(appointmentColumnInfo.descriptionIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$description());
        osObjectBuilder.addString(appointmentColumnInfo.timeEndIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeEnd());
        osObjectBuilder.addString(appointmentColumnInfo.timeStartIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeStart());
        osObjectBuilder.addString(appointmentColumnInfo.titleIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$title());
        osObjectBuilder.addInteger(appointmentColumnInfo.toUserIdIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUserId());
        osObjectBuilder.addString(appointmentColumnInfo.registeredNameIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$registeredName());
        C4818xb7a5caf9 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(appointment, newProxyInstance);
        RealmList<FileData> realmGet$attachments = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$attachments();
        if (realmGet$attachments != null) {
            RealmList<FileData> realmGet$attachments2 = newProxyInstance.realmGet$attachments();
            realmGet$attachments2.clear();
            for (int i = 0; i < realmGet$attachments.size(); i++) {
                FileData fileData = realmGet$attachments.get(i);
                FileData fileData2 = (FileData) map.get(fileData);
                if (fileData2 != null) {
                    realmGet$attachments2.add(fileData2);
                } else {
                    realmGet$attachments2.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), fileData, z, map, set));
                }
            }
        }
        Status realmGet$status = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$status();
        if (realmGet$status == null) {
            newProxyInstance.realmSet$status((Status) null);
        } else {
            Status status = (Status) map.get(realmGet$status);
            if (status != null) {
                newProxyInstance.realmSet$status(status);
            } else {
                newProxyInstance.realmSet$status(C4824xe6f53cf6.copyOrUpdate(realm, (C4824xe6f53cf6.StatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Status.class), realmGet$status, z, map, set));
            }
        }
        ToUser realmGet$toUser = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUser();
        if (realmGet$toUser == null) {
            newProxyInstance.realmSet$toUser((ToUser) null);
        } else {
            ToUser toUser = (ToUser) map.get(realmGet$toUser);
            if (toUser != null) {
                newProxyInstance.realmSet$toUser(toUser);
            } else {
                newProxyInstance.realmSet$toUser(C4826x725684ea.copyOrUpdate(realm, (C4826x725684ea.ToUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ToUser.class), realmGet$toUser, z, map, set));
            }
        }
        FromUser realmGet$user = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$user();
        if (realmGet$user == null) {
            newProxyInstance.realmSet$user((FromUser) null);
        } else {
            FromUser fromUser = (FromUser) map.get(realmGet$user);
            if (fromUser != null) {
                newProxyInstance.realmSet$user(fromUser);
            } else {
                newProxyInstance.realmSet$user(C4822xab1ed299.copyOrUpdate(realm, (C4822xab1ed299.FromUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FromUser.class), realmGet$user, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Appointment appointment, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Appointment appointment2 = appointment;
        Map<RealmModel, Long> map2 = map;
        if (appointment2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) appointment2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Appointment.class);
        long nativePtr = table.getNativePtr();
        AppointmentColumnInfo appointmentColumnInfo = (AppointmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Appointment.class);
        long j3 = appointmentColumnInfo.idIndex;
        C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface = appointment2;
        Integer realmGet$id = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
        }
        long j4 = j;
        map2.put(appointment2, Long.valueOf(j4));
        RealmList<FileData> realmGet$attachments = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$attachments();
        if (realmGet$attachments != null) {
            OsList osList = new OsList(table.getUncheckedRow(j4), appointmentColumnInfo.attachmentsIndex);
            Iterator<FileData> it = realmGet$attachments.iterator();
            while (it.hasNext()) {
                FileData next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        }
        String realmGet$date = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$date();
        if (realmGet$date != null) {
            j2 = j4;
            Table.nativeSetString(nativePtr, appointmentColumnInfo.dateIndex, j4, realmGet$date, false);
        } else {
            j2 = j4;
        }
        String realmGet$description = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.descriptionIndex, j2, realmGet$description, false);
        }
        Status realmGet$status = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$status();
        if (realmGet$status != null) {
            Long l2 = map2.get(realmGet$status);
            if (l2 == null) {
                l2 = Long.valueOf(C4824xe6f53cf6.insert(realm2, realmGet$status, map2));
            }
            Table.nativeSetLink(nativePtr, appointmentColumnInfo.statusIndex, j2, l2.longValue(), false);
        }
        String realmGet$timeEnd = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeEnd();
        if (realmGet$timeEnd != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.timeEndIndex, j2, realmGet$timeEnd, false);
        }
        String realmGet$timeStart = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeStart();
        if (realmGet$timeStart != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.timeStartIndex, j2, realmGet$timeStart, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        ToUser realmGet$toUser = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUser();
        if (realmGet$toUser != null) {
            Long l3 = map2.get(realmGet$toUser);
            if (l3 == null) {
                l3 = Long.valueOf(C4826x725684ea.insert(realm2, realmGet$toUser, map2));
            }
            Table.nativeSetLink(nativePtr, appointmentColumnInfo.toUserIndex, j2, l3.longValue(), false);
        }
        Integer realmGet$toUserId = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUserId();
        if (realmGet$toUserId != null) {
            Table.nativeSetLong(nativePtr, appointmentColumnInfo.toUserIdIndex, j2, realmGet$toUserId.longValue(), false);
        }
        FromUser realmGet$user = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$user();
        if (realmGet$user != null) {
            Long l4 = map2.get(realmGet$user);
            if (l4 == null) {
                l4 = Long.valueOf(C4822xab1ed299.insert(realm2, realmGet$user, map2));
            }
            Table.nativeSetLink(nativePtr, appointmentColumnInfo.userIndex, j2, l4.longValue(), false);
        }
        String realmGet$registeredName = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$registeredName();
        if (realmGet$registeredName != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.registeredNameIndex, j2, realmGet$registeredName, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Appointment.class);
        long nativePtr = table.getNativePtr();
        AppointmentColumnInfo appointmentColumnInfo = (AppointmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Appointment.class);
        long j4 = appointmentColumnInfo.idIndex;
        while (it.hasNext()) {
            Appointment appointment = (Appointment) it.next();
            if (!map2.containsKey(appointment)) {
                if (appointment instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) appointment;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(appointment, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface = appointment;
                Integer realmGet$id = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j4, (long) ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j4, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j5 = j;
                map2.put(appointment, Long.valueOf(j5));
                RealmList<FileData> realmGet$attachments = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$attachments();
                if (realmGet$attachments != null) {
                    j2 = j5;
                    OsList osList = new OsList(table.getUncheckedRow(j5), appointmentColumnInfo.attachmentsIndex);
                    Iterator<FileData> it2 = realmGet$attachments.iterator();
                    while (it2.hasNext()) {
                        FileData next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                } else {
                    j2 = j5;
                }
                String realmGet$date = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$date();
                if (realmGet$date != null) {
                    j3 = j4;
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.dateIndex, j2, realmGet$date, false);
                } else {
                    j3 = j4;
                }
                String realmGet$description = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.descriptionIndex, j2, realmGet$description, false);
                }
                Status realmGet$status = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$status();
                if (realmGet$status != null) {
                    Long l2 = map2.get(realmGet$status);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4824xe6f53cf6.insert(realm2, realmGet$status, map2));
                    }
                    table.setLink(appointmentColumnInfo.statusIndex, j2, l2.longValue(), false);
                }
                String realmGet$timeEnd = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeEnd();
                if (realmGet$timeEnd != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.timeEndIndex, j2, realmGet$timeEnd, false);
                }
                String realmGet$timeStart = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeStart();
                if (realmGet$timeStart != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.timeStartIndex, j2, realmGet$timeStart, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.titleIndex, j2, realmGet$title, false);
                }
                ToUser realmGet$toUser = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUser();
                if (realmGet$toUser != null) {
                    Long l3 = map2.get(realmGet$toUser);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4826x725684ea.insert(realm2, realmGet$toUser, map2));
                    }
                    table.setLink(appointmentColumnInfo.toUserIndex, j2, l3.longValue(), false);
                }
                Integer realmGet$toUserId = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUserId();
                if (realmGet$toUserId != null) {
                    Table.nativeSetLong(nativePtr, appointmentColumnInfo.toUserIdIndex, j2, realmGet$toUserId.longValue(), false);
                }
                FromUser realmGet$user = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$user();
                if (realmGet$user != null) {
                    Long l4 = map2.get(realmGet$user);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4822xab1ed299.insert(realm2, realmGet$user, map2));
                    }
                    table.setLink(appointmentColumnInfo.userIndex, j2, l4.longValue(), false);
                }
                String realmGet$registeredName = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$registeredName();
                if (realmGet$registeredName != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.registeredNameIndex, j2, realmGet$registeredName, false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Appointment appointment, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Appointment appointment2 = appointment;
        Map<RealmModel, Long> map2 = map;
        if (appointment2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) appointment2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Appointment.class);
        long nativePtr = table.getNativePtr();
        AppointmentColumnInfo appointmentColumnInfo = (AppointmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Appointment.class);
        long j3 = appointmentColumnInfo.idIndex;
        C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface = appointment2;
        if (ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id());
        }
        long j4 = j;
        map2.put(appointment2, Long.valueOf(j4));
        OsList osList = new OsList(table.getUncheckedRow(j4), appointmentColumnInfo.attachmentsIndex);
        RealmList<FileData> realmGet$attachments = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$attachments();
        if (realmGet$attachments == null || ((long) realmGet$attachments.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$attachments != null) {
                Iterator<FileData> it = realmGet$attachments.iterator();
                while (it.hasNext()) {
                    FileData next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$attachments.size();
            for (int i = 0; i < size; i++) {
                FileData fileData = realmGet$attachments.get(i);
                Long l2 = map2.get(fileData);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, fileData, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        String realmGet$date = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$date();
        if (realmGet$date != null) {
            j2 = j4;
            Table.nativeSetString(nativePtr, appointmentColumnInfo.dateIndex, j4, realmGet$date, false);
        } else {
            j2 = j4;
            Table.nativeSetNull(nativePtr, appointmentColumnInfo.dateIndex, j2, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.descriptionIndex, j2, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, appointmentColumnInfo.descriptionIndex, j2, false);
        }
        Status realmGet$status = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$status();
        if (realmGet$status != null) {
            Long l3 = map2.get(realmGet$status);
            if (l3 == null) {
                l3 = Long.valueOf(C4824xe6f53cf6.insertOrUpdate(realm2, realmGet$status, map2));
            }
            Table.nativeSetLink(nativePtr, appointmentColumnInfo.statusIndex, j2, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, appointmentColumnInfo.statusIndex, j2);
        }
        String realmGet$timeEnd = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeEnd();
        if (realmGet$timeEnd != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.timeEndIndex, j2, realmGet$timeEnd, false);
        } else {
            Table.nativeSetNull(nativePtr, appointmentColumnInfo.timeEndIndex, j2, false);
        }
        String realmGet$timeStart = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeStart();
        if (realmGet$timeStart != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.timeStartIndex, j2, realmGet$timeStart, false);
        } else {
            Table.nativeSetNull(nativePtr, appointmentColumnInfo.timeStartIndex, j2, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, appointmentColumnInfo.titleIndex, j2, false);
        }
        ToUser realmGet$toUser = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUser();
        if (realmGet$toUser != null) {
            Long l4 = map2.get(realmGet$toUser);
            if (l4 == null) {
                l4 = Long.valueOf(C4826x725684ea.insertOrUpdate(realm2, realmGet$toUser, map2));
            }
            Table.nativeSetLink(nativePtr, appointmentColumnInfo.toUserIndex, j2, l4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, appointmentColumnInfo.toUserIndex, j2);
        }
        Integer realmGet$toUserId = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUserId();
        if (realmGet$toUserId != null) {
            Table.nativeSetLong(nativePtr, appointmentColumnInfo.toUserIdIndex, j2, realmGet$toUserId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, appointmentColumnInfo.toUserIdIndex, j2, false);
        }
        FromUser realmGet$user = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$user();
        if (realmGet$user != null) {
            Long l5 = map2.get(realmGet$user);
            if (l5 == null) {
                l5 = Long.valueOf(C4822xab1ed299.insertOrUpdate(realm2, realmGet$user, map2));
            }
            Table.nativeSetLink(nativePtr, appointmentColumnInfo.userIndex, j2, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, appointmentColumnInfo.userIndex, j2);
        }
        String realmGet$registeredName = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$registeredName();
        if (realmGet$registeredName != null) {
            Table.nativeSetString(nativePtr, appointmentColumnInfo.registeredNameIndex, j2, realmGet$registeredName, false);
        } else {
            Table.nativeSetNull(nativePtr, appointmentColumnInfo.registeredNameIndex, j2, false);
        }
        return j2;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Appointment.class);
        long nativePtr = table.getNativePtr();
        AppointmentColumnInfo appointmentColumnInfo = (AppointmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Appointment.class);
        long j6 = appointmentColumnInfo.idIndex;
        while (it.hasNext()) {
            Appointment appointment = (Appointment) it.next();
            if (!map2.containsKey(appointment)) {
                if (appointment instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) appointment;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(appointment, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface = appointment;
                if (ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j6, (long) ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j6, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$id());
                }
                long j7 = j;
                map2.put(appointment, Long.valueOf(j7));
                OsList osList = new OsList(table.getUncheckedRow(j7), appointmentColumnInfo.attachmentsIndex);
                RealmList<FileData> realmGet$attachments = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$attachments();
                if (realmGet$attachments == null || ((long) realmGet$attachments.size()) != osList.size()) {
                    j3 = j7;
                    j2 = j6;
                    osList.removeAll();
                    if (realmGet$attachments != null) {
                        Iterator<FileData> it2 = realmGet$attachments.iterator();
                        while (it2.hasNext()) {
                            FileData next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$attachments.size();
                    int i = 0;
                    while (i < size) {
                        FileData fileData = realmGet$attachments.get(i);
                        Long l2 = map2.get(fileData);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, fileData, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        j7 = j7;
                        j6 = j6;
                    }
                    j3 = j7;
                    j2 = j6;
                }
                String realmGet$date = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$date();
                if (realmGet$date != null) {
                    j5 = j3;
                    j4 = j2;
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.dateIndex, j5, realmGet$date, false);
                } else {
                    j5 = j3;
                    j4 = j2;
                    Table.nativeSetNull(nativePtr, appointmentColumnInfo.dateIndex, j5, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.descriptionIndex, j5, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, appointmentColumnInfo.descriptionIndex, j5, false);
                }
                Status realmGet$status = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$status();
                if (realmGet$status != null) {
                    Long l3 = map2.get(realmGet$status);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4824xe6f53cf6.insertOrUpdate(realm2, realmGet$status, map2));
                    }
                    Table.nativeSetLink(nativePtr, appointmentColumnInfo.statusIndex, j5, l3.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, appointmentColumnInfo.statusIndex, j5);
                }
                String realmGet$timeEnd = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeEnd();
                if (realmGet$timeEnd != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.timeEndIndex, j5, realmGet$timeEnd, false);
                } else {
                    Table.nativeSetNull(nativePtr, appointmentColumnInfo.timeEndIndex, j5, false);
                }
                String realmGet$timeStart = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$timeStart();
                if (realmGet$timeStart != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.timeStartIndex, j5, realmGet$timeStart, false);
                } else {
                    Table.nativeSetNull(nativePtr, appointmentColumnInfo.timeStartIndex, j5, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.titleIndex, j5, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, appointmentColumnInfo.titleIndex, j5, false);
                }
                ToUser realmGet$toUser = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUser();
                if (realmGet$toUser != null) {
                    Long l4 = map2.get(realmGet$toUser);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4826x725684ea.insertOrUpdate(realm2, realmGet$toUser, map2));
                    }
                    Table.nativeSetLink(nativePtr, appointmentColumnInfo.toUserIndex, j5, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, appointmentColumnInfo.toUserIndex, j5);
                }
                Integer realmGet$toUserId = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$toUserId();
                if (realmGet$toUserId != null) {
                    Table.nativeSetLong(nativePtr, appointmentColumnInfo.toUserIdIndex, j5, realmGet$toUserId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, appointmentColumnInfo.toUserIdIndex, j5, false);
                }
                FromUser realmGet$user = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$user();
                if (realmGet$user != null) {
                    Long l5 = map2.get(realmGet$user);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4822xab1ed299.insertOrUpdate(realm2, realmGet$user, map2));
                    }
                    Table.nativeSetLink(nativePtr, appointmentColumnInfo.userIndex, j5, l5.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, appointmentColumnInfo.userIndex, j5);
                }
                String realmGet$registeredName = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmGet$registeredName();
                if (realmGet$registeredName != null) {
                    Table.nativeSetString(nativePtr, appointmentColumnInfo.registeredNameIndex, j5, realmGet$registeredName, false);
                } else {
                    Table.nativeSetNull(nativePtr, appointmentColumnInfo.registeredNameIndex, j5, false);
                }
                j6 = j4;
            }
        }
    }

    public static Appointment createDetachedCopy(Appointment appointment, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Appointment appointment2;
        if (i > i2 || appointment == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(appointment);
        if (cacheData == null) {
            appointment2 = new Appointment();
            map.put(appointment, new RealmObjectProxy.CacheData(i, appointment2));
        } else if (i >= cacheData.minDepth) {
            return (Appointment) cacheData.object;
        } else {
            cacheData.minDepth = i;
            appointment2 = (Appointment) cacheData.object;
        }
        C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface = appointment2;
        C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2 = appointment;
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$id());
        if (i == i2) {
            ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$attachments((RealmList<FileData>) null);
        } else {
            RealmList<FileData> realmGet$attachments = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$attachments();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$attachments(realmList);
            int i3 = i + 1;
            int size = realmGet$attachments.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy(realmGet$attachments.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$date(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$date());
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$description(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$description());
        int i5 = i + 1;
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$status(C4824xe6f53cf6.createDetachedCopy(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$status(), i5, i2, map));
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$timeEnd(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$timeEnd());
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$timeStart(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$timeStart());
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$toUser(C4826x725684ea.createDetachedCopy(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$toUser(), i5, i2, map));
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$toUserId(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$toUserId());
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$user(C4822xab1ed299.createDetachedCopy(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$user(), i5, i2, map));
        ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface.realmSet$registeredName(ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$registeredName());
        return appointment2;
    }

    static Appointment update(Realm realm, AppointmentColumnInfo appointmentColumnInfo, Appointment appointment, Appointment appointment2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        AppointmentColumnInfo appointmentColumnInfo2 = appointmentColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface = appointment;
        C4819x36140a40 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2 = appointment2;
        Realm realm2 = realm;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Appointment.class), appointmentColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(appointmentColumnInfo2.idIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$id());
        RealmList<FileData> realmGet$attachments = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$attachments();
        if (realmGet$attachments != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$attachments.size(); i++) {
                FileData fileData = realmGet$attachments.get(i);
                FileData fileData2 = (FileData) map2.get(fileData);
                if (fileData2 != null) {
                    realmList.add(fileData2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), fileData, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(appointmentColumnInfo2.attachmentsIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(appointmentColumnInfo2.attachmentsIndex, new RealmList());
        }
        osObjectBuilder.addString(appointmentColumnInfo2.dateIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$date());
        osObjectBuilder.addString(appointmentColumnInfo2.descriptionIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$description());
        Status realmGet$status = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$status();
        if (realmGet$status == null) {
            osObjectBuilder.addNull(appointmentColumnInfo2.statusIndex);
        } else {
            Status status = (Status) map2.get(realmGet$status);
            if (status != null) {
                osObjectBuilder.addObject(appointmentColumnInfo2.statusIndex, status);
            } else {
                osObjectBuilder.addObject(appointmentColumnInfo2.statusIndex, C4824xe6f53cf6.copyOrUpdate(realm, (C4824xe6f53cf6.StatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Status.class), realmGet$status, true, map, set));
            }
        }
        osObjectBuilder.addString(appointmentColumnInfo2.timeEndIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$timeEnd());
        osObjectBuilder.addString(appointmentColumnInfo2.timeStartIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$timeStart());
        osObjectBuilder.addString(appointmentColumnInfo2.titleIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$title());
        ToUser realmGet$toUser = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$toUser();
        if (realmGet$toUser == null) {
            osObjectBuilder.addNull(appointmentColumnInfo2.toUserIndex);
        } else {
            ToUser toUser = (ToUser) map2.get(realmGet$toUser);
            if (toUser != null) {
                osObjectBuilder.addObject(appointmentColumnInfo2.toUserIndex, toUser);
            } else {
                osObjectBuilder.addObject(appointmentColumnInfo2.toUserIndex, C4826x725684ea.copyOrUpdate(realm, (C4826x725684ea.ToUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ToUser.class), realmGet$toUser, true, map, set));
            }
        }
        osObjectBuilder.addInteger(appointmentColumnInfo2.toUserIdIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$toUserId());
        FromUser realmGet$user = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$user();
        if (realmGet$user == null) {
            osObjectBuilder.addNull(appointmentColumnInfo2.userIndex);
        } else {
            FromUser fromUser = (FromUser) map2.get(realmGet$user);
            if (fromUser != null) {
                osObjectBuilder.addObject(appointmentColumnInfo2.userIndex, fromUser);
            } else {
                osObjectBuilder.addObject(appointmentColumnInfo2.userIndex, C4822xab1ed299.copyOrUpdate(realm, (C4822xab1ed299.FromUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FromUser.class), realmGet$user, true, map, set));
            }
        }
        osObjectBuilder.addString(appointmentColumnInfo2.registeredNameIndex, ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxyinterface2.realmGet$registeredName());
        osObjectBuilder.updateExistingObject();
        return appointment;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Appointment = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{attachments:");
        sb.append("RealmList<FileData>[");
        sb.append(realmGet$attachments().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{date:");
        sb.append(realmGet$date() != null ? realmGet$date() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description() != null ? realmGet$description() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{status:");
        sb.append(realmGet$status() != null ? C4824xe6f53cf6.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{timeEnd:");
        sb.append(realmGet$timeEnd() != null ? realmGet$timeEnd() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{timeStart:");
        sb.append(realmGet$timeStart() != null ? realmGet$timeStart() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{toUser:");
        sb.append(realmGet$toUser() != null ? C4826x725684ea.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{toUserId:");
        sb.append(realmGet$toUserId() != null ? realmGet$toUserId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{user:");
        sb.append(realmGet$user() != null ? C4822xab1ed299.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{registeredName:");
        if (realmGet$registeredName() != null) {
            str = realmGet$registeredName();
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
        C4818xb7a5caf9 ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxy = (C4818xb7a5caf9) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_makearecord_model_appointmentrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
