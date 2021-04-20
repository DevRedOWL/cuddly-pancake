package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.MyBeacon;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Wifi;
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
import p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy */
public class ru_unicorn_ujin_data_realm_PointRealmProxy extends Point implements RealmObjectProxy, ru_unicorn_ujin_data_realm_PointRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<MyBeacon> beaconsRealmList;
    private PointColumnInfo columnInfo;
    private ProxyState<Point> proxyState;
    private RealmList<Wifi> wifiRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Point";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy$PointColumnInfo */
    static final class PointColumnInfo extends ColumnInfo {
        long beaconActionIndex;
        long beaconsIndex;
        long cameraIndex;
        long hideIndex;
        long idIndex;
        long isBeaconEnableIndex;
        long isGPSEnableIndex;
        long isWIFIEnableIndex;
        long latitudeIndex;
        long longitudeIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long radiusIndex;
        long removeIndex;
        long wifiIndex;

        PointColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(14);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.longitudeIndex = addColumnDetails("longitude", "longitude", objectSchemaInfo);
            this.latitudeIndex = addColumnDetails("latitude", "latitude", objectSchemaInfo);
            this.radiusIndex = addColumnDetails("radius", "radius", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.wifiIndex = addColumnDetails("wifi", "wifi", objectSchemaInfo);
            this.beaconsIndex = addColumnDetails("beacons", "beacons", objectSchemaInfo);
            this.isBeaconEnableIndex = addColumnDetails("isBeaconEnable", "isBeaconEnable", objectSchemaInfo);
            this.beaconActionIndex = addColumnDetails("beaconAction", "beaconAction", objectSchemaInfo);
            this.isWIFIEnableIndex = addColumnDetails("isWIFIEnable", "isWIFIEnable", objectSchemaInfo);
            this.isGPSEnableIndex = addColumnDetails("isGPSEnable", "isGPSEnable", objectSchemaInfo);
            this.removeIndex = addColumnDetails("remove", "remove", objectSchemaInfo);
            this.cameraIndex = addColumnDetails("camera", "camera", objectSchemaInfo);
            this.hideIndex = addColumnDetails("hide", "hide", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PointColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PointColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PointColumnInfo pointColumnInfo = (PointColumnInfo) columnInfo;
            PointColumnInfo pointColumnInfo2 = (PointColumnInfo) columnInfo2;
            pointColumnInfo2.idIndex = pointColumnInfo.idIndex;
            pointColumnInfo2.longitudeIndex = pointColumnInfo.longitudeIndex;
            pointColumnInfo2.latitudeIndex = pointColumnInfo.latitudeIndex;
            pointColumnInfo2.radiusIndex = pointColumnInfo.radiusIndex;
            pointColumnInfo2.nameIndex = pointColumnInfo.nameIndex;
            pointColumnInfo2.wifiIndex = pointColumnInfo.wifiIndex;
            pointColumnInfo2.beaconsIndex = pointColumnInfo.beaconsIndex;
            pointColumnInfo2.isBeaconEnableIndex = pointColumnInfo.isBeaconEnableIndex;
            pointColumnInfo2.beaconActionIndex = pointColumnInfo.beaconActionIndex;
            pointColumnInfo2.isWIFIEnableIndex = pointColumnInfo.isWIFIEnableIndex;
            pointColumnInfo2.isGPSEnableIndex = pointColumnInfo.isGPSEnableIndex;
            pointColumnInfo2.removeIndex = pointColumnInfo.removeIndex;
            pointColumnInfo2.cameraIndex = pointColumnInfo.cameraIndex;
            pointColumnInfo2.hideIndex = pointColumnInfo.hideIndex;
            pointColumnInfo2.maxColumnIndexValue = pointColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_PointRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PointColumnInfo) realmObjectContext.getColumnInfo();
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

    public Double realmGet$longitude() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.longitudeIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.longitudeIndex));
    }

    public void realmSet$longitude(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.longitudeIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.longitudeIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.longitudeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.longitudeIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public Double realmGet$latitude() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.latitudeIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.latitudeIndex));
    }

    public void realmSet$latitude(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.latitudeIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.latitudeIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.latitudeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.latitudeIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public String realmGet$radius() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.radiusIndex);
    }

    public void realmSet$radius(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.radiusIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.radiusIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.radiusIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.radiusIndex, row$realm.getIndex(), str, true);
            }
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

    public RealmList<Wifi> realmGet$wifi() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Wifi> realmList = this.wifiRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.wifiRealmList = new RealmList<>(Wifi.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.wifiIndex), this.proxyState.getRealm$realm());
        return this.wifiRealmList;
    }

    public void realmSet$wifi(RealmList<Wifi> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("wifi")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Wifi> realmList2 = new RealmList<>();
                Iterator<Wifi> it = realmList.iterator();
                while (it.hasNext()) {
                    Wifi next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.wifiIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Wifi wifi = realmList.get(i);
                    this.proxyState.checkValidObject(wifi);
                    modelList.addRow(((RealmObjectProxy) wifi).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Wifi wifi2 = realmList.get(i);
            this.proxyState.checkValidObject(wifi2);
            modelList.setRow((long) i, ((RealmObjectProxy) wifi2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<MyBeacon> realmGet$beacons() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<MyBeacon> realmList = this.beaconsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.beaconsRealmList = new RealmList<>(MyBeacon.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.beaconsIndex), this.proxyState.getRealm$realm());
        return this.beaconsRealmList;
    }

    public void realmSet$beacons(RealmList<MyBeacon> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("beacons")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<MyBeacon> realmList2 = new RealmList<>();
                Iterator<MyBeacon> it = realmList.iterator();
                while (it.hasNext()) {
                    MyBeacon next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.beaconsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    MyBeacon myBeacon = realmList.get(i);
                    this.proxyState.checkValidObject(myBeacon);
                    modelList.addRow(((RealmObjectProxy) myBeacon).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            MyBeacon myBeacon2 = realmList.get(i);
            this.proxyState.checkValidObject(myBeacon2);
            modelList.setRow((long) i, ((RealmObjectProxy) myBeacon2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public Integer realmGet$isBeaconEnable() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isBeaconEnableIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.isBeaconEnableIndex));
    }

    public void realmSet$isBeaconEnable(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isBeaconEnableIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.isBeaconEnableIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.isBeaconEnableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.isBeaconEnableIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public BeaconAction realmGet$beaconAction() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.beaconActionIndex)) {
            return null;
        }
        return (BeaconAction) this.proxyState.getRealm$realm().get(BeaconAction.class, this.proxyState.getRow$realm().getLink(this.columnInfo.beaconActionIndex), false, Collections.emptyList());
    }

    public void realmSet$beaconAction(BeaconAction beaconAction) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (beaconAction == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.beaconActionIndex);
                return;
            }
            this.proxyState.checkValidObject(beaconAction);
            this.proxyState.getRow$realm().setLink(this.columnInfo.beaconActionIndex, ((RealmObjectProxy) beaconAction).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("beaconAction")) {
            if (beaconAction != null && !RealmObject.isManaged(beaconAction)) {
                beaconAction = (BeaconAction) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(beaconAction, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (beaconAction == null) {
                row$realm.nullifyLink(this.columnInfo.beaconActionIndex);
                return;
            }
            this.proxyState.checkValidObject(beaconAction);
            row$realm.getTable().setLink(this.columnInfo.beaconActionIndex, row$realm.getIndex(), ((RealmObjectProxy) beaconAction).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Boolean realmGet$isWIFIEnable() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isWIFIEnableIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isWIFIEnableIndex));
    }

    public void realmSet$isWIFIEnable(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isWIFIEnableIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isWIFIEnableIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isWIFIEnableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isWIFIEnableIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Boolean realmGet$isGPSEnable() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isGPSEnableIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isGPSEnableIndex));
    }

    public void realmSet$isGPSEnable(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isGPSEnableIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isGPSEnableIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isGPSEnableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isGPSEnableIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Boolean realmGet$remove() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.removeIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.removeIndex));
    }

    public void realmSet$remove(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.removeIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.removeIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.removeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.removeIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Camera realmGet$camera() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.cameraIndex)) {
            return null;
        }
        return (Camera) this.proxyState.getRealm$realm().get(Camera.class, this.proxyState.getRow$realm().getLink(this.columnInfo.cameraIndex), false, Collections.emptyList());
    }

    public void realmSet$camera(Camera camera) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (camera == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.cameraIndex);
                return;
            }
            this.proxyState.checkValidObject(camera);
            this.proxyState.getRow$realm().setLink(this.columnInfo.cameraIndex, ((RealmObjectProxy) camera).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("camera")) {
            if (camera != null && !RealmObject.isManaged(camera)) {
                camera = (Camera) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(camera, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (camera == null) {
                row$realm.nullifyLink(this.columnInfo.cameraIndex);
                return;
            }
            this.proxyState.checkValidObject(camera);
            row$realm.getTable().setLink(this.columnInfo.cameraIndex, row$realm.getIndex(), ((RealmObjectProxy) camera).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public int realmGet$hide() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.hideIndex);
    }

    public void realmSet$hide(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.hideIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.hideIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 14, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("longitude", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty("latitude", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty("radius", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("wifi", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_WifiRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("beacons", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("isBeaconEnable", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty("beaconAction", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("isWIFIEnable", RealmFieldType.BOOLEAN, false, false, false);
        builder3.addPersistedProperty("isGPSEnable", RealmFieldType.BOOLEAN, false, false, false);
        builder3.addPersistedProperty("remove", RealmFieldType.BOOLEAN, false, false, false);
        builder.addPersistedLinkProperty("camera", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_CameraRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("hide", RealmFieldType.INTEGER, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PointColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PointColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Point createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r3 = p035ru.unicorn.ujin.data.realm.Point.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r5 = p035ru.unicorn.ujin.data.realm.Point.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy$PointColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy.PointColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r4 = p035ru.unicorn.ujin.data.realm.Point.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy     // Catch:{ all -> 0x0061 }
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
            java.lang.String r4 = "camera"
            java.lang.String r5 = "beaconAction"
            java.lang.String r6 = "beacons"
            java.lang.String r7 = "wifi"
            if (r3 != 0) goto L_0x00c3
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x007b
            r0.add(r7)
        L_0x007b:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0084
            r0.add(r6)
        L_0x0084:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x008d
            r0.add(r5)
        L_0x008d:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0096
            r0.add(r4)
        L_0x0096:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r14.isNull(r1)
            r8 = 1
            if (r3 == 0) goto L_0x00ad
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r1 = p035ru.unicorn.ujin.data.realm.Point.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy) r3
            goto L_0x00c3
        L_0x00ad:
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r3 = p035ru.unicorn.ujin.data.realm.Point.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy) r3
            goto L_0x00c3
        L_0x00bb:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00c3:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_PointRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxyInterface) r0
            java.lang.String r1 = "longitude"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x00e3
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00d8
            r0.realmSet$longitude(r2)
            goto L_0x00e3
        L_0x00d8:
            double r8 = r14.getDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r8)
            r0.realmSet$longitude(r1)
        L_0x00e3:
            java.lang.String r1 = "latitude"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0100
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00f5
            r0.realmSet$latitude(r2)
            goto L_0x0100
        L_0x00f5:
            double r8 = r14.getDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r8)
            r0.realmSet$latitude(r1)
        L_0x0100:
            java.lang.String r1 = "radius"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0119
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0112
            r0.realmSet$radius(r2)
            goto L_0x0119
        L_0x0112:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$radius(r1)
        L_0x0119:
            java.lang.String r1 = "name"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0132
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x012b
            r0.realmSet$name(r2)
            goto L_0x0132
        L_0x012b:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$name(r1)
        L_0x0132:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x0166
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0142
            r0.realmSet$wifi(r2)
            goto L_0x0166
        L_0x0142:
            io.realm.RealmList r1 = r0.realmGet$wifi()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r7)
            r7 = 0
        L_0x014e:
            int r8 = r1.length()
            if (r7 >= r8) goto L_0x0166
            org.json.JSONObject r8 = r1.getJSONObject(r7)
            ru.unicorn.ujin.data.realm.Wifi r8 = p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy.createOrUpdateUsingJsonObject(r13, r8, r15)
            io.realm.RealmList r9 = r0.realmGet$wifi()
            r9.add(r8)
            int r7 = r7 + 1
            goto L_0x014e
        L_0x0166:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x019a
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0176
            r0.realmSet$beacons(r2)
            goto L_0x019a
        L_0x0176:
            io.realm.RealmList r1 = r0.realmGet$beacons()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r6)
            r6 = 0
        L_0x0182:
            int r7 = r1.length()
            if (r6 >= r7) goto L_0x019a
            org.json.JSONObject r7 = r1.getJSONObject(r6)
            ru.unicorn.ujin.data.realm.MyBeacon r7 = p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.createOrUpdateUsingJsonObject(r13, r7, r15)
            io.realm.RealmList r8 = r0.realmGet$beacons()
            r8.add(r7)
            int r6 = r6 + 1
            goto L_0x0182
        L_0x019a:
            java.lang.String r1 = "isBeaconEnable"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x01b7
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x01ac
            r0.realmSet$isBeaconEnable(r2)
            goto L_0x01b7
        L_0x01ac:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$isBeaconEnable(r1)
        L_0x01b7:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x01d2
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x01c7
            r0.realmSet$beaconAction(r2)
            goto L_0x01d2
        L_0x01c7:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.data.realm.BeaconAction r1 = p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$beaconAction(r1)
        L_0x01d2:
            java.lang.String r1 = "isWIFIEnable"
            boolean r5 = r14.has(r1)
            if (r5 == 0) goto L_0x01ef
            boolean r5 = r14.isNull(r1)
            if (r5 == 0) goto L_0x01e4
            r0.realmSet$isWIFIEnable(r2)
            goto L_0x01ef
        L_0x01e4:
            boolean r1 = r14.getBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.realmSet$isWIFIEnable(r1)
        L_0x01ef:
            java.lang.String r1 = "isGPSEnable"
            boolean r5 = r14.has(r1)
            if (r5 == 0) goto L_0x020c
            boolean r5 = r14.isNull(r1)
            if (r5 == 0) goto L_0x0201
            r0.realmSet$isGPSEnable(r2)
            goto L_0x020c
        L_0x0201:
            boolean r1 = r14.getBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.realmSet$isGPSEnable(r1)
        L_0x020c:
            java.lang.String r1 = "remove"
            boolean r5 = r14.has(r1)
            if (r5 == 0) goto L_0x0229
            boolean r5 = r14.isNull(r1)
            if (r5 == 0) goto L_0x021e
            r0.realmSet$remove(r2)
            goto L_0x0229
        L_0x021e:
            boolean r1 = r14.getBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.realmSet$remove(r1)
        L_0x0229:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x0244
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x0239
            r0.realmSet$camera(r2)
            goto L_0x0244
        L_0x0239:
            org.json.JSONObject r1 = r14.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.Camera r13 = p046io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$camera(r13)
        L_0x0244:
            java.lang.String r13 = "hide"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x0266
            java.lang.String r13 = "hide"
            boolean r13 = r14.isNull(r13)
            if (r13 != 0) goto L_0x025e
            java.lang.String r13 = "hide"
            int r13 = r14.getInt(r13)
            r0.realmSet$hide(r13)
            goto L_0x0266
        L_0x025e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'hide' to null."
            r13.<init>(r14)
            throw r13
        L_0x0266:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.Point");
    }

    public static Point createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Point point = new Point();
        ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface = point;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("longitude")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$longitude(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$longitude((Double) null);
                }
            } else if (nextName.equals("latitude")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$latitude(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$latitude((Double) null);
                }
            } else if (nextName.equals("radius")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$radius(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$radius((String) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("wifi")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$wifi((RealmList<Wifi>) null);
                } else {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$wifi(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$wifi().add(ru_unicorn_ujin_data_realm_WifiRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("beacons")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$beacons((RealmList<MyBeacon>) null);
                } else {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$beacons(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beacons().add(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("isBeaconEnable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isBeaconEnable(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isBeaconEnable((Integer) null);
                }
            } else if (nextName.equals("beaconAction")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$beaconAction((BeaconAction) null);
                } else {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$beaconAction(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("isWIFIEnable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isWIFIEnable(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isWIFIEnable((Boolean) null);
                }
            } else if (nextName.equals("isGPSEnable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isGPSEnable(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isGPSEnable((Boolean) null);
                }
            } else if (nextName.equals("remove")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$remove(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$remove((Boolean) null);
                }
            } else if (nextName.equals("camera")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$camera((Camera) null);
                } else {
                    ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$camera(ru_unicorn_ujin_data_realm_CameraRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("hide")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$hide(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'hide' to null.");
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Point) realm.copyToRealm(point, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_PointRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Point.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_PointRealmProxy ru_unicorn_ujin_data_realm_pointrealmproxy = new ru_unicorn_ujin_data_realm_PointRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_pointrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Point copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy.PointColumnInfo r9, p035ru.unicorn.ujin.data.realm.Point r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.Point r1 = (p035ru.unicorn.ujin.data.realm.Point) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.Point> r2 = p035ru.unicorn.ujin.data.realm.Point.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_PointRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.Point r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.Point r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_PointRealmProxy$PointColumnInfo, ru.unicorn.ujin.data.realm.Point, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.Point");
    }

    public static Point copy(Realm realm, PointColumnInfo pointColumnInfo, Point point, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        PointColumnInfo pointColumnInfo2 = pointColumnInfo;
        Point point2 = point;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(point2);
        if (realmObjectProxy != null) {
            return (Point) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface = point2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Point.class), pointColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(pointColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$id());
        osObjectBuilder.addDouble(pointColumnInfo2.longitudeIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$longitude());
        osObjectBuilder.addDouble(pointColumnInfo2.latitudeIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$latitude());
        osObjectBuilder.addString(pointColumnInfo2.radiusIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$radius());
        osObjectBuilder.addString(pointColumnInfo2.nameIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$name());
        osObjectBuilder.addInteger(pointColumnInfo2.isBeaconEnableIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isBeaconEnable());
        osObjectBuilder.addBoolean(pointColumnInfo2.isWIFIEnableIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isWIFIEnable());
        osObjectBuilder.addBoolean(pointColumnInfo2.isGPSEnableIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isGPSEnable());
        osObjectBuilder.addBoolean(pointColumnInfo2.removeIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$remove());
        osObjectBuilder.addInteger(pointColumnInfo2.hideIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$hide()));
        ru_unicorn_ujin_data_realm_PointRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(point2, newProxyInstance);
        RealmList<Wifi> realmGet$wifi = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$wifi();
        if (realmGet$wifi != null) {
            RealmList<Wifi> realmGet$wifi2 = newProxyInstance.realmGet$wifi();
            realmGet$wifi2.clear();
            for (int i = 0; i < realmGet$wifi.size(); i++) {
                Wifi wifi = realmGet$wifi.get(i);
                Wifi wifi2 = (Wifi) map2.get(wifi);
                if (wifi2 != null) {
                    realmGet$wifi2.add(wifi2);
                } else {
                    realmGet$wifi2.add(ru_unicorn_ujin_data_realm_WifiRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_WifiRealmProxy.WifiColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Wifi.class), wifi, z, map, set));
                }
            }
        }
        RealmList<MyBeacon> realmGet$beacons = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beacons();
        if (realmGet$beacons != null) {
            RealmList<MyBeacon> realmGet$beacons2 = newProxyInstance.realmGet$beacons();
            realmGet$beacons2.clear();
            for (int i2 = 0; i2 < realmGet$beacons.size(); i2++) {
                MyBeacon myBeacon = realmGet$beacons.get(i2);
                MyBeacon myBeacon2 = (MyBeacon) map2.get(myBeacon);
                if (myBeacon2 != null) {
                    realmGet$beacons2.add(myBeacon2);
                } else {
                    realmGet$beacons2.add(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.MyBeaconColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MyBeacon.class), myBeacon, z, map, set));
                }
            }
        }
        BeaconAction realmGet$beaconAction = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beaconAction();
        if (realmGet$beaconAction == null) {
            newProxyInstance.realmSet$beaconAction((BeaconAction) null);
        } else {
            BeaconAction beaconAction = (BeaconAction) map2.get(realmGet$beaconAction);
            if (beaconAction != null) {
                newProxyInstance.realmSet$beaconAction(beaconAction);
            } else {
                newProxyInstance.realmSet$beaconAction(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.BeaconActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconAction.class), realmGet$beaconAction, z, map, set));
            }
        }
        Camera realmGet$camera = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$camera();
        if (realmGet$camera == null) {
            newProxyInstance.realmSet$camera((Camera) null);
        } else {
            Camera camera = (Camera) map2.get(realmGet$camera);
            if (camera != null) {
                newProxyInstance.realmSet$camera(camera);
            } else {
                newProxyInstance.realmSet$camera(ru_unicorn_ujin_data_realm_CameraRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CameraRealmProxy.CameraColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Camera.class), realmGet$camera, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Point point, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Point point2 = point;
        Map<RealmModel, Long> map2 = map;
        if (point2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) point2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Point.class);
        long nativePtr = table.getNativePtr();
        PointColumnInfo pointColumnInfo = (PointColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Point.class);
        long j6 = pointColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface = point2;
        String realmGet$id = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$id();
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
        map2.put(point2, Long.valueOf(j2));
        Double realmGet$longitude = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$longitude();
        if (realmGet$longitude != null) {
            j3 = j2;
            Table.nativeSetDouble(nativePtr, pointColumnInfo.longitudeIndex, j2, realmGet$longitude.doubleValue(), false);
        } else {
            j3 = j2;
        }
        Double realmGet$latitude = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$latitude();
        if (realmGet$latitude != null) {
            Table.nativeSetDouble(nativePtr, pointColumnInfo.latitudeIndex, j3, realmGet$latitude.doubleValue(), false);
        }
        String realmGet$radius = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$radius();
        if (realmGet$radius != null) {
            Table.nativeSetString(nativePtr, pointColumnInfo.radiusIndex, j3, realmGet$radius, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, pointColumnInfo.nameIndex, j3, realmGet$name, false);
        }
        RealmList<Wifi> realmGet$wifi = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$wifi();
        if (realmGet$wifi != null) {
            j4 = j3;
            OsList osList = new OsList(table.getUncheckedRow(j4), pointColumnInfo.wifiIndex);
            Iterator<Wifi> it = realmGet$wifi.iterator();
            while (it.hasNext()) {
                Wifi next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_WifiRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        } else {
            j4 = j3;
        }
        RealmList<MyBeacon> realmGet$beacons = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beacons();
        if (realmGet$beacons != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j4), pointColumnInfo.beaconsIndex);
            Iterator<MyBeacon> it2 = realmGet$beacons.iterator();
            while (it2.hasNext()) {
                MyBeacon next2 = it2.next();
                Long l2 = map2.get(next2);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insert(realm2, next2, map2));
                }
                osList2.addRow(l2.longValue());
            }
        }
        Integer realmGet$isBeaconEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isBeaconEnable();
        if (realmGet$isBeaconEnable != null) {
            j5 = j4;
            Table.nativeSetLong(nativePtr, pointColumnInfo.isBeaconEnableIndex, j4, realmGet$isBeaconEnable.longValue(), false);
        } else {
            j5 = j4;
        }
        BeaconAction realmGet$beaconAction = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beaconAction();
        if (realmGet$beaconAction != null) {
            Long l3 = map2.get(realmGet$beaconAction);
            if (l3 == null) {
                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insert(realm2, realmGet$beaconAction, map2));
            }
            Table.nativeSetLink(nativePtr, pointColumnInfo.beaconActionIndex, j5, l3.longValue(), false);
        }
        Boolean realmGet$isWIFIEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isWIFIEnable();
        if (realmGet$isWIFIEnable != null) {
            Table.nativeSetBoolean(nativePtr, pointColumnInfo.isWIFIEnableIndex, j5, realmGet$isWIFIEnable.booleanValue(), false);
        }
        Boolean realmGet$isGPSEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isGPSEnable();
        if (realmGet$isGPSEnable != null) {
            Table.nativeSetBoolean(nativePtr, pointColumnInfo.isGPSEnableIndex, j5, realmGet$isGPSEnable.booleanValue(), false);
        }
        Boolean realmGet$remove = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$remove();
        if (realmGet$remove != null) {
            Table.nativeSetBoolean(nativePtr, pointColumnInfo.removeIndex, j5, realmGet$remove.booleanValue(), false);
        }
        Camera realmGet$camera = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$camera();
        if (realmGet$camera != null) {
            Long l4 = map2.get(realmGet$camera);
            if (l4 == null) {
                l4 = Long.valueOf(ru_unicorn_ujin_data_realm_CameraRealmProxy.insert(realm2, realmGet$camera, map2));
            }
            Table.nativeSetLink(nativePtr, pointColumnInfo.cameraIndex, j5, l4.longValue(), false);
        }
        Table.nativeSetLong(nativePtr, pointColumnInfo.hideIndex, j5, (long) ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$hide(), false);
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
        Table table = realm2.getTable(Point.class);
        long nativePtr = table.getNativePtr();
        PointColumnInfo pointColumnInfo = (PointColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Point.class);
        long j7 = pointColumnInfo.idIndex;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            if (!map2.containsKey(point)) {
                if (point instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) point;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(point, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface = point;
                String realmGet$id = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$id();
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
                map2.put(point, Long.valueOf(j2));
                Double realmGet$longitude = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$longitude();
                if (realmGet$longitude != null) {
                    j4 = j2;
                    j3 = j7;
                    Table.nativeSetDouble(nativePtr, pointColumnInfo.longitudeIndex, j2, realmGet$longitude.doubleValue(), false);
                } else {
                    j4 = j2;
                    j3 = j7;
                }
                Double realmGet$latitude = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$latitude();
                if (realmGet$latitude != null) {
                    Table.nativeSetDouble(nativePtr, pointColumnInfo.latitudeIndex, j4, realmGet$latitude.doubleValue(), false);
                }
                String realmGet$radius = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$radius();
                if (realmGet$radius != null) {
                    Table.nativeSetString(nativePtr, pointColumnInfo.radiusIndex, j4, realmGet$radius, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, pointColumnInfo.nameIndex, j4, realmGet$name, false);
                }
                RealmList<Wifi> realmGet$wifi = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$wifi();
                if (realmGet$wifi != null) {
                    j5 = j4;
                    OsList osList = new OsList(table.getUncheckedRow(j5), pointColumnInfo.wifiIndex);
                    Iterator<Wifi> it2 = realmGet$wifi.iterator();
                    while (it2.hasNext()) {
                        Wifi next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_WifiRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                } else {
                    j5 = j4;
                }
                RealmList<MyBeacon> realmGet$beacons = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beacons();
                if (realmGet$beacons != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j5), pointColumnInfo.beaconsIndex);
                    Iterator<MyBeacon> it3 = realmGet$beacons.iterator();
                    while (it3.hasNext()) {
                        MyBeacon next2 = it3.next();
                        Long l2 = map2.get(next2);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l2.longValue());
                    }
                }
                Integer realmGet$isBeaconEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isBeaconEnable();
                if (realmGet$isBeaconEnable != null) {
                    j6 = j5;
                    Table.nativeSetLong(nativePtr, pointColumnInfo.isBeaconEnableIndex, j5, realmGet$isBeaconEnable.longValue(), false);
                } else {
                    j6 = j5;
                }
                BeaconAction realmGet$beaconAction = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beaconAction();
                if (realmGet$beaconAction != null) {
                    Long l3 = map2.get(realmGet$beaconAction);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insert(realm2, realmGet$beaconAction, map2));
                    }
                    table.setLink(pointColumnInfo.beaconActionIndex, j6, l3.longValue(), false);
                }
                Boolean realmGet$isWIFIEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isWIFIEnable();
                if (realmGet$isWIFIEnable != null) {
                    Table.nativeSetBoolean(nativePtr, pointColumnInfo.isWIFIEnableIndex, j6, realmGet$isWIFIEnable.booleanValue(), false);
                }
                Boolean realmGet$isGPSEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isGPSEnable();
                if (realmGet$isGPSEnable != null) {
                    Table.nativeSetBoolean(nativePtr, pointColumnInfo.isGPSEnableIndex, j6, realmGet$isGPSEnable.booleanValue(), false);
                }
                Boolean realmGet$remove = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$remove();
                if (realmGet$remove != null) {
                    Table.nativeSetBoolean(nativePtr, pointColumnInfo.removeIndex, j6, realmGet$remove.booleanValue(), false);
                }
                Camera realmGet$camera = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$camera();
                if (realmGet$camera != null) {
                    Long l4 = map2.get(realmGet$camera);
                    if (l4 == null) {
                        l4 = Long.valueOf(ru_unicorn_ujin_data_realm_CameraRealmProxy.insert(realm2, realmGet$camera, map2));
                    }
                    table.setLink(pointColumnInfo.cameraIndex, j6, l4.longValue(), false);
                }
                Table.nativeSetLong(nativePtr, pointColumnInfo.hideIndex, j6, (long) ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$hide(), false);
                j7 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Point point, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Point point2 = point;
        Map<RealmModel, Long> map2 = map;
        if (point2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) point2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Point.class);
        long nativePtr = table.getNativePtr();
        PointColumnInfo pointColumnInfo = (PointColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Point.class);
        long j4 = pointColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface = point2;
        String realmGet$id = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
        map2.put(point2, Long.valueOf(createRowWithPrimaryKey));
        Double realmGet$longitude = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$longitude();
        if (realmGet$longitude != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetDouble(nativePtr, pointColumnInfo.longitudeIndex, createRowWithPrimaryKey, realmGet$longitude.doubleValue(), false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, pointColumnInfo.longitudeIndex, j2, false);
        }
        Double realmGet$latitude = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$latitude();
        if (realmGet$latitude != null) {
            Table.nativeSetDouble(nativePtr, pointColumnInfo.latitudeIndex, j2, realmGet$latitude.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, pointColumnInfo.latitudeIndex, j2, false);
        }
        String realmGet$radius = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$radius();
        if (realmGet$radius != null) {
            Table.nativeSetString(nativePtr, pointColumnInfo.radiusIndex, j2, realmGet$radius, false);
        } else {
            Table.nativeSetNull(nativePtr, pointColumnInfo.radiusIndex, j2, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, pointColumnInfo.nameIndex, j2, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, pointColumnInfo.nameIndex, j2, false);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), pointColumnInfo.wifiIndex);
        RealmList<Wifi> realmGet$wifi = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$wifi();
        if (realmGet$wifi == null || ((long) realmGet$wifi.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$wifi != null) {
                Iterator<Wifi> it = realmGet$wifi.iterator();
                while (it.hasNext()) {
                    Wifi next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_WifiRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int i = 0;
            for (int size = realmGet$wifi.size(); i < size; size = size) {
                Wifi wifi = realmGet$wifi.get(i);
                Long l2 = map2.get(wifi);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_WifiRealmProxy.insertOrUpdate(realm2, wifi, map2));
                }
                osList.setRow((long) i, l2.longValue());
                i++;
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j5), pointColumnInfo.beaconsIndex);
        RealmList<MyBeacon> realmGet$beacons = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beacons();
        if (realmGet$beacons == null || ((long) realmGet$beacons.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$beacons != null) {
                Iterator<MyBeacon> it2 = realmGet$beacons.iterator();
                while (it2.hasNext()) {
                    MyBeacon next2 = it2.next();
                    Long l3 = map2.get(next2);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l3.longValue());
                }
            }
        } else {
            int size2 = realmGet$beacons.size();
            for (int i2 = 0; i2 < size2; i2++) {
                MyBeacon myBeacon = realmGet$beacons.get(i2);
                Long l4 = map2.get(myBeacon);
                if (l4 == null) {
                    l4 = Long.valueOf(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insertOrUpdate(realm2, myBeacon, map2));
                }
                osList2.setRow((long) i2, l4.longValue());
            }
        }
        Integer realmGet$isBeaconEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isBeaconEnable();
        if (realmGet$isBeaconEnable != null) {
            j3 = j5;
            Table.nativeSetLong(nativePtr, pointColumnInfo.isBeaconEnableIndex, j5, realmGet$isBeaconEnable.longValue(), false);
        } else {
            j3 = j5;
            Table.nativeSetNull(nativePtr, pointColumnInfo.isBeaconEnableIndex, j3, false);
        }
        BeaconAction realmGet$beaconAction = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beaconAction();
        if (realmGet$beaconAction != null) {
            Long l5 = map2.get(realmGet$beaconAction);
            if (l5 == null) {
                l5 = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insertOrUpdate(realm2, realmGet$beaconAction, map2));
            }
            Table.nativeSetLink(nativePtr, pointColumnInfo.beaconActionIndex, j3, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, pointColumnInfo.beaconActionIndex, j3);
        }
        Boolean realmGet$isWIFIEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isWIFIEnable();
        if (realmGet$isWIFIEnable != null) {
            Table.nativeSetBoolean(nativePtr, pointColumnInfo.isWIFIEnableIndex, j3, realmGet$isWIFIEnable.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, pointColumnInfo.isWIFIEnableIndex, j3, false);
        }
        Boolean realmGet$isGPSEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isGPSEnable();
        if (realmGet$isGPSEnable != null) {
            Table.nativeSetBoolean(nativePtr, pointColumnInfo.isGPSEnableIndex, j3, realmGet$isGPSEnable.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, pointColumnInfo.isGPSEnableIndex, j3, false);
        }
        Boolean realmGet$remove = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$remove();
        if (realmGet$remove != null) {
            Table.nativeSetBoolean(nativePtr, pointColumnInfo.removeIndex, j3, realmGet$remove.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, pointColumnInfo.removeIndex, j3, false);
        }
        Camera realmGet$camera = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$camera();
        if (realmGet$camera != null) {
            Long l6 = map2.get(realmGet$camera);
            if (l6 == null) {
                l6 = Long.valueOf(ru_unicorn_ujin_data_realm_CameraRealmProxy.insertOrUpdate(realm2, realmGet$camera, map2));
            }
            Table.nativeSetLink(nativePtr, pointColumnInfo.cameraIndex, j3, l6.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, pointColumnInfo.cameraIndex, j3);
        }
        Table.nativeSetLong(nativePtr, pointColumnInfo.hideIndex, j3, (long) ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$hide(), false);
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Point.class);
        long nativePtr = table.getNativePtr();
        PointColumnInfo pointColumnInfo = (PointColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Point.class);
        long j7 = pointColumnInfo.idIndex;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            if (!map2.containsKey(point)) {
                if (point instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) point;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(point, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface = point;
                String realmGet$id = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j7);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j7, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j7, realmGet$id) : j;
                map2.put(point, Long.valueOf(createRowWithPrimaryKey));
                Double realmGet$longitude = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$longitude();
                if (realmGet$longitude != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j7;
                    Table.nativeSetDouble(nativePtr, pointColumnInfo.longitudeIndex, createRowWithPrimaryKey, realmGet$longitude.doubleValue(), false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j7;
                    Table.nativeSetNull(nativePtr, pointColumnInfo.longitudeIndex, createRowWithPrimaryKey, false);
                }
                Double realmGet$latitude = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$latitude();
                if (realmGet$latitude != null) {
                    Table.nativeSetDouble(nativePtr, pointColumnInfo.latitudeIndex, j3, realmGet$latitude.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, pointColumnInfo.latitudeIndex, j3, false);
                }
                String realmGet$radius = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$radius();
                if (realmGet$radius != null) {
                    Table.nativeSetString(nativePtr, pointColumnInfo.radiusIndex, j3, realmGet$radius, false);
                } else {
                    Table.nativeSetNull(nativePtr, pointColumnInfo.radiusIndex, j3, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, pointColumnInfo.nameIndex, j3, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, pointColumnInfo.nameIndex, j3, false);
                }
                long j8 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j8), pointColumnInfo.wifiIndex);
                RealmList<Wifi> realmGet$wifi = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$wifi();
                if (realmGet$wifi == null || ((long) realmGet$wifi.size()) != osList.size()) {
                    j4 = j8;
                    osList.removeAll();
                    if (realmGet$wifi != null) {
                        Iterator<Wifi> it2 = realmGet$wifi.iterator();
                        while (it2.hasNext()) {
                            Wifi next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_WifiRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$wifi.size();
                    int i = 0;
                    while (i < size) {
                        Wifi wifi = realmGet$wifi.get(i);
                        Long l2 = map2.get(wifi);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_WifiRealmProxy.insertOrUpdate(realm2, wifi, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        size = size;
                        j8 = j8;
                    }
                    j4 = j8;
                }
                long j9 = j4;
                OsList osList2 = new OsList(table.getUncheckedRow(j9), pointColumnInfo.beaconsIndex);
                RealmList<MyBeacon> realmGet$beacons = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beacons();
                if (realmGet$beacons == null || ((long) realmGet$beacons.size()) != osList2.size()) {
                    j5 = j9;
                    osList2.removeAll();
                    if (realmGet$beacons != null) {
                        Iterator<MyBeacon> it3 = realmGet$beacons.iterator();
                        while (it3.hasNext()) {
                            MyBeacon next2 = it3.next();
                            Long l3 = map2.get(next2);
                            if (l3 == null) {
                                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l3.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$beacons.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        MyBeacon myBeacon = realmGet$beacons.get(i2);
                        Long l4 = map2.get(myBeacon);
                        if (l4 == null) {
                            l4 = Long.valueOf(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.insertOrUpdate(realm2, myBeacon, map2));
                        }
                        osList2.setRow((long) i2, l4.longValue());
                        i2++;
                        size2 = size2;
                        j9 = j9;
                    }
                    j5 = j9;
                }
                Integer realmGet$isBeaconEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isBeaconEnable();
                if (realmGet$isBeaconEnable != null) {
                    j6 = j5;
                    Table.nativeSetLong(nativePtr, pointColumnInfo.isBeaconEnableIndex, j6, realmGet$isBeaconEnable.longValue(), false);
                } else {
                    j6 = j5;
                    Table.nativeSetNull(nativePtr, pointColumnInfo.isBeaconEnableIndex, j6, false);
                }
                BeaconAction realmGet$beaconAction = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$beaconAction();
                if (realmGet$beaconAction != null) {
                    Long l5 = map2.get(realmGet$beaconAction);
                    if (l5 == null) {
                        l5 = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.insertOrUpdate(realm2, realmGet$beaconAction, map2));
                    }
                    Table.nativeSetLink(nativePtr, pointColumnInfo.beaconActionIndex, j6, l5.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, pointColumnInfo.beaconActionIndex, j6);
                }
                Boolean realmGet$isWIFIEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isWIFIEnable();
                if (realmGet$isWIFIEnable != null) {
                    Table.nativeSetBoolean(nativePtr, pointColumnInfo.isWIFIEnableIndex, j6, realmGet$isWIFIEnable.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, pointColumnInfo.isWIFIEnableIndex, j6, false);
                }
                Boolean realmGet$isGPSEnable = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$isGPSEnable();
                if (realmGet$isGPSEnable != null) {
                    Table.nativeSetBoolean(nativePtr, pointColumnInfo.isGPSEnableIndex, j6, realmGet$isGPSEnable.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, pointColumnInfo.isGPSEnableIndex, j6, false);
                }
                Boolean realmGet$remove = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$remove();
                if (realmGet$remove != null) {
                    Table.nativeSetBoolean(nativePtr, pointColumnInfo.removeIndex, j6, realmGet$remove.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, pointColumnInfo.removeIndex, j6, false);
                }
                Camera realmGet$camera = ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$camera();
                if (realmGet$camera != null) {
                    Long l6 = map2.get(realmGet$camera);
                    if (l6 == null) {
                        l6 = Long.valueOf(ru_unicorn_ujin_data_realm_CameraRealmProxy.insertOrUpdate(realm2, realmGet$camera, map2));
                    }
                    Table.nativeSetLink(nativePtr, pointColumnInfo.cameraIndex, j6, l6.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, pointColumnInfo.cameraIndex, j6);
                }
                Table.nativeSetLong(nativePtr, pointColumnInfo.hideIndex, j6, (long) ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmGet$hide(), false);
                j7 = j2;
            }
        }
    }

    public static Point createDetachedCopy(Point point, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Point point2;
        if (i > i2 || point == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(point);
        if (cacheData == null) {
            point2 = new Point();
            map.put(point, new RealmObjectProxy.CacheData(i, point2));
        } else if (i >= cacheData.minDepth) {
            return (Point) cacheData.object;
        } else {
            cacheData.minDepth = i;
            point2 = (Point) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface = point2;
        ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface2 = point;
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$longitude(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$longitude());
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$latitude(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$latitude());
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$radius(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$radius());
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$name());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$wifi((RealmList<Wifi>) null);
        } else {
            RealmList<Wifi> realmGet$wifi = ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$wifi();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$wifi(realmList);
            int i3 = i + 1;
            int size = realmGet$wifi.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_WifiRealmProxy.createDetachedCopy(realmGet$wifi.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$beacons((RealmList<MyBeacon>) null);
        } else {
            RealmList<MyBeacon> realmGet$beacons = ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$beacons();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$beacons(realmList2);
            int i5 = i + 1;
            int size2 = realmGet$beacons.size();
            for (int i6 = 0; i6 < size2; i6++) {
                realmList2.add(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.createDetachedCopy(realmGet$beacons.get(i6), i5, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isBeaconEnable(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$isBeaconEnable());
        int i7 = i + 1;
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$beaconAction(ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$beaconAction(), i7, i2, map));
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isWIFIEnable(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$isWIFIEnable());
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$isGPSEnable(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$isGPSEnable());
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$remove(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$remove());
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$camera(ru_unicorn_ujin_data_realm_CameraRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$camera(), i7, i2, map));
        ru_unicorn_ujin_data_realm_pointrealmproxyinterface.realmSet$hide(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$hide());
        return point2;
    }

    static Point update(Realm realm, PointColumnInfo pointColumnInfo, Point point, Point point2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        PointColumnInfo pointColumnInfo2 = pointColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface = point;
        ru_unicorn_ujin_data_realm_PointRealmProxyInterface ru_unicorn_ujin_data_realm_pointrealmproxyinterface2 = point2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Point.class), pointColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(pointColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addDouble(pointColumnInfo2.longitudeIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$longitude());
        osObjectBuilder.addDouble(pointColumnInfo2.latitudeIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$latitude());
        osObjectBuilder.addString(pointColumnInfo2.radiusIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$radius());
        osObjectBuilder.addString(pointColumnInfo2.nameIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$name());
        RealmList<Wifi> realmGet$wifi = ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$wifi();
        if (realmGet$wifi != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$wifi.size(); i++) {
                Wifi wifi = realmGet$wifi.get(i);
                Wifi wifi2 = (Wifi) map2.get(wifi);
                if (wifi2 != null) {
                    realmList.add(wifi2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_WifiRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_WifiRealmProxy.WifiColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Wifi.class), wifi, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(pointColumnInfo2.wifiIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(pointColumnInfo2.wifiIndex, new RealmList());
        }
        RealmList<MyBeacon> realmGet$beacons = ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$beacons();
        if (realmGet$beacons != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$beacons.size(); i2++) {
                MyBeacon myBeacon = realmGet$beacons.get(i2);
                MyBeacon myBeacon2 = (MyBeacon) map2.get(myBeacon);
                if (myBeacon2 != null) {
                    realmList2.add(myBeacon2);
                } else {
                    realmList2.add(ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.MyBeaconColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MyBeacon.class), myBeacon, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(pointColumnInfo2.beaconsIndex, realmList2);
        } else {
            osObjectBuilder.addObjectList(pointColumnInfo2.beaconsIndex, new RealmList());
        }
        osObjectBuilder.addInteger(pointColumnInfo2.isBeaconEnableIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$isBeaconEnable());
        BeaconAction realmGet$beaconAction = ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$beaconAction();
        if (realmGet$beaconAction == null) {
            osObjectBuilder.addNull(pointColumnInfo2.beaconActionIndex);
        } else {
            BeaconAction beaconAction = (BeaconAction) map2.get(realmGet$beaconAction);
            if (beaconAction != null) {
                osObjectBuilder.addObject(pointColumnInfo2.beaconActionIndex, beaconAction);
            } else {
                osObjectBuilder.addObject(pointColumnInfo2.beaconActionIndex, ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.BeaconActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconAction.class), realmGet$beaconAction, true, map, set));
            }
        }
        osObjectBuilder.addBoolean(pointColumnInfo2.isWIFIEnableIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$isWIFIEnable());
        osObjectBuilder.addBoolean(pointColumnInfo2.isGPSEnableIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$isGPSEnable());
        osObjectBuilder.addBoolean(pointColumnInfo2.removeIndex, ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$remove());
        Camera realmGet$camera = ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$camera();
        if (realmGet$camera == null) {
            osObjectBuilder.addNull(pointColumnInfo2.cameraIndex);
        } else {
            Camera camera = (Camera) map2.get(realmGet$camera);
            if (camera != null) {
                osObjectBuilder.addObject(pointColumnInfo2.cameraIndex, camera);
            } else {
                osObjectBuilder.addObject(pointColumnInfo2.cameraIndex, ru_unicorn_ujin_data_realm_CameraRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CameraRealmProxy.CameraColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Camera.class), realmGet$camera, true, map, set));
            }
        }
        osObjectBuilder.addInteger(pointColumnInfo2.hideIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_pointrealmproxyinterface2.realmGet$hide()));
        osObjectBuilder.updateExistingObject();
        return point;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Point = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{longitude:");
        sb.append(realmGet$longitude() != null ? realmGet$longitude() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{latitude:");
        sb.append(realmGet$latitude() != null ? realmGet$latitude() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{radius:");
        sb.append(realmGet$radius() != null ? realmGet$radius() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{wifi:");
        sb.append("RealmList<Wifi>[");
        sb.append(realmGet$wifi().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{beacons:");
        sb.append("RealmList<MyBeacon>[");
        sb.append(realmGet$beacons().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{isBeaconEnable:");
        sb.append(realmGet$isBeaconEnable() != null ? realmGet$isBeaconEnable() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{beaconAction:");
        sb.append(realmGet$beaconAction() != null ? ru_unicorn_ujin_data_realm_BeaconActionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{isWIFIEnable:");
        sb.append(realmGet$isWIFIEnable() != null ? realmGet$isWIFIEnable() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{isGPSEnable:");
        sb.append(realmGet$isGPSEnable() != null ? realmGet$isGPSEnable() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{remove:");
        sb.append(realmGet$remove() != null ? realmGet$remove() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{camera:");
        if (realmGet$camera() != null) {
            str = ru_unicorn_ujin_data_realm_CameraRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{hide:");
        sb.append(realmGet$hide());
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
        ru_unicorn_ujin_data_realm_PointRealmProxy ru_unicorn_ujin_data_realm_pointrealmproxy = (ru_unicorn_ujin_data_realm_PointRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_pointrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_pointrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_pointrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
