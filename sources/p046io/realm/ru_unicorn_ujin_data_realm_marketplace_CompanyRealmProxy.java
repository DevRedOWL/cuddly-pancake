package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.react.modules.appstate.AppStateModule;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.data.realm.marketplace.CompanyContact;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.GalleryField;
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
import p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy extends Company implements RealmObjectProxy, C4611x5a122a54 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CompanyColumnInfo columnInfo;
    private RealmList<CompanyContact> contactsRealmList;
    private RealmList<String> highlightsRealmList;
    private RealmList<FileData> imagesRealmList;
    private ProxyState<Company> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Company";
    }

    public static String getSimpleClassName() {
        return "Company";
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy$CompanyColumnInfo */
    static final class CompanyColumnInfo extends ColumnInfo {
        long accentColorIndex;
        long backgroundIndex;
        long contactsIndex;
        long deliveryIndex;
        long descriptionIndex;
        long highlightsIndex;
        long idIndex;
        long imagesIndex;
        long logoIndex;
        long maxColumnIndexValue;
        long summaryIndex;
        long taglineIndex;
        long titleIndex;

        CompanyColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("Company");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.taglineIndex = addColumnDetails("tagline", "tagline", objectSchemaInfo);
            this.highlightsIndex = addColumnDetails("highlights", "highlights", objectSchemaInfo);
            this.logoIndex = addColumnDetails("logo", "logo", objectSchemaInfo);
            this.backgroundIndex = addColumnDetails(AppStateModule.APP_STATE_BACKGROUND, AppStateModule.APP_STATE_BACKGROUND, objectSchemaInfo);
            this.accentColorIndex = addColumnDetails("accentColor", "accentColor", objectSchemaInfo);
            this.summaryIndex = addColumnDetails("summary", "summary", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.deliveryIndex = addColumnDetails("delivery", "delivery", objectSchemaInfo);
            this.contactsIndex = addColumnDetails("contacts", "contacts", objectSchemaInfo);
            this.imagesIndex = addColumnDetails(GalleryField.JsonFields.imageList, GalleryField.JsonFields.imageList, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CompanyColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CompanyColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CompanyColumnInfo companyColumnInfo = (CompanyColumnInfo) columnInfo;
            CompanyColumnInfo companyColumnInfo2 = (CompanyColumnInfo) columnInfo2;
            companyColumnInfo2.idIndex = companyColumnInfo.idIndex;
            companyColumnInfo2.titleIndex = companyColumnInfo.titleIndex;
            companyColumnInfo2.taglineIndex = companyColumnInfo.taglineIndex;
            companyColumnInfo2.highlightsIndex = companyColumnInfo.highlightsIndex;
            companyColumnInfo2.logoIndex = companyColumnInfo.logoIndex;
            companyColumnInfo2.backgroundIndex = companyColumnInfo.backgroundIndex;
            companyColumnInfo2.accentColorIndex = companyColumnInfo.accentColorIndex;
            companyColumnInfo2.summaryIndex = companyColumnInfo.summaryIndex;
            companyColumnInfo2.descriptionIndex = companyColumnInfo.descriptionIndex;
            companyColumnInfo2.deliveryIndex = companyColumnInfo.deliveryIndex;
            companyColumnInfo2.contactsIndex = companyColumnInfo.contactsIndex;
            companyColumnInfo2.imagesIndex = companyColumnInfo.imagesIndex;
            companyColumnInfo2.maxColumnIndexValue = companyColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CompanyColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$tagline() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.taglineIndex);
    }

    public void realmSet$tagline(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.taglineIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.taglineIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.taglineIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.taglineIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<String> realmGet$highlights() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.highlightsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.highlightsRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.highlightsIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.highlightsRealmList;
    }

    public void realmSet$highlights(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("highlights"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.highlightsIndex, RealmFieldType.STRING_LIST);
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

    public FileData realmGet$logo() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.logoIndex)) {
            return null;
        }
        return (FileData) this.proxyState.getRealm$realm().get(FileData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.logoIndex), false, Collections.emptyList());
    }

    public void realmSet$logo(FileData fileData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (fileData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.logoIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.logoIndex, ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("logo")) {
            if (fileData != null && !RealmObject.isManaged(fileData)) {
                fileData = (FileData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(fileData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (fileData == null) {
                row$realm.nullifyLink(this.columnInfo.logoIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            row$realm.getTable().setLink(this.columnInfo.logoIndex, row$realm.getIndex(), ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public FileData realmGet$background() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.backgroundIndex)) {
            return null;
        }
        return (FileData) this.proxyState.getRealm$realm().get(FileData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.backgroundIndex), false, Collections.emptyList());
    }

    public void realmSet$background(FileData fileData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (fileData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.backgroundIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.backgroundIndex, ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(AppStateModule.APP_STATE_BACKGROUND)) {
            if (fileData != null && !RealmObject.isManaged(fileData)) {
                fileData = (FileData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(fileData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (fileData == null) {
                row$realm.nullifyLink(this.columnInfo.backgroundIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            row$realm.getTable().setLink(this.columnInfo.backgroundIndex, row$realm.getIndex(), ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$accentColor() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.accentColorIndex);
    }

    public void realmSet$accentColor(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.accentColorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.accentColorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.accentColorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.accentColorIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$summary() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.summaryIndex);
    }

    public void realmSet$summary(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.summaryIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.summaryIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.summaryIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.summaryIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$delivery() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deliveryIndex);
    }

    public void realmSet$delivery(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deliveryIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deliveryIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deliveryIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deliveryIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<CompanyContact> realmGet$contacts() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CompanyContact> realmList = this.contactsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.contactsRealmList = new RealmList<>(CompanyContact.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.contactsIndex), this.proxyState.getRealm$realm());
        return this.contactsRealmList;
    }

    public void realmSet$contacts(RealmList<CompanyContact> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("contacts")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<CompanyContact> realmList2 = new RealmList<>();
                Iterator<CompanyContact> it = realmList.iterator();
                while (it.hasNext()) {
                    CompanyContact next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.contactsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    CompanyContact companyContact = realmList.get(i);
                    this.proxyState.checkValidObject(companyContact);
                    modelList.addRow(((RealmObjectProxy) companyContact).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            CompanyContact companyContact2 = realmList.get(i);
            this.proxyState.checkValidObject(companyContact2);
            modelList.setRow((long) i, ((RealmObjectProxy) companyContact2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<FileData> realmGet$images() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<FileData> realmList = this.imagesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.imagesRealmList = new RealmList<>(FileData.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.imagesIndex), this.proxyState.getRealm$realm());
        return this.imagesRealmList;
    }

    public void realmSet$images(RealmList<FileData> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains(GalleryField.JsonFields.imageList)) {
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.imagesIndex);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Company", 12, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("tagline", RealmFieldType.STRING, false, false, false);
        builder.addPersistedValueListProperty("highlights", RealmFieldType.STRING_LIST, false);
        builder.addPersistedLinkProperty("logo", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(AppStateModule.APP_STATE_BACKGROUND, RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("accentColor", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("summary", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("delivery", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("contacts", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(GalleryField.JsonFields.imageList, RealmFieldType.LIST, ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CompanyColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CompanyColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Company createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r5 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy$CompanyColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.CompanyColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r4 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "highlights"
            java.lang.String r5 = "images"
            java.lang.String r6 = "contacts"
            java.lang.String r7 = "background"
            java.lang.String r8 = "logo"
            if (r3 != 0) goto L_0x00cd
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x007c
            r0.add(r4)
        L_0x007c:
            boolean r3 = r14.has(r8)
            if (r3 == 0) goto L_0x0085
            r0.add(r8)
        L_0x0085:
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x008e
            r0.add(r7)
        L_0x008e:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0097
            r0.add(r6)
        L_0x0097:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x00a0
            r0.add(r5)
        L_0x00a0:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00c5
            boolean r3 = r14.isNull(r1)
            r9 = 1
            if (r3 == 0) goto L_0x00b7
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r1 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r9, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy) r3
            goto L_0x00cd
        L_0x00b7:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r9, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy) r3
            goto L_0x00cd
        L_0x00c5:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00cd:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxyInterface r0 = (p046io.realm.C4611x5a122a54) r0
            java.lang.String r1 = "title"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x00e9
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x00e2
            r0.realmSet$title(r2)
            goto L_0x00e9
        L_0x00e2:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x00e9:
            java.lang.String r1 = "tagline"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x0102
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x00fb
            r0.realmSet$tagline(r2)
            goto L_0x0102
        L_0x00fb:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$tagline(r1)
        L_0x0102:
            io.realm.RealmList r1 = r0.realmGet$highlights()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r1, r14, r4)
            boolean r1 = r14.has(r8)
            if (r1 == 0) goto L_0x0124
            boolean r1 = r14.isNull(r8)
            if (r1 == 0) goto L_0x0119
            r0.realmSet$logo(r2)
            goto L_0x0124
        L_0x0119:
            org.json.JSONObject r1 = r14.getJSONObject(r8)
            ru.unicorn.ujin.data.realm.FileData r1 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$logo(r1)
        L_0x0124:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x013f
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0134
            r0.realmSet$background(r2)
            goto L_0x013f
        L_0x0134:
            org.json.JSONObject r1 = r14.getJSONObject(r7)
            ru.unicorn.ujin.data.realm.FileData r1 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$background(r1)
        L_0x013f:
            java.lang.String r1 = "accentColor"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x0158
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x0151
            r0.realmSet$accentColor(r2)
            goto L_0x0158
        L_0x0151:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$accentColor(r1)
        L_0x0158:
            java.lang.String r1 = "summary"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x0171
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x016a
            r0.realmSet$summary(r2)
            goto L_0x0171
        L_0x016a:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$summary(r1)
        L_0x0171:
            java.lang.String r1 = "description"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x018a
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x0183
            r0.realmSet$description(r2)
            goto L_0x018a
        L_0x0183:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$description(r1)
        L_0x018a:
            java.lang.String r1 = "delivery"
            boolean r4 = r14.has(r1)
            if (r4 == 0) goto L_0x01a3
            boolean r4 = r14.isNull(r1)
            if (r4 == 0) goto L_0x019c
            r0.realmSet$delivery(r2)
            goto L_0x01a3
        L_0x019c:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$delivery(r1)
        L_0x01a3:
            boolean r1 = r14.has(r6)
            r4 = 0
            if (r1 == 0) goto L_0x01d8
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x01b4
            r0.realmSet$contacts(r2)
            goto L_0x01d8
        L_0x01b4:
            io.realm.RealmList r1 = r0.realmGet$contacts()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r6)
            r6 = 0
        L_0x01c0:
            int r7 = r1.length()
            if (r6 >= r7) goto L_0x01d8
            org.json.JSONObject r7 = r1.getJSONObject(r6)
            ru.unicorn.ujin.data.realm.marketplace.CompanyContact r7 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.createOrUpdateUsingJsonObject(r13, r7, r15)
            io.realm.RealmList r8 = r0.realmGet$contacts()
            r8.add(r7)
            int r6 = r6 + 1
            goto L_0x01c0
        L_0x01d8:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x020b
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x01e8
            r0.realmSet$images(r2)
            goto L_0x020b
        L_0x01e8:
            io.realm.RealmList r1 = r0.realmGet$images()
            r1.clear()
            org.json.JSONArray r14 = r14.getJSONArray(r5)
        L_0x01f3:
            int r1 = r14.length()
            if (r4 >= r1) goto L_0x020b
            org.json.JSONObject r1 = r14.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.FileData r1 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            io.realm.RealmList r2 = r0.realmGet$images()
            r2.add(r1)
            int r4 = r4 + 1
            goto L_0x01f3
        L_0x020b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.Company");
    }

    public static Company createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Company company = new Company();
        C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface = company;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("tagline")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$tagline(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$tagline((String) null);
                }
            } else if (nextName.equals("highlights")) {
                ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$highlights(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else if (nextName.equals("logo")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$logo((FileData) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$logo(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals(AppStateModule.APP_STATE_BACKGROUND)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$background((FileData) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$background(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("accentColor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$accentColor(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$accentColor((String) null);
                }
            } else if (nextName.equals("summary")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$summary(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$summary((String) null);
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals("delivery")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$delivery(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$delivery((String) null);
                }
            } else if (nextName.equals("contacts")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$contacts((RealmList<CompanyContact>) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$contacts(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$contacts().add(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals(GalleryField.JsonFields.imageList)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$images((RealmList<FileData>) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$images(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$images().add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Company) realm.copyToRealm(company, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Company.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy ru_unicorn_ujin_data_realm_marketplace_companyrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_companyrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Company copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.CompanyColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.Company r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.Company r1 = (p035ru.unicorn.ujin.data.realm.marketplace.Company) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Company> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Company.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxyInterface r5 = (p046io.realm.C4611x5a122a54) r5
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.Company r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.Company r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy$CompanyColumnInfo, ru.unicorn.ujin.data.realm.marketplace.Company, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.Company");
    }

    public static Company copy(Realm realm, CompanyColumnInfo companyColumnInfo, Company company, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        CompanyColumnInfo companyColumnInfo2 = companyColumnInfo;
        Company company2 = company;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(company2);
        if (realmObjectProxy != null) {
            return (Company) realmObjectProxy;
        }
        C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface = company2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Company.class), companyColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(companyColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(companyColumnInfo2.titleIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(companyColumnInfo2.taglineIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$tagline());
        osObjectBuilder.addStringList(companyColumnInfo2.highlightsIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$highlights());
        osObjectBuilder.addString(companyColumnInfo2.accentColorIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$accentColor());
        osObjectBuilder.addString(companyColumnInfo2.summaryIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$summary());
        osObjectBuilder.addString(companyColumnInfo2.descriptionIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$description());
        osObjectBuilder.addString(companyColumnInfo2.deliveryIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$delivery());
        ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(company2, newProxyInstance);
        FileData realmGet$logo = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$logo();
        if (realmGet$logo == null) {
            newProxyInstance.realmSet$logo((FileData) null);
        } else {
            FileData fileData = (FileData) map2.get(realmGet$logo);
            if (fileData != null) {
                newProxyInstance.realmSet$logo(fileData);
            } else {
                newProxyInstance.realmSet$logo(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$logo, z, map, set));
            }
        }
        FileData realmGet$background = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$background();
        if (realmGet$background == null) {
            newProxyInstance.realmSet$background((FileData) null);
        } else {
            FileData fileData2 = (FileData) map2.get(realmGet$background);
            if (fileData2 != null) {
                newProxyInstance.realmSet$background(fileData2);
            } else {
                newProxyInstance.realmSet$background(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$background, z, map, set));
            }
        }
        RealmList<CompanyContact> realmGet$contacts = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$contacts();
        if (realmGet$contacts != null) {
            RealmList<CompanyContact> realmGet$contacts2 = newProxyInstance.realmGet$contacts();
            realmGet$contacts2.clear();
            for (int i = 0; i < realmGet$contacts.size(); i++) {
                CompanyContact companyContact = realmGet$contacts.get(i);
                CompanyContact companyContact2 = (CompanyContact) map2.get(companyContact);
                if (companyContact2 != null) {
                    realmGet$contacts2.add(companyContact2);
                } else {
                    realmGet$contacts2.add(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.CompanyContactColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyContact.class), companyContact, z, map, set));
                }
            }
        }
        RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$images();
        if (realmGet$images != null) {
            RealmList<FileData> realmGet$images2 = newProxyInstance.realmGet$images();
            realmGet$images2.clear();
            for (int i2 = 0; i2 < realmGet$images.size(); i2++) {
                FileData fileData3 = realmGet$images.get(i2);
                FileData fileData4 = (FileData) map2.get(fileData3);
                if (fileData4 != null) {
                    realmGet$images2.add(fileData4);
                } else {
                    realmGet$images2.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), fileData3, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Company company, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Realm realm2 = realm;
        Company company2 = company;
        Map<RealmModel, Long> map2 = map;
        if (company2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) company2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Company.class);
        long nativePtr = table.getNativePtr();
        CompanyColumnInfo companyColumnInfo = (CompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Company.class);
        long j7 = companyColumnInfo.idIndex;
        C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface = company2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$id();
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
        map2.put(company2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, companyColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            j3 = j2;
        }
        String realmGet$tagline = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$tagline();
        if (realmGet$tagline != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.taglineIndex, j3, realmGet$tagline, false);
        }
        RealmList<String> realmGet$highlights = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$highlights();
        if (realmGet$highlights != null) {
            j4 = j3;
            OsList osList = new OsList(table.getUncheckedRow(j4), companyColumnInfo.highlightsIndex);
            Iterator<String> it = realmGet$highlights.iterator();
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
        FileData realmGet$logo = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$logo();
        if (realmGet$logo != null) {
            Long l = map2.get(realmGet$logo);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$logo, map2));
            }
            j5 = j4;
            Table.nativeSetLink(nativePtr, companyColumnInfo.logoIndex, j4, l.longValue(), false);
        } else {
            j5 = j4;
        }
        FileData realmGet$background = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$background();
        if (realmGet$background != null) {
            Long l2 = map2.get(realmGet$background);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$background, map2));
            }
            Table.nativeSetLink(nativePtr, companyColumnInfo.backgroundIndex, j5, l2.longValue(), false);
        }
        String realmGet$accentColor = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$accentColor();
        if (realmGet$accentColor != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.accentColorIndex, j5, realmGet$accentColor, false);
        }
        String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.summaryIndex, j5, realmGet$summary, false);
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.descriptionIndex, j5, realmGet$description, false);
        }
        String realmGet$delivery = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$delivery();
        if (realmGet$delivery != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.deliveryIndex, j5, realmGet$delivery, false);
        }
        RealmList<CompanyContact> realmGet$contacts = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$contacts();
        if (realmGet$contacts != null) {
            j6 = j5;
            OsList osList2 = new OsList(table.getUncheckedRow(j6), companyColumnInfo.contactsIndex);
            Iterator<CompanyContact> it2 = realmGet$contacts.iterator();
            while (it2.hasNext()) {
                CompanyContact next2 = it2.next();
                Long l3 = map2.get(next2);
                if (l3 == null) {
                    l3 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insert(realm2, next2, map2));
                }
                osList2.addRow(l3.longValue());
            }
        } else {
            j6 = j5;
        }
        RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$images();
        if (realmGet$images != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(j6), companyColumnInfo.imagesIndex);
            Iterator<FileData> it3 = realmGet$images.iterator();
            while (it3.hasNext()) {
                FileData next3 = it3.next();
                Long l4 = map2.get(next3);
                if (l4 == null) {
                    l4 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, next3, map2));
                }
                osList3.addRow(l4.longValue());
            }
        }
        return j6;
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
        Table table = realm2.getTable(Company.class);
        long nativePtr = table.getNativePtr();
        CompanyColumnInfo companyColumnInfo = (CompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Company.class);
        long j7 = companyColumnInfo.idIndex;
        while (it.hasNext()) {
            Company company = (Company) it.next();
            if (!map2.containsKey(company)) {
                if (company instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) company;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(company, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface = company;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$id();
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
                map2.put(company, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = j2;
                    Table.nativeSetString(nativePtr, companyColumnInfo.titleIndex, j2, realmGet$title, false);
                } else {
                    j3 = j2;
                }
                String realmGet$tagline = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$tagline();
                if (realmGet$tagline != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.taglineIndex, j3, realmGet$tagline, false);
                }
                RealmList<String> realmGet$highlights = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$highlights();
                if (realmGet$highlights != null) {
                    j4 = j3;
                    OsList osList = new OsList(table.getUncheckedRow(j4), companyColumnInfo.highlightsIndex);
                    Iterator<String> it2 = realmGet$highlights.iterator();
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
                FileData realmGet$logo = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$logo();
                if (realmGet$logo != null) {
                    Long l = map2.get(realmGet$logo);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$logo, map2));
                    }
                    j5 = j4;
                    table.setLink(companyColumnInfo.logoIndex, j4, l.longValue(), false);
                } else {
                    j5 = j4;
                }
                FileData realmGet$background = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$background();
                if (realmGet$background != null) {
                    Long l2 = map2.get(realmGet$background);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$background, map2));
                    }
                    table.setLink(companyColumnInfo.backgroundIndex, j5, l2.longValue(), false);
                }
                String realmGet$accentColor = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$accentColor();
                if (realmGet$accentColor != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.accentColorIndex, j5, realmGet$accentColor, false);
                }
                String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$summary();
                if (realmGet$summary != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.summaryIndex, j5, realmGet$summary, false);
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.descriptionIndex, j5, realmGet$description, false);
                }
                String realmGet$delivery = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$delivery();
                if (realmGet$delivery != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.deliveryIndex, j5, realmGet$delivery, false);
                }
                RealmList<CompanyContact> realmGet$contacts = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$contacts();
                if (realmGet$contacts != null) {
                    j6 = j5;
                    OsList osList2 = new OsList(table.getUncheckedRow(j6), companyColumnInfo.contactsIndex);
                    Iterator<CompanyContact> it3 = realmGet$contacts.iterator();
                    while (it3.hasNext()) {
                        CompanyContact next2 = it3.next();
                        Long l3 = map2.get(next2);
                        if (l3 == null) {
                            l3 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l3.longValue());
                    }
                } else {
                    j6 = j5;
                }
                RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$images();
                if (realmGet$images != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(j6), companyColumnInfo.imagesIndex);
                    Iterator<FileData> it4 = realmGet$images.iterator();
                    while (it4.hasNext()) {
                        FileData next3 = it4.next();
                        Long l4 = map2.get(next3);
                        if (l4 == null) {
                            l4 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, next3, map2));
                        }
                        osList3.addRow(l4.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Company company, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Company company2 = company;
        Map<RealmModel, Long> map2 = map;
        if (company2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) company2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Company.class);
        long nativePtr = table.getNativePtr();
        CompanyColumnInfo companyColumnInfo = (CompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Company.class);
        long j4 = companyColumnInfo.idIndex;
        C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface = company2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
        map2.put(company2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, companyColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, companyColumnInfo.titleIndex, j2, false);
        }
        String realmGet$tagline = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$tagline();
        if (realmGet$tagline != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.taglineIndex, j2, realmGet$tagline, false);
        } else {
            Table.nativeSetNull(nativePtr, companyColumnInfo.taglineIndex, j2, false);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), companyColumnInfo.highlightsIndex);
        osList.removeAll();
        RealmList<String> realmGet$highlights = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$highlights();
        if (realmGet$highlights != null) {
            Iterator<String> it = realmGet$highlights.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        FileData realmGet$logo = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$logo();
        if (realmGet$logo != null) {
            Long l = map2.get(realmGet$logo);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$logo, map2));
            }
            j3 = j5;
            Table.nativeSetLink(nativePtr, companyColumnInfo.logoIndex, j5, l.longValue(), false);
        } else {
            j3 = j5;
            Table.nativeNullifyLink(nativePtr, companyColumnInfo.logoIndex, j3);
        }
        FileData realmGet$background = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$background();
        if (realmGet$background != null) {
            Long l2 = map2.get(realmGet$background);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$background, map2));
            }
            Table.nativeSetLink(nativePtr, companyColumnInfo.backgroundIndex, j3, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, companyColumnInfo.backgroundIndex, j3);
        }
        String realmGet$accentColor = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$accentColor();
        if (realmGet$accentColor != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.accentColorIndex, j3, realmGet$accentColor, false);
        } else {
            Table.nativeSetNull(nativePtr, companyColumnInfo.accentColorIndex, j3, false);
        }
        String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.summaryIndex, j3, realmGet$summary, false);
        } else {
            Table.nativeSetNull(nativePtr, companyColumnInfo.summaryIndex, j3, false);
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.descriptionIndex, j3, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, companyColumnInfo.descriptionIndex, j3, false);
        }
        String realmGet$delivery = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$delivery();
        if (realmGet$delivery != null) {
            Table.nativeSetString(nativePtr, companyColumnInfo.deliveryIndex, j3, realmGet$delivery, false);
        } else {
            Table.nativeSetNull(nativePtr, companyColumnInfo.deliveryIndex, j3, false);
        }
        long j6 = j3;
        OsList osList2 = new OsList(table.getUncheckedRow(j6), companyColumnInfo.contactsIndex);
        RealmList<CompanyContact> realmGet$contacts = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$contacts();
        if (realmGet$contacts == null || ((long) realmGet$contacts.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$contacts != null) {
                Iterator<CompanyContact> it2 = realmGet$contacts.iterator();
                while (it2.hasNext()) {
                    CompanyContact next2 = it2.next();
                    Long l3 = map2.get(next2);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l3.longValue());
                }
            }
        } else {
            int size = realmGet$contacts.size();
            for (int i = 0; i < size; i++) {
                CompanyContact companyContact = realmGet$contacts.get(i);
                Long l4 = map2.get(companyContact);
                if (l4 == null) {
                    l4 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insertOrUpdate(realm2, companyContact, map2));
                }
                osList2.setRow((long) i, l4.longValue());
            }
        }
        OsList osList3 = new OsList(table.getUncheckedRow(j6), companyColumnInfo.imagesIndex);
        RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$images();
        if (realmGet$images == null || ((long) realmGet$images.size()) != osList3.size()) {
            osList3.removeAll();
            if (realmGet$images != null) {
                Iterator<FileData> it3 = realmGet$images.iterator();
                while (it3.hasNext()) {
                    FileData next3 = it3.next();
                    Long l5 = map2.get(next3);
                    if (l5 == null) {
                        l5 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, next3, map2));
                    }
                    osList3.addRow(l5.longValue());
                }
            }
        } else {
            int size2 = realmGet$images.size();
            for (int i2 = 0; i2 < size2; i2++) {
                FileData fileData = realmGet$images.get(i2);
                Long l6 = map2.get(fileData);
                if (l6 == null) {
                    l6 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, fileData, map2));
                }
                osList3.setRow((long) i2, l6.longValue());
            }
        }
        return j6;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Company.class);
        long nativePtr = table.getNativePtr();
        CompanyColumnInfo companyColumnInfo = (CompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Company.class);
        long j5 = companyColumnInfo.idIndex;
        while (it.hasNext()) {
            Company company = (Company) it.next();
            if (!map2.containsKey(company)) {
                if (company instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) company;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(company, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface = company;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j5);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j5, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j5, realmGet$id) : j;
                map2.put(company, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j5;
                    Table.nativeSetString(nativePtr, companyColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j5;
                    Table.nativeSetNull(nativePtr, companyColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$tagline = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$tagline();
                if (realmGet$tagline != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.taglineIndex, j3, realmGet$tagline, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyColumnInfo.taglineIndex, j3, false);
                }
                long j6 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j6), companyColumnInfo.highlightsIndex);
                osList.removeAll();
                RealmList<String> realmGet$highlights = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$highlights();
                if (realmGet$highlights != null) {
                    Iterator<String> it2 = realmGet$highlights.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
                FileData realmGet$logo = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$logo();
                if (realmGet$logo != null) {
                    Long l = map2.get(realmGet$logo);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$logo, map2));
                    }
                    j4 = j6;
                    Table.nativeSetLink(nativePtr, companyColumnInfo.logoIndex, j6, l.longValue(), false);
                } else {
                    j4 = j6;
                    Table.nativeNullifyLink(nativePtr, companyColumnInfo.logoIndex, j4);
                }
                FileData realmGet$background = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$background();
                if (realmGet$background != null) {
                    Long l2 = map2.get(realmGet$background);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$background, map2));
                    }
                    Table.nativeSetLink(nativePtr, companyColumnInfo.backgroundIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, companyColumnInfo.backgroundIndex, j4);
                }
                String realmGet$accentColor = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$accentColor();
                if (realmGet$accentColor != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.accentColorIndex, j4, realmGet$accentColor, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyColumnInfo.accentColorIndex, j4, false);
                }
                String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$summary();
                if (realmGet$summary != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.summaryIndex, j4, realmGet$summary, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyColumnInfo.summaryIndex, j4, false);
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.descriptionIndex, j4, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyColumnInfo.descriptionIndex, j4, false);
                }
                String realmGet$delivery = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$delivery();
                if (realmGet$delivery != null) {
                    Table.nativeSetString(nativePtr, companyColumnInfo.deliveryIndex, j4, realmGet$delivery, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyColumnInfo.deliveryIndex, j4, false);
                }
                long j7 = j4;
                OsList osList2 = new OsList(table.getUncheckedRow(j7), companyColumnInfo.contactsIndex);
                RealmList<CompanyContact> realmGet$contacts = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$contacts();
                if (realmGet$contacts == null || ((long) realmGet$contacts.size()) != osList2.size()) {
                    osList2.removeAll();
                    if (realmGet$contacts != null) {
                        Iterator<CompanyContact> it3 = realmGet$contacts.iterator();
                        while (it3.hasNext()) {
                            CompanyContact next2 = it3.next();
                            Long l3 = map2.get(next2);
                            if (l3 == null) {
                                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l3.longValue());
                        }
                    }
                } else {
                    int i = 0;
                    for (int size = realmGet$contacts.size(); i < size; size = size) {
                        CompanyContact companyContact = realmGet$contacts.get(i);
                        Long l4 = map2.get(companyContact);
                        if (l4 == null) {
                            l4 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.insertOrUpdate(realm2, companyContact, map2));
                        }
                        osList2.setRow((long) i, l4.longValue());
                        i++;
                    }
                }
                OsList osList3 = new OsList(table.getUncheckedRow(j7), companyColumnInfo.imagesIndex);
                RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$images();
                if (realmGet$images == null || ((long) realmGet$images.size()) != osList3.size()) {
                    osList3.removeAll();
                    if (realmGet$images != null) {
                        Iterator<FileData> it4 = realmGet$images.iterator();
                        while (it4.hasNext()) {
                            FileData next3 = it4.next();
                            Long l5 = map2.get(next3);
                            if (l5 == null) {
                                l5 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, next3, map2));
                            }
                            osList3.addRow(l5.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$images.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        FileData fileData = realmGet$images.get(i2);
                        Long l6 = map2.get(fileData);
                        if (l6 == null) {
                            l6 = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, fileData, map2));
                        }
                        osList3.setRow((long) i2, l6.longValue());
                    }
                }
                j5 = j2;
            }
        }
    }

    public static Company createDetachedCopy(Company company, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Company company2;
        if (i > i2 || company == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(company);
        if (cacheData == null) {
            company2 = new Company();
            map.put(company, new RealmObjectProxy.CacheData(i, company2));
        } else if (i >= cacheData.minDepth) {
            return (Company) cacheData.object;
        } else {
            cacheData.minDepth = i;
            company2 = (Company) cacheData.object;
        }
        C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface = company2;
        C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2 = company;
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$tagline(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$tagline());
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$highlights(new RealmList());
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmGet$highlights().addAll(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$highlights());
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$logo(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$logo(), i3, i2, map));
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$background(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$background(), i3, i2, map));
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$accentColor(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$accentColor());
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$summary(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$summary());
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$description(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$delivery(ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$delivery());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$contacts((RealmList<CompanyContact>) null);
        } else {
            RealmList<CompanyContact> realmGet$contacts = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$contacts();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$contacts(realmList);
            int size = realmGet$contacts.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.createDetachedCopy(realmGet$contacts.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$images((RealmList<FileData>) null);
        } else {
            RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$images();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface.realmSet$images(realmList2);
            int size2 = realmGet$images.size();
            for (int i5 = 0; i5 < size2; i5++) {
                realmList2.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy(realmGet$images.get(i5), i3, i2, map));
            }
        }
        return company2;
    }

    static Company update(Realm realm, CompanyColumnInfo companyColumnInfo, Company company, Company company2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        CompanyColumnInfo companyColumnInfo2 = companyColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface = company;
        C4611x5a122a54 ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2 = company2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Company.class), companyColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(companyColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(companyColumnInfo2.titleIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(companyColumnInfo2.taglineIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$tagline());
        osObjectBuilder.addStringList(companyColumnInfo2.highlightsIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$highlights());
        FileData realmGet$logo = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$logo();
        if (realmGet$logo == null) {
            osObjectBuilder.addNull(companyColumnInfo2.logoIndex);
        } else {
            FileData fileData = (FileData) map2.get(realmGet$logo);
            if (fileData != null) {
                osObjectBuilder.addObject(companyColumnInfo2.logoIndex, fileData);
            } else {
                osObjectBuilder.addObject(companyColumnInfo2.logoIndex, ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$logo, true, map, set));
            }
        }
        FileData realmGet$background = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$background();
        if (realmGet$background == null) {
            osObjectBuilder.addNull(companyColumnInfo2.backgroundIndex);
        } else {
            FileData fileData2 = (FileData) map2.get(realmGet$background);
            if (fileData2 != null) {
                osObjectBuilder.addObject(companyColumnInfo2.backgroundIndex, fileData2);
            } else {
                osObjectBuilder.addObject(companyColumnInfo2.backgroundIndex, ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$background, true, map, set));
            }
        }
        osObjectBuilder.addString(companyColumnInfo2.accentColorIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$accentColor());
        osObjectBuilder.addString(companyColumnInfo2.summaryIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$summary());
        osObjectBuilder.addString(companyColumnInfo2.descriptionIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$description());
        osObjectBuilder.addString(companyColumnInfo2.deliveryIndex, ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$delivery());
        RealmList<CompanyContact> realmGet$contacts = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$contacts();
        if (realmGet$contacts != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$contacts.size(); i++) {
                CompanyContact companyContact = realmGet$contacts.get(i);
                CompanyContact companyContact2 = (CompanyContact) map2.get(companyContact);
                if (companyContact2 != null) {
                    realmList.add(companyContact2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy.CompanyContactColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyContact.class), companyContact, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(companyColumnInfo2.contactsIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(companyColumnInfo2.contactsIndex, new RealmList());
        }
        RealmList<FileData> realmGet$images = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxyinterface2.realmGet$images();
        if (realmGet$images != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$images.size(); i2++) {
                FileData fileData3 = realmGet$images.get(i2);
                FileData fileData4 = (FileData) map2.get(fileData3);
                if (fileData4 != null) {
                    realmList2.add(fileData4);
                } else {
                    realmList2.add(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), fileData3, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(companyColumnInfo2.imagesIndex, realmList2);
        } else {
            osObjectBuilder.addObjectList(companyColumnInfo2.imagesIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return company;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Company = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{tagline:");
        sb.append(realmGet$tagline() != null ? realmGet$tagline() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{highlights:");
        sb.append("RealmList<String>[");
        sb.append(realmGet$highlights().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{logo:");
        FileData realmGet$logo = realmGet$logo();
        String str2 = ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        sb.append(realmGet$logo != null ? str2 : str);
        sb.append("}");
        sb.append(",");
        sb.append("{background:");
        if (realmGet$background() == null) {
            str2 = str;
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{accentColor:");
        sb.append(realmGet$accentColor() != null ? realmGet$accentColor() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{summary:");
        sb.append(realmGet$summary() != null ? realmGet$summary() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description() != null ? realmGet$description() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{delivery:");
        if (realmGet$delivery() != null) {
            str = realmGet$delivery();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{contacts:");
        sb.append("RealmList<CompanyContact>[");
        sb.append(realmGet$contacts().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{images:");
        sb.append("RealmList<FileData>[");
        sb.append(realmGet$images().size());
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
        ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy ru_unicorn_ujin_data_realm_marketplace_companyrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CompanyRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_companyrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_companyrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
