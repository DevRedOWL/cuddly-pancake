package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p046io.realm.BaseRealm;
import p046io.realm.C4756x99acf311;
import p046io.realm.C4766x7a38e7a6;
import p046io.realm.C4772xa5d8f71d;
import p046io.realm.C4776x6ae644c3;
import p046io.realm.C4778x8713e227;
import p046io.realm.C4794x165b0474;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy */
public class C4774x33c567d4 extends TalkingInfo implements RealmObjectProxy, C4775xa897b3c5 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TalkingInfoColumnInfo columnInfo;
    private RealmList<TalkingPhotos> imageRealmList;
    private ProxyState<TalkingInfo> proxyState;
    private RealmList<RentAttributes> rentAttributesRealmList;
    private RealmList<RentChildren> rentChildreRealmList;
    private RealmList<Renters> rentersRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TalkingInfo";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy$TalkingInfoColumnInfo */
    static final class TalkingInfoColumnInfo extends ColumnInfo {
        long adressIndex;
        long idIndex;
        long imageIndex;
        long maxColumnIndexValue;
        long parentIsBusyIndex;
        long rentAttributesIndex;
        long rentChildreIndex;
        long rentersIndex;
        long schemaPhotoIndex;
        long stateRentaIndex;
        long titleIndex;

        TalkingInfoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.adressIndex = addColumnDetails("adress", "adress", objectSchemaInfo);
            this.schemaPhotoIndex = addColumnDetails("schemaPhoto", "schemaPhoto", objectSchemaInfo);
            this.stateRentaIndex = addColumnDetails("stateRenta", "stateRenta", objectSchemaInfo);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.rentAttributesIndex = addColumnDetails("rentAttributes", "rentAttributes", objectSchemaInfo);
            this.parentIsBusyIndex = addColumnDetails("parentIsBusy", "parentIsBusy", objectSchemaInfo);
            this.rentChildreIndex = addColumnDetails("rentChildre", "rentChildre", objectSchemaInfo);
            this.rentersIndex = addColumnDetails("renters", "renters", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TalkingInfoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TalkingInfoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TalkingInfoColumnInfo talkingInfoColumnInfo = (TalkingInfoColumnInfo) columnInfo;
            TalkingInfoColumnInfo talkingInfoColumnInfo2 = (TalkingInfoColumnInfo) columnInfo2;
            talkingInfoColumnInfo2.idIndex = talkingInfoColumnInfo.idIndex;
            talkingInfoColumnInfo2.titleIndex = talkingInfoColumnInfo.titleIndex;
            talkingInfoColumnInfo2.adressIndex = talkingInfoColumnInfo.adressIndex;
            talkingInfoColumnInfo2.schemaPhotoIndex = talkingInfoColumnInfo.schemaPhotoIndex;
            talkingInfoColumnInfo2.stateRentaIndex = talkingInfoColumnInfo.stateRentaIndex;
            talkingInfoColumnInfo2.imageIndex = talkingInfoColumnInfo.imageIndex;
            talkingInfoColumnInfo2.rentAttributesIndex = talkingInfoColumnInfo.rentAttributesIndex;
            talkingInfoColumnInfo2.parentIsBusyIndex = talkingInfoColumnInfo.parentIsBusyIndex;
            talkingInfoColumnInfo2.rentChildreIndex = talkingInfoColumnInfo.rentChildreIndex;
            talkingInfoColumnInfo2.rentersIndex = talkingInfoColumnInfo.rentersIndex;
            talkingInfoColumnInfo2.maxColumnIndexValue = talkingInfoColumnInfo.maxColumnIndexValue;
        }
    }

    C4774x33c567d4() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TalkingInfoColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$adress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.adressIndex);
    }

    public void realmSet$adress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.adressIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.adressIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.adressIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.adressIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public TalkingPhotosFile realmGet$schemaPhoto() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.schemaPhotoIndex)) {
            return null;
        }
        return (TalkingPhotosFile) this.proxyState.getRealm$realm().get(TalkingPhotosFile.class, this.proxyState.getRow$realm().getLink(this.columnInfo.schemaPhotoIndex), false, Collections.emptyList());
    }

    public void realmSet$schemaPhoto(TalkingPhotosFile talkingPhotosFile) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (talkingPhotosFile == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.schemaPhotoIndex);
                return;
            }
            this.proxyState.checkValidObject(talkingPhotosFile);
            this.proxyState.getRow$realm().setLink(this.columnInfo.schemaPhotoIndex, ((RealmObjectProxy) talkingPhotosFile).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("schemaPhoto")) {
            if (talkingPhotosFile != null && !RealmObject.isManaged(talkingPhotosFile)) {
                talkingPhotosFile = (TalkingPhotosFile) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(talkingPhotosFile, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (talkingPhotosFile == null) {
                row$realm.nullifyLink(this.columnInfo.schemaPhotoIndex);
                return;
            }
            this.proxyState.checkValidObject(talkingPhotosFile);
            row$realm.getTable().setLink(this.columnInfo.schemaPhotoIndex, row$realm.getIndex(), ((RealmObjectProxy) talkingPhotosFile).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public StateRenta realmGet$stateRenta() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.stateRentaIndex)) {
            return null;
        }
        return (StateRenta) this.proxyState.getRealm$realm().get(StateRenta.class, this.proxyState.getRow$realm().getLink(this.columnInfo.stateRentaIndex), false, Collections.emptyList());
    }

    public void realmSet$stateRenta(StateRenta stateRenta) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (stateRenta == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.stateRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(stateRenta);
            this.proxyState.getRow$realm().setLink(this.columnInfo.stateRentaIndex, ((RealmObjectProxy) stateRenta).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("stateRenta")) {
            if (stateRenta != null && !RealmObject.isManaged(stateRenta)) {
                stateRenta = (StateRenta) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(stateRenta, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (stateRenta == null) {
                row$realm.nullifyLink(this.columnInfo.stateRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(stateRenta);
            row$realm.getTable().setLink(this.columnInfo.stateRentaIndex, row$realm.getIndex(), ((RealmObjectProxy) stateRenta).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RealmList<TalkingPhotos> realmGet$image() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<TalkingPhotos> realmList = this.imageRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.imageRealmList = new RealmList<>(TalkingPhotos.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.imageIndex), this.proxyState.getRealm$realm());
        return this.imageRealmList;
    }

    public void realmSet$image(RealmList<TalkingPhotos> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("image")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<TalkingPhotos> realmList2 = new RealmList<>();
                Iterator<TalkingPhotos> it = realmList.iterator();
                while (it.hasNext()) {
                    TalkingPhotos next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.imageIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    TalkingPhotos talkingPhotos = realmList.get(i);
                    this.proxyState.checkValidObject(talkingPhotos);
                    modelList.addRow(((RealmObjectProxy) talkingPhotos).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            TalkingPhotos talkingPhotos2 = realmList.get(i);
            this.proxyState.checkValidObject(talkingPhotos2);
            modelList.setRow((long) i, ((RealmObjectProxy) talkingPhotos2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<RentAttributes> realmGet$rentAttributes() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<RentAttributes> realmList = this.rentAttributesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.rentAttributesRealmList = new RealmList<>(RentAttributes.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.rentAttributesIndex), this.proxyState.getRealm$realm());
        return this.rentAttributesRealmList;
    }

    public void realmSet$rentAttributes(RealmList<RentAttributes> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("rentAttributes")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<RentAttributes> realmList2 = new RealmList<>();
                Iterator<RentAttributes> it = realmList.iterator();
                while (it.hasNext()) {
                    RentAttributes next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.rentAttributesIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    RentAttributes rentAttributes = realmList.get(i);
                    this.proxyState.checkValidObject(rentAttributes);
                    modelList.addRow(((RealmObjectProxy) rentAttributes).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            RentAttributes rentAttributes2 = realmList.get(i);
            this.proxyState.checkValidObject(rentAttributes2);
            modelList.setRow((long) i, ((RealmObjectProxy) rentAttributes2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public boolean realmGet$parentIsBusy() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.parentIsBusyIndex);
    }

    public void realmSet$parentIsBusy(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.parentIsBusyIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.parentIsBusyIndex, row$realm.getIndex(), z, true);
        }
    }

    public RealmList<RentChildren> realmGet$rentChildre() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<RentChildren> realmList = this.rentChildreRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.rentChildreRealmList = new RealmList<>(RentChildren.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.rentChildreIndex), this.proxyState.getRealm$realm());
        return this.rentChildreRealmList;
    }

    public void realmSet$rentChildre(RealmList<RentChildren> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("rentChildre")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<RentChildren> realmList2 = new RealmList<>();
                Iterator<RentChildren> it = realmList.iterator();
                while (it.hasNext()) {
                    RentChildren next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.rentChildreIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    RentChildren rentChildren = realmList.get(i);
                    this.proxyState.checkValidObject(rentChildren);
                    modelList.addRow(((RealmObjectProxy) rentChildren).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            RentChildren rentChildren2 = realmList.get(i);
            this.proxyState.checkValidObject(rentChildren2);
            modelList.setRow((long) i, ((RealmObjectProxy) rentChildren2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 10, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("adress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("schemaPhoto", RealmFieldType.OBJECT, C4776x6ae644c3.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("stateRenta", RealmFieldType.OBJECT, C4756x99acf311.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("image", RealmFieldType.LIST, C4778x8713e227.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("rentAttributes", RealmFieldType.LIST, C4794x165b0474.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("parentIsBusy", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedLinkProperty("rentChildre", RealmFieldType.LIST, C4766x7a38e7a6.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("renters", RealmFieldType.LIST, C4772xa5d8f71d.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TalkingInfoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TalkingInfoColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 6
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0063
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy$TalkingInfoColumnInfo r4 = (p046io.realm.C4774x33c567d4.TalkingInfoColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            r7 = -1
            if (r6 != 0) goto L_0x0030
            long r9 = r14.getLong(r1)
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x005e }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005e }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005e }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy     // Catch:{ all -> 0x005e }
            r3.<init>()     // Catch:{ all -> 0x005e }
            r6.clear()
            goto L_0x0064
        L_0x005e:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0063:
            r3 = r2
        L_0x0064:
            java.lang.String r4 = "renters"
            java.lang.String r5 = "rentChildre"
            java.lang.String r6 = "rentAttributes"
            java.lang.String r7 = "image"
            java.lang.String r8 = "stateRenta"
            java.lang.String r9 = "schemaPhoto"
            if (r3 != 0) goto L_0x00d9
            boolean r3 = r14.has(r9)
            if (r3 == 0) goto L_0x007b
            r0.add(r9)
        L_0x007b:
            boolean r3 = r14.has(r8)
            if (r3 == 0) goto L_0x0084
            r0.add(r8)
        L_0x0084:
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x008d
            r0.add(r7)
        L_0x008d:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0096
            r0.add(r6)
        L_0x0096:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x009f
            r0.add(r5)
        L_0x009f:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x00a8
            r0.add(r4)
        L_0x00a8:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00d1
            boolean r3 = r14.isNull(r1)
            r10 = 1
            if (r3 == 0) goto L_0x00bf
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r10, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy r3 = (p046io.realm.C4774x33c567d4) r3
            goto L_0x00d9
        L_0x00bf:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r10, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy r3 = (p046io.realm.C4774x33c567d4) r3
            goto L_0x00d9
        L_0x00d1:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00d9:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxyInterface r0 = (p046io.realm.C4775xa897b3c5) r0
            java.lang.String r1 = "title"
            boolean r10 = r14.has(r1)
            if (r10 == 0) goto L_0x00f5
            boolean r10 = r14.isNull(r1)
            if (r10 == 0) goto L_0x00ee
            r0.realmSet$title(r2)
            goto L_0x00f5
        L_0x00ee:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x00f5:
            java.lang.String r1 = "adress"
            boolean r10 = r14.has(r1)
            if (r10 == 0) goto L_0x010e
            boolean r10 = r14.isNull(r1)
            if (r10 == 0) goto L_0x0107
            r0.realmSet$adress(r2)
            goto L_0x010e
        L_0x0107:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$adress(r1)
        L_0x010e:
            boolean r1 = r14.has(r9)
            if (r1 == 0) goto L_0x0129
            boolean r1 = r14.isNull(r9)
            if (r1 == 0) goto L_0x011e
            r0.realmSet$schemaPhoto(r2)
            goto L_0x0129
        L_0x011e:
            org.json.JSONObject r1 = r14.getJSONObject(r9)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile r1 = p046io.realm.C4776x6ae644c3.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$schemaPhoto(r1)
        L_0x0129:
            boolean r1 = r14.has(r8)
            if (r1 == 0) goto L_0x0144
            boolean r1 = r14.isNull(r8)
            if (r1 == 0) goto L_0x0139
            r0.realmSet$stateRenta(r2)
            goto L_0x0144
        L_0x0139:
            org.json.JSONObject r1 = r14.getJSONObject(r8)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r1 = p046io.realm.C4756x99acf311.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$stateRenta(r1)
        L_0x0144:
            boolean r1 = r14.has(r7)
            r8 = 0
            if (r1 == 0) goto L_0x0179
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0155
            r0.realmSet$image(r2)
            goto L_0x0179
        L_0x0155:
            io.realm.RealmList r1 = r0.realmGet$image()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r7)
            r7 = 0
        L_0x0161:
            int r9 = r1.length()
            if (r7 >= r9) goto L_0x0179
            org.json.JSONObject r9 = r1.getJSONObject(r7)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos r9 = p046io.realm.C4778x8713e227.createOrUpdateUsingJsonObject(r13, r9, r15)
            io.realm.RealmList r10 = r0.realmGet$image()
            r10.add(r9)
            int r7 = r7 + 1
            goto L_0x0161
        L_0x0179:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x01ad
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0189
            r0.realmSet$rentAttributes(r2)
            goto L_0x01ad
        L_0x0189:
            io.realm.RealmList r1 = r0.realmGet$rentAttributes()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r6)
            r6 = 0
        L_0x0195:
            int r7 = r1.length()
            if (r6 >= r7) goto L_0x01ad
            org.json.JSONObject r7 = r1.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentAttributes r7 = p046io.realm.C4794x165b0474.createOrUpdateUsingJsonObject(r13, r7, r15)
            io.realm.RealmList r9 = r0.realmGet$rentAttributes()
            r9.add(r7)
            int r6 = r6 + 1
            goto L_0x0195
        L_0x01ad:
            java.lang.String r1 = "parentIsBusy"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x01cb
            boolean r6 = r14.isNull(r1)
            if (r6 != 0) goto L_0x01c3
            boolean r1 = r14.getBoolean(r1)
            r0.realmSet$parentIsBusy(r1)
            goto L_0x01cb
        L_0x01c3:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'parentIsBusy' to null."
            r13.<init>(r14)
            throw r13
        L_0x01cb:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x01db
            r0.realmSet$rentChildre(r2)
            goto L_0x01ff
        L_0x01db:
            io.realm.RealmList r1 = r0.realmGet$rentChildre()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r5)
            r5 = 0
        L_0x01e7:
            int r6 = r1.length()
            if (r5 >= r6) goto L_0x01ff
            org.json.JSONObject r6 = r1.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentChildren r6 = p046io.realm.C4766x7a38e7a6.createOrUpdateUsingJsonObject(r13, r6, r15)
            io.realm.RealmList r7 = r0.realmGet$rentChildre()
            r7.add(r6)
            int r5 = r5 + 1
            goto L_0x01e7
        L_0x01ff:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x0232
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x020f
            r0.realmSet$renters(r2)
            goto L_0x0232
        L_0x020f:
            io.realm.RealmList r1 = r0.realmGet$renters()
            r1.clear()
            org.json.JSONArray r14 = r14.getJSONArray(r4)
        L_0x021a:
            int r1 = r14.length()
            if (r8 >= r1) goto L_0x0232
            org.json.JSONObject r1 = r14.getJSONObject(r8)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r1 = p046io.realm.C4772xa5d8f71d.createOrUpdateUsingJsonObject(r13, r1, r15)
            io.realm.RealmList r2 = r0.realmGet$renters()
            r2.add(r1)
            int r8 = r8 + 1
            goto L_0x021a
        L_0x0232:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4774x33c567d4.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo");
    }

    public static TalkingInfo createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TalkingInfo talkingInfo = new TalkingInfo();
        C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface = talkingInfo;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("adress")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$adress(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$adress((String) null);
                }
            } else if (nextName.equals("schemaPhoto")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$schemaPhoto((TalkingPhotosFile) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$schemaPhoto(C4776x6ae644c3.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("stateRenta")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$stateRenta((StateRenta) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$stateRenta(C4756x99acf311.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("image")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$image((RealmList<TalkingPhotos>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$image(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$image().add(C4778x8713e227.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("rentAttributes")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$rentAttributes((RealmList<RentAttributes>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$rentAttributes(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentAttributes().add(C4794x165b0474.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("parentIsBusy")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$parentIsBusy(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'parentIsBusy' to null.");
                }
            } else if (nextName.equals("rentChildre")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$rentChildre((RealmList<RentChildren>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$rentChildre(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentChildre().add(C4766x7a38e7a6.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("renters")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$renters((RealmList<Renters>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$renters(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$renters().add(C4772xa5d8f71d.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (TalkingInfo) realm.copyToRealm(talkingInfo, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4774x33c567d4 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingInfo.class), false, Collections.emptyList());
        C4774x33c567d4 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxy = new C4774x33c567d4();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4774x33c567d4.TalkingInfoColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxyInterface r5 = (p046io.realm.C4775xa897b3c5) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy     // Catch:{ all -> 0x0088 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4774x33c567d4.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingInfoRealmProxy$TalkingInfoColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingInfo");
    }

    public static TalkingInfo copy(Realm realm, TalkingInfoColumnInfo talkingInfoColumnInfo, TalkingInfo talkingInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        TalkingInfoColumnInfo talkingInfoColumnInfo2 = talkingInfoColumnInfo;
        TalkingInfo talkingInfo2 = talkingInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(talkingInfo2);
        if (realmObjectProxy != null) {
            return (TalkingInfo) realmObjectProxy;
        }
        C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface = talkingInfo2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TalkingInfo.class), talkingInfoColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(talkingInfoColumnInfo2.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(talkingInfoColumnInfo2.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(talkingInfoColumnInfo2.adressIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$adress());
        osObjectBuilder.addBoolean(talkingInfoColumnInfo2.parentIsBusyIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$parentIsBusy()));
        C4774x33c567d4 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(talkingInfo2, newProxyInstance);
        TalkingPhotosFile realmGet$schemaPhoto = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$schemaPhoto();
        if (realmGet$schemaPhoto == null) {
            newProxyInstance.realmSet$schemaPhoto((TalkingPhotosFile) null);
        } else {
            TalkingPhotosFile talkingPhotosFile = (TalkingPhotosFile) map2.get(realmGet$schemaPhoto);
            if (talkingPhotosFile != null) {
                newProxyInstance.realmSet$schemaPhoto(talkingPhotosFile);
            } else {
                newProxyInstance.realmSet$schemaPhoto(C4776x6ae644c3.copyOrUpdate(realm, (C4776x6ae644c3.TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class), realmGet$schemaPhoto, z, map, set));
            }
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta == null) {
            newProxyInstance.realmSet$stateRenta((StateRenta) null);
        } else {
            StateRenta stateRenta = (StateRenta) map2.get(realmGet$stateRenta);
            if (stateRenta != null) {
                newProxyInstance.realmSet$stateRenta(stateRenta);
            } else {
                newProxyInstance.realmSet$stateRenta(C4756x99acf311.copyOrUpdate(realm, (C4756x99acf311.StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class), realmGet$stateRenta, z, map, set));
            }
        }
        RealmList<TalkingPhotos> realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            RealmList<TalkingPhotos> realmGet$image2 = newProxyInstance.realmGet$image();
            realmGet$image2.clear();
            for (int i = 0; i < realmGet$image.size(); i++) {
                TalkingPhotos talkingPhotos = realmGet$image.get(i);
                TalkingPhotos talkingPhotos2 = (TalkingPhotos) map2.get(talkingPhotos);
                if (talkingPhotos2 != null) {
                    realmGet$image2.add(talkingPhotos2);
                } else {
                    realmGet$image2.add(C4778x8713e227.copyOrUpdate(realm, (C4778x8713e227.TalkingPhotosColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotos.class), talkingPhotos, z, map, set));
                }
            }
        }
        RealmList<RentAttributes> realmGet$rentAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentAttributes();
        if (realmGet$rentAttributes != null) {
            RealmList<RentAttributes> realmGet$rentAttributes2 = newProxyInstance.realmGet$rentAttributes();
            realmGet$rentAttributes2.clear();
            for (int i2 = 0; i2 < realmGet$rentAttributes.size(); i2++) {
                RentAttributes rentAttributes = realmGet$rentAttributes.get(i2);
                RentAttributes rentAttributes2 = (RentAttributes) map2.get(rentAttributes);
                if (rentAttributes2 != null) {
                    realmGet$rentAttributes2.add(rentAttributes2);
                } else {
                    realmGet$rentAttributes2.add(C4794x165b0474.copyOrUpdate(realm, (C4794x165b0474.RentAttributesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class), rentAttributes, z, map, set));
                }
            }
        }
        RealmList<RentChildren> realmGet$rentChildre = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentChildre();
        if (realmGet$rentChildre != null) {
            RealmList<RentChildren> realmGet$rentChildre2 = newProxyInstance.realmGet$rentChildre();
            realmGet$rentChildre2.clear();
            for (int i3 = 0; i3 < realmGet$rentChildre.size(); i3++) {
                RentChildren rentChildren = realmGet$rentChildre.get(i3);
                RentChildren rentChildren2 = (RentChildren) map2.get(rentChildren);
                if (rentChildren2 != null) {
                    realmGet$rentChildre2.add(rentChildren2);
                } else {
                    realmGet$rentChildre2.add(C4766x7a38e7a6.copyOrUpdate(realm, (C4766x7a38e7a6.RentChildrenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentChildren.class), rentChildren, z, map, set));
                }
            }
        }
        RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$renters();
        if (realmGet$renters != null) {
            RealmList<Renters> realmGet$renters2 = newProxyInstance.realmGet$renters();
            realmGet$renters2.clear();
            for (int i4 = 0; i4 < realmGet$renters.size(); i4++) {
                Renters renters = realmGet$renters.get(i4);
                Renters renters2 = (Renters) map2.get(renters);
                if (renters2 != null) {
                    realmGet$renters2.add(renters2);
                } else {
                    realmGet$renters2.add(C4772xa5d8f71d.copyOrUpdate(realm, (C4772xa5d8f71d.RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class), renters, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, TalkingInfo talkingInfo, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        TalkingInfo talkingInfo2 = talkingInfo;
        Map<RealmModel, Long> map2 = map;
        if (talkingInfo2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingInfo2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TalkingInfo.class);
        long nativePtr = table.getNativePtr();
        TalkingInfoColumnInfo talkingInfoColumnInfo = (TalkingInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingInfo.class);
        long j4 = talkingInfoColumnInfo.idIndex;
        C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface = talkingInfo2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j4, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j4, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        long j5 = j;
        map2.put(talkingInfo2, Long.valueOf(j5));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = j5;
            Table.nativeSetString(nativePtr, talkingInfoColumnInfo.titleIndex, j5, realmGet$title, false);
        } else {
            j2 = j5;
        }
        String realmGet$adress = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$adress();
        if (realmGet$adress != null) {
            Table.nativeSetString(nativePtr, talkingInfoColumnInfo.adressIndex, j2, realmGet$adress, false);
        }
        TalkingPhotosFile realmGet$schemaPhoto = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$schemaPhoto();
        if (realmGet$schemaPhoto != null) {
            Long l = map2.get(realmGet$schemaPhoto);
            if (l == null) {
                l = Long.valueOf(C4776x6ae644c3.insert(realm2, realmGet$schemaPhoto, map2));
            }
            Table.nativeSetLink(nativePtr, talkingInfoColumnInfo.schemaPhotoIndex, j2, l.longValue(), false);
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta != null) {
            Long l2 = map2.get(realmGet$stateRenta);
            if (l2 == null) {
                l2 = Long.valueOf(C4756x99acf311.insert(realm2, realmGet$stateRenta, map2));
            }
            Table.nativeSetLink(nativePtr, talkingInfoColumnInfo.stateRentaIndex, j2, l2.longValue(), false);
        }
        RealmList<TalkingPhotos> realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            j3 = j2;
            OsList osList = new OsList(table.getUncheckedRow(j3), talkingInfoColumnInfo.imageIndex);
            Iterator<TalkingPhotos> it = realmGet$image.iterator();
            while (it.hasNext()) {
                TalkingPhotos next = it.next();
                Long l3 = map2.get(next);
                if (l3 == null) {
                    l3 = Long.valueOf(C4778x8713e227.insert(realm2, next, map2));
                }
                osList.addRow(l3.longValue());
            }
        } else {
            j3 = j2;
        }
        RealmList<RentAttributes> realmGet$rentAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentAttributes();
        if (realmGet$rentAttributes != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j3), talkingInfoColumnInfo.rentAttributesIndex);
            Iterator<RentAttributes> it2 = realmGet$rentAttributes.iterator();
            while (it2.hasNext()) {
                RentAttributes next2 = it2.next();
                Long l4 = map2.get(next2);
                if (l4 == null) {
                    l4 = Long.valueOf(C4794x165b0474.insert(realm2, next2, map2));
                }
                osList2.addRow(l4.longValue());
            }
        }
        long j6 = j3;
        Table.nativeSetBoolean(nativePtr, talkingInfoColumnInfo.parentIsBusyIndex, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$parentIsBusy(), false);
        RealmList<RentChildren> realmGet$rentChildre = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentChildre();
        if (realmGet$rentChildre != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(j6), talkingInfoColumnInfo.rentChildreIndex);
            Iterator<RentChildren> it3 = realmGet$rentChildre.iterator();
            while (it3.hasNext()) {
                RentChildren next3 = it3.next();
                Long l5 = map2.get(next3);
                if (l5 == null) {
                    l5 = Long.valueOf(C4766x7a38e7a6.insert(realm2, next3, map2));
                }
                osList3.addRow(l5.longValue());
            }
        }
        RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$renters();
        if (realmGet$renters != null) {
            OsList osList4 = new OsList(table.getUncheckedRow(j6), talkingInfoColumnInfo.rentersIndex);
            Iterator<Renters> it4 = realmGet$renters.iterator();
            while (it4.hasNext()) {
                Renters next4 = it4.next();
                Long l6 = map2.get(next4);
                if (l6 == null) {
                    l6 = Long.valueOf(C4772xa5d8f71d.insert(realm2, next4, map2));
                }
                osList4.addRow(l6.longValue());
            }
        }
        return j6;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TalkingInfo.class);
        long nativePtr = table.getNativePtr();
        TalkingInfoColumnInfo talkingInfoColumnInfo = (TalkingInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingInfo.class);
        long j4 = talkingInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            TalkingInfo talkingInfo = (TalkingInfo) it.next();
            if (!map2.containsKey(talkingInfo)) {
                if (talkingInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(talkingInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface = talkingInfo;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j4, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j4, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j5 = j;
                map2.put(talkingInfo, Long.valueOf(j5));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j5;
                    Table.nativeSetString(nativePtr, talkingInfoColumnInfo.titleIndex, j5, realmGet$title, false);
                } else {
                    j2 = j5;
                }
                String realmGet$adress = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$adress();
                if (realmGet$adress != null) {
                    Table.nativeSetString(nativePtr, talkingInfoColumnInfo.adressIndex, j2, realmGet$adress, false);
                }
                TalkingPhotosFile realmGet$schemaPhoto = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$schemaPhoto();
                if (realmGet$schemaPhoto != null) {
                    Long l = map2.get(realmGet$schemaPhoto);
                    if (l == null) {
                        l = Long.valueOf(C4776x6ae644c3.insert(realm2, realmGet$schemaPhoto, map2));
                    }
                    table.setLink(talkingInfoColumnInfo.schemaPhotoIndex, j2, l.longValue(), false);
                }
                StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$stateRenta();
                if (realmGet$stateRenta != null) {
                    Long l2 = map2.get(realmGet$stateRenta);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4756x99acf311.insert(realm2, realmGet$stateRenta, map2));
                    }
                    table.setLink(talkingInfoColumnInfo.stateRentaIndex, j2, l2.longValue(), false);
                }
                RealmList<TalkingPhotos> realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    j3 = j2;
                    OsList osList = new OsList(table.getUncheckedRow(j3), talkingInfoColumnInfo.imageIndex);
                    Iterator<TalkingPhotos> it2 = realmGet$image.iterator();
                    while (it2.hasNext()) {
                        TalkingPhotos next = it2.next();
                        Long l3 = map2.get(next);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4778x8713e227.insert(realm2, next, map2));
                        }
                        osList.addRow(l3.longValue());
                    }
                } else {
                    j3 = j2;
                }
                RealmList<RentAttributes> realmGet$rentAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentAttributes();
                if (realmGet$rentAttributes != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j3), talkingInfoColumnInfo.rentAttributesIndex);
                    Iterator<RentAttributes> it3 = realmGet$rentAttributes.iterator();
                    while (it3.hasNext()) {
                        RentAttributes next2 = it3.next();
                        Long l4 = map2.get(next2);
                        if (l4 == null) {
                            l4 = Long.valueOf(C4794x165b0474.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l4.longValue());
                    }
                }
                long j6 = nativePtr;
                long j7 = nativePtr;
                long j8 = j3;
                Table.nativeSetBoolean(j6, talkingInfoColumnInfo.parentIsBusyIndex, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$parentIsBusy(), false);
                RealmList<RentChildren> realmGet$rentChildre = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentChildre();
                if (realmGet$rentChildre != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(j8), talkingInfoColumnInfo.rentChildreIndex);
                    Iterator<RentChildren> it4 = realmGet$rentChildre.iterator();
                    while (it4.hasNext()) {
                        RentChildren next3 = it4.next();
                        Long l5 = map2.get(next3);
                        if (l5 == null) {
                            l5 = Long.valueOf(C4766x7a38e7a6.insert(realm2, next3, map2));
                        }
                        osList3.addRow(l5.longValue());
                    }
                }
                RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$renters();
                if (realmGet$renters != null) {
                    OsList osList4 = new OsList(table.getUncheckedRow(j8), talkingInfoColumnInfo.rentersIndex);
                    Iterator<Renters> it5 = realmGet$renters.iterator();
                    while (it5.hasNext()) {
                        Renters next4 = it5.next();
                        Long l6 = map2.get(next4);
                        if (l6 == null) {
                            l6 = Long.valueOf(C4772xa5d8f71d.insert(realm2, next4, map2));
                        }
                        osList4.addRow(l6.longValue());
                    }
                }
                nativePtr = j7;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TalkingInfo talkingInfo, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        TalkingInfo talkingInfo2 = talkingInfo;
        Map<RealmModel, Long> map2 = map;
        if (talkingInfo2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingInfo2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TalkingInfo.class);
        long nativePtr = table.getNativePtr();
        TalkingInfoColumnInfo talkingInfoColumnInfo = (TalkingInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingInfo.class);
        long j3 = talkingInfoColumnInfo.idIndex;
        C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface = talkingInfo2;
        if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id()) != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id()));
        }
        long j4 = j;
        map2.put(talkingInfo2, Long.valueOf(j4));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = j4;
            Table.nativeSetString(nativePtr, talkingInfoColumnInfo.titleIndex, j4, realmGet$title, false);
        } else {
            j2 = j4;
            Table.nativeSetNull(nativePtr, talkingInfoColumnInfo.titleIndex, j2, false);
        }
        String realmGet$adress = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$adress();
        if (realmGet$adress != null) {
            Table.nativeSetString(nativePtr, talkingInfoColumnInfo.adressIndex, j2, realmGet$adress, false);
        } else {
            Table.nativeSetNull(nativePtr, talkingInfoColumnInfo.adressIndex, j2, false);
        }
        TalkingPhotosFile realmGet$schemaPhoto = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$schemaPhoto();
        if (realmGet$schemaPhoto != null) {
            Long l = map2.get(realmGet$schemaPhoto);
            if (l == null) {
                l = Long.valueOf(C4776x6ae644c3.insertOrUpdate(realm2, realmGet$schemaPhoto, map2));
            }
            Table.nativeSetLink(nativePtr, talkingInfoColumnInfo.schemaPhotoIndex, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, talkingInfoColumnInfo.schemaPhotoIndex, j2);
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta != null) {
            Long l2 = map2.get(realmGet$stateRenta);
            if (l2 == null) {
                l2 = Long.valueOf(C4756x99acf311.insertOrUpdate(realm2, realmGet$stateRenta, map2));
            }
            Table.nativeSetLink(nativePtr, talkingInfoColumnInfo.stateRentaIndex, j2, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, talkingInfoColumnInfo.stateRentaIndex, j2);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), talkingInfoColumnInfo.imageIndex);
        RealmList<TalkingPhotos> realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$image();
        if (realmGet$image == null || ((long) realmGet$image.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$image != null) {
                Iterator<TalkingPhotos> it = realmGet$image.iterator();
                while (it.hasNext()) {
                    TalkingPhotos next = it.next();
                    Long l3 = map2.get(next);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4778x8713e227.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l3.longValue());
                }
            }
        } else {
            int size = realmGet$image.size();
            for (int i = 0; i < size; i++) {
                TalkingPhotos talkingPhotos = realmGet$image.get(i);
                Long l4 = map2.get(talkingPhotos);
                if (l4 == null) {
                    l4 = Long.valueOf(C4778x8713e227.insertOrUpdate(realm2, talkingPhotos, map2));
                }
                osList.setRow((long) i, l4.longValue());
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j5), talkingInfoColumnInfo.rentAttributesIndex);
        RealmList<RentAttributes> realmGet$rentAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentAttributes();
        if (realmGet$rentAttributes == null || ((long) realmGet$rentAttributes.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$rentAttributes != null) {
                Iterator<RentAttributes> it2 = realmGet$rentAttributes.iterator();
                while (it2.hasNext()) {
                    RentAttributes next2 = it2.next();
                    Long l5 = map2.get(next2);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4794x165b0474.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l5.longValue());
                }
            }
        } else {
            int size2 = realmGet$rentAttributes.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RentAttributes rentAttributes = realmGet$rentAttributes.get(i2);
                Long l6 = map2.get(rentAttributes);
                if (l6 == null) {
                    l6 = Long.valueOf(C4794x165b0474.insertOrUpdate(realm2, rentAttributes, map2));
                }
                osList2.setRow((long) i2, l6.longValue());
            }
        }
        long j6 = j5;
        Table.nativeSetBoolean(nativePtr, talkingInfoColumnInfo.parentIsBusyIndex, j5, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$parentIsBusy(), false);
        OsList osList3 = new OsList(table.getUncheckedRow(j6), talkingInfoColumnInfo.rentChildreIndex);
        RealmList<RentChildren> realmGet$rentChildre = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentChildre();
        if (realmGet$rentChildre == null || ((long) realmGet$rentChildre.size()) != osList3.size()) {
            osList3.removeAll();
            if (realmGet$rentChildre != null) {
                Iterator<RentChildren> it3 = realmGet$rentChildre.iterator();
                while (it3.hasNext()) {
                    RentChildren next3 = it3.next();
                    Long l7 = map2.get(next3);
                    if (l7 == null) {
                        l7 = Long.valueOf(C4766x7a38e7a6.insertOrUpdate(realm2, next3, map2));
                    }
                    osList3.addRow(l7.longValue());
                }
            }
        } else {
            int size3 = realmGet$rentChildre.size();
            for (int i3 = 0; i3 < size3; i3++) {
                RentChildren rentChildren = realmGet$rentChildre.get(i3);
                Long l8 = map2.get(rentChildren);
                if (l8 == null) {
                    l8 = Long.valueOf(C4766x7a38e7a6.insertOrUpdate(realm2, rentChildren, map2));
                }
                osList3.setRow((long) i3, l8.longValue());
            }
        }
        OsList osList4 = new OsList(table.getUncheckedRow(j6), talkingInfoColumnInfo.rentersIndex);
        RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$renters();
        if (realmGet$renters == null || ((long) realmGet$renters.size()) != osList4.size()) {
            osList4.removeAll();
            if (realmGet$renters != null) {
                Iterator<Renters> it4 = realmGet$renters.iterator();
                while (it4.hasNext()) {
                    Renters next4 = it4.next();
                    Long l9 = map2.get(next4);
                    if (l9 == null) {
                        l9 = Long.valueOf(C4772xa5d8f71d.insertOrUpdate(realm2, next4, map2));
                    }
                    osList4.addRow(l9.longValue());
                }
            }
        } else {
            int size4 = realmGet$renters.size();
            for (int i4 = 0; i4 < size4; i4++) {
                Renters renters = realmGet$renters.get(i4);
                Long l10 = map2.get(renters);
                if (l10 == null) {
                    l10 = Long.valueOf(C4772xa5d8f71d.insertOrUpdate(realm2, renters, map2));
                }
                osList4.setRow((long) i4, l10.longValue());
            }
        }
        return j6;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2;
        long j5;
        TalkingInfoColumnInfo talkingInfoColumnInfo;
        Map<RealmModel, Long> map2;
        Realm realm3 = realm;
        Map<RealmModel, Long> map3 = map;
        Table table = realm3.getTable(TalkingInfo.class);
        long nativePtr = table.getNativePtr();
        TalkingInfoColumnInfo talkingInfoColumnInfo2 = (TalkingInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingInfo.class);
        long j6 = talkingInfoColumnInfo2.idIndex;
        while (it.hasNext()) {
            TalkingInfo talkingInfo = (TalkingInfo) it.next();
            if (!map3.containsKey(talkingInfo)) {
                if (talkingInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map3.put(talkingInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface = talkingInfo;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j6, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j6, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$id()));
                }
                long j7 = j;
                map3.put(talkingInfo, Long.valueOf(j7));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, talkingInfoColumnInfo2.titleIndex, j7, realmGet$title, false);
                } else {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetNull(nativePtr, talkingInfoColumnInfo2.titleIndex, j7, false);
                }
                String realmGet$adress = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$adress();
                if (realmGet$adress != null) {
                    Table.nativeSetString(nativePtr, talkingInfoColumnInfo2.adressIndex, j3, realmGet$adress, false);
                } else {
                    Table.nativeSetNull(nativePtr, talkingInfoColumnInfo2.adressIndex, j3, false);
                }
                TalkingPhotosFile realmGet$schemaPhoto = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$schemaPhoto();
                if (realmGet$schemaPhoto != null) {
                    Long l = map3.get(realmGet$schemaPhoto);
                    if (l == null) {
                        l = Long.valueOf(C4776x6ae644c3.insertOrUpdate(realm3, realmGet$schemaPhoto, map3));
                    }
                    Table.nativeSetLink(nativePtr, talkingInfoColumnInfo2.schemaPhotoIndex, j3, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, talkingInfoColumnInfo2.schemaPhotoIndex, j3);
                }
                StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$stateRenta();
                if (realmGet$stateRenta != null) {
                    Long l2 = map3.get(realmGet$stateRenta);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4756x99acf311.insertOrUpdate(realm3, realmGet$stateRenta, map3));
                    }
                    Table.nativeSetLink(nativePtr, talkingInfoColumnInfo2.stateRentaIndex, j3, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, talkingInfoColumnInfo2.stateRentaIndex, j3);
                }
                long j8 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j8), talkingInfoColumnInfo2.imageIndex);
                RealmList<TalkingPhotos> realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$image();
                if (realmGet$image == null || ((long) realmGet$image.size()) != osList.size()) {
                    j4 = nativePtr;
                    osList.removeAll();
                    if (realmGet$image != null) {
                        Iterator<TalkingPhotos> it2 = realmGet$image.iterator();
                        while (it2.hasNext()) {
                            TalkingPhotos next = it2.next();
                            Long l3 = map3.get(next);
                            if (l3 == null) {
                                l3 = Long.valueOf(C4778x8713e227.insertOrUpdate(realm3, next, map3));
                            }
                            osList.addRow(l3.longValue());
                        }
                    }
                } else {
                    int size = realmGet$image.size();
                    int i = 0;
                    while (i < size) {
                        TalkingPhotos talkingPhotos = realmGet$image.get(i);
                        Long l4 = map3.get(talkingPhotos);
                        if (l4 == null) {
                            l4 = Long.valueOf(C4778x8713e227.insertOrUpdate(realm3, talkingPhotos, map3));
                        }
                        osList.setRow((long) i, l4.longValue());
                        i++;
                        nativePtr = nativePtr;
                    }
                    j4 = nativePtr;
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j8), talkingInfoColumnInfo2.rentAttributesIndex);
                RealmList<RentAttributes> realmGet$rentAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentAttributes();
                if (realmGet$rentAttributes == null || ((long) realmGet$rentAttributes.size()) != osList2.size()) {
                    osList2.removeAll();
                    if (realmGet$rentAttributes != null) {
                        Iterator<RentAttributes> it3 = realmGet$rentAttributes.iterator();
                        while (it3.hasNext()) {
                            RentAttributes next2 = it3.next();
                            Long l5 = map3.get(next2);
                            if (l5 == null) {
                                l5 = Long.valueOf(C4794x165b0474.insertOrUpdate(realm3, next2, map3));
                            }
                            osList2.addRow(l5.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$rentAttributes.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        RentAttributes rentAttributes = realmGet$rentAttributes.get(i2);
                        Long l6 = map3.get(rentAttributes);
                        if (l6 == null) {
                            l6 = Long.valueOf(C4794x165b0474.insertOrUpdate(realm3, rentAttributes, map3));
                        }
                        osList2.setRow((long) i2, l6.longValue());
                    }
                }
                long j9 = j8;
                Table.nativeSetBoolean(j4, talkingInfoColumnInfo2.parentIsBusyIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$parentIsBusy(), false);
                OsList osList3 = new OsList(table.getUncheckedRow(j9), talkingInfoColumnInfo2.rentChildreIndex);
                RealmList<RentChildren> realmGet$rentChildre = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$rentChildre();
                if (realmGet$rentChildre == null || ((long) realmGet$rentChildre.size()) != osList3.size()) {
                    realm2 = realm;
                    j5 = j9;
                    talkingInfoColumnInfo = talkingInfoColumnInfo2;
                    map2 = map;
                    osList3.removeAll();
                    if (realmGet$rentChildre != null) {
                        Iterator<RentChildren> it4 = realmGet$rentChildre.iterator();
                        while (it4.hasNext()) {
                            RentChildren next3 = it4.next();
                            Long l7 = map2.get(next3);
                            if (l7 == null) {
                                l7 = Long.valueOf(C4766x7a38e7a6.insertOrUpdate(realm2, next3, map2));
                            }
                            osList3.addRow(l7.longValue());
                        }
                    }
                } else {
                    int size3 = realmGet$rentChildre.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        RentChildren rentChildren = realmGet$rentChildre.get(i3);
                        long j10 = j9;
                        Map<RealmModel, Long> map4 = map;
                        Long l8 = map4.get(rentChildren);
                        Realm realm4 = realm;
                        if (l8 == null) {
                            l8 = Long.valueOf(C4766x7a38e7a6.insertOrUpdate(realm4, rentChildren, map4));
                        }
                        osList3.setRow((long) i3, l8.longValue());
                        i3++;
                        talkingInfoColumnInfo2 = talkingInfoColumnInfo2;
                        j9 = j10;
                    }
                    realm2 = realm;
                    j5 = j9;
                    talkingInfoColumnInfo = talkingInfoColumnInfo2;
                    map2 = map;
                }
                OsList osList4 = new OsList(table.getUncheckedRow(j5), talkingInfoColumnInfo.rentersIndex);
                RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmGet$renters();
                if (realmGet$renters == null || ((long) realmGet$renters.size()) != osList4.size()) {
                    osList4.removeAll();
                    if (realmGet$renters != null) {
                        Iterator<Renters> it5 = realmGet$renters.iterator();
                        while (it5.hasNext()) {
                            Renters next4 = it5.next();
                            Long l9 = map2.get(next4);
                            if (l9 == null) {
                                l9 = Long.valueOf(C4772xa5d8f71d.insertOrUpdate(realm2, next4, map2));
                            }
                            osList4.addRow(l9.longValue());
                        }
                    }
                } else {
                    int size4 = realmGet$renters.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        Renters renters = realmGet$renters.get(i4);
                        Long l10 = map2.get(renters);
                        if (l10 == null) {
                            l10 = Long.valueOf(C4772xa5d8f71d.insertOrUpdate(realm2, renters, map2));
                        }
                        osList4.setRow((long) i4, l10.longValue());
                    }
                }
                map3 = map2;
                talkingInfoColumnInfo2 = talkingInfoColumnInfo;
                realm3 = realm2;
                nativePtr = j4;
                j6 = j2;
            }
        }
    }

    public static TalkingInfo createDetachedCopy(TalkingInfo talkingInfo, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TalkingInfo talkingInfo2;
        if (i > i2 || talkingInfo == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(talkingInfo);
        if (cacheData == null) {
            talkingInfo2 = new TalkingInfo();
            map.put(talkingInfo, new RealmObjectProxy.CacheData(i, talkingInfo2));
        } else if (i >= cacheData.minDepth) {
            return (TalkingInfo) cacheData.object;
        } else {
            cacheData.minDepth = i;
            talkingInfo2 = (TalkingInfo) cacheData.object;
        }
        C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface = talkingInfo2;
        C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2 = talkingInfo;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$adress(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$adress());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$schemaPhoto(C4776x6ae644c3.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$schemaPhoto(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$stateRenta(C4756x99acf311.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$stateRenta(), i3, i2, map));
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$image((RealmList<TalkingPhotos>) null);
        } else {
            RealmList<TalkingPhotos> realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$image();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$image(realmList);
            int size = realmGet$image.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4778x8713e227.createDetachedCopy(realmGet$image.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$rentAttributes((RealmList<RentAttributes>) null);
        } else {
            RealmList<RentAttributes> realmGet$rentAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$rentAttributes();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$rentAttributes(realmList2);
            int size2 = realmGet$rentAttributes.size();
            for (int i5 = 0; i5 < size2; i5++) {
                realmList2.add(C4794x165b0474.createDetachedCopy(realmGet$rentAttributes.get(i5), i3, i2, map));
            }
        }
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$parentIsBusy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$parentIsBusy());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$rentChildre((RealmList<RentChildren>) null);
        } else {
            RealmList<RentChildren> realmGet$rentChildre = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$rentChildre();
            RealmList realmList3 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$rentChildre(realmList3);
            int size3 = realmGet$rentChildre.size();
            for (int i6 = 0; i6 < size3; i6++) {
                realmList3.add(C4766x7a38e7a6.createDetachedCopy(realmGet$rentChildre.get(i6), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$renters((RealmList<Renters>) null);
        } else {
            RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$renters();
            RealmList realmList4 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface.realmSet$renters(realmList4);
            int size4 = realmGet$renters.size();
            for (int i7 = 0; i7 < size4; i7++) {
                realmList4.add(C4772xa5d8f71d.createDetachedCopy(realmGet$renters.get(i7), i3, i2, map));
            }
        }
        return talkingInfo2;
    }

    static TalkingInfo update(Realm realm, TalkingInfoColumnInfo talkingInfoColumnInfo, TalkingInfo talkingInfo, TalkingInfo talkingInfo2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        TalkingInfoColumnInfo talkingInfoColumnInfo2 = talkingInfoColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface = talkingInfo;
        C4775xa897b3c5 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2 = talkingInfo2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TalkingInfo.class), talkingInfoColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(talkingInfoColumnInfo2.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(talkingInfoColumnInfo2.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(talkingInfoColumnInfo2.adressIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$adress());
        TalkingPhotosFile realmGet$schemaPhoto = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$schemaPhoto();
        if (realmGet$schemaPhoto == null) {
            osObjectBuilder.addNull(talkingInfoColumnInfo2.schemaPhotoIndex);
        } else {
            TalkingPhotosFile talkingPhotosFile = (TalkingPhotosFile) map2.get(realmGet$schemaPhoto);
            if (talkingPhotosFile != null) {
                osObjectBuilder.addObject(talkingInfoColumnInfo2.schemaPhotoIndex, talkingPhotosFile);
            } else {
                osObjectBuilder.addObject(talkingInfoColumnInfo2.schemaPhotoIndex, C4776x6ae644c3.copyOrUpdate(realm, (C4776x6ae644c3.TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class), realmGet$schemaPhoto, true, map, set));
            }
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$stateRenta();
        if (realmGet$stateRenta == null) {
            osObjectBuilder.addNull(talkingInfoColumnInfo2.stateRentaIndex);
        } else {
            StateRenta stateRenta = (StateRenta) map2.get(realmGet$stateRenta);
            if (stateRenta != null) {
                osObjectBuilder.addObject(talkingInfoColumnInfo2.stateRentaIndex, stateRenta);
            } else {
                osObjectBuilder.addObject(talkingInfoColumnInfo2.stateRentaIndex, C4756x99acf311.copyOrUpdate(realm, (C4756x99acf311.StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class), realmGet$stateRenta, true, map, set));
            }
        }
        RealmList<TalkingPhotos> realmGet$image = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$image();
        if (realmGet$image != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$image.size(); i++) {
                TalkingPhotos talkingPhotos = realmGet$image.get(i);
                TalkingPhotos talkingPhotos2 = (TalkingPhotos) map2.get(talkingPhotos);
                if (talkingPhotos2 != null) {
                    realmList.add(talkingPhotos2);
                } else {
                    realmList.add(C4778x8713e227.copyOrUpdate(realm, (C4778x8713e227.TalkingPhotosColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotos.class), talkingPhotos, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(talkingInfoColumnInfo2.imageIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(talkingInfoColumnInfo2.imageIndex, new RealmList());
        }
        RealmList<RentAttributes> realmGet$rentAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$rentAttributes();
        if (realmGet$rentAttributes != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$rentAttributes.size(); i2++) {
                RentAttributes rentAttributes = realmGet$rentAttributes.get(i2);
                RentAttributes rentAttributes2 = (RentAttributes) map2.get(rentAttributes);
                if (rentAttributes2 != null) {
                    realmList2.add(rentAttributes2);
                } else {
                    realmList2.add(C4794x165b0474.copyOrUpdate(realm, (C4794x165b0474.RentAttributesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class), rentAttributes, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(talkingInfoColumnInfo2.rentAttributesIndex, realmList2);
        } else {
            osObjectBuilder.addObjectList(talkingInfoColumnInfo2.rentAttributesIndex, new RealmList());
        }
        osObjectBuilder.addBoolean(talkingInfoColumnInfo2.parentIsBusyIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$parentIsBusy()));
        RealmList<RentChildren> realmGet$rentChildre = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$rentChildre();
        if (realmGet$rentChildre != null) {
            RealmList realmList3 = new RealmList();
            for (int i3 = 0; i3 < realmGet$rentChildre.size(); i3++) {
                RentChildren rentChildren = realmGet$rentChildre.get(i3);
                RentChildren rentChildren2 = (RentChildren) map2.get(rentChildren);
                if (rentChildren2 != null) {
                    realmList3.add(rentChildren2);
                } else {
                    realmList3.add(C4766x7a38e7a6.copyOrUpdate(realm, (C4766x7a38e7a6.RentChildrenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentChildren.class), rentChildren, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(talkingInfoColumnInfo2.rentChildreIndex, realmList3);
        } else {
            osObjectBuilder.addObjectList(talkingInfoColumnInfo2.rentChildreIndex, new RealmList());
        }
        RealmList<Renters> realmGet$renters = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxyinterface2.realmGet$renters();
        if (realmGet$renters != null) {
            RealmList realmList4 = new RealmList();
            for (int i4 = 0; i4 < realmGet$renters.size(); i4++) {
                Renters renters = realmGet$renters.get(i4);
                Renters renters2 = (Renters) map2.get(renters);
                if (renters2 != null) {
                    realmList4.add(renters2);
                } else {
                    realmList4.add(C4772xa5d8f71d.copyOrUpdate(realm, (C4772xa5d8f71d.RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class), renters, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(talkingInfoColumnInfo2.rentersIndex, realmList4);
        } else {
            osObjectBuilder.addObjectList(talkingInfoColumnInfo2.rentersIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return talkingInfo;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TalkingInfo = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{adress:");
        sb.append(realmGet$adress() != null ? realmGet$adress() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{schemaPhoto:");
        sb.append(realmGet$schemaPhoto() != null ? C4776x6ae644c3.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{stateRenta:");
        if (realmGet$stateRenta() != null) {
            str = C4756x99acf311.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{image:");
        sb.append("RealmList<TalkingPhotos>[");
        sb.append(realmGet$image().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{rentAttributes:");
        sb.append("RealmList<RentAttributes>[");
        sb.append(realmGet$rentAttributes().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{parentIsBusy:");
        sb.append(realmGet$parentIsBusy());
        sb.append("}");
        sb.append(",");
        sb.append("{rentChildre:");
        sb.append("RealmList<RentChildren>[");
        sb.append(realmGet$rentChildre().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{renters:");
        sb.append("RealmList<Renters>[");
        sb.append(realmGet$renters().size());
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
        C4774x33c567d4 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxy = (C4774x33c567d4) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkinginforealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
