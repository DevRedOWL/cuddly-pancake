package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.react.modules.appstate.AppStateModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.Bank;
import p035ru.unicorn.ujin.data.realm.Feature;
import p035ru.unicorn.ujin.data.realm.Layout;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_BankRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_FeatureRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy */
public class ru_unicorn_ujin_data_realm_LayoutRealmProxy extends Layout implements RealmObjectProxy, ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private LayoutColumnInfo columnInfo;
    private RealmList<Feature> featuresRealmList;
    private ProxyState<Layout> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Layout";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy$LayoutColumnInfo */
    static final class LayoutColumnInfo extends ColumnInfo {
        long backgroundIndex;
        long bankIndex;
        long featuresIndex;
        long maxColumnIndexValue;
        long phoneIndex;
        long titleIndex;

        LayoutColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.backgroundIndex = addColumnDetails(AppStateModule.APP_STATE_BACKGROUND, AppStateModule.APP_STATE_BACKGROUND, objectSchemaInfo);
            this.bankIndex = addColumnDetails("bank", "bank", objectSchemaInfo);
            this.featuresIndex = addColumnDetails("features", "features", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.phoneIndex = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        LayoutColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new LayoutColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            LayoutColumnInfo layoutColumnInfo = (LayoutColumnInfo) columnInfo;
            LayoutColumnInfo layoutColumnInfo2 = (LayoutColumnInfo) columnInfo2;
            layoutColumnInfo2.backgroundIndex = layoutColumnInfo.backgroundIndex;
            layoutColumnInfo2.bankIndex = layoutColumnInfo.bankIndex;
            layoutColumnInfo2.featuresIndex = layoutColumnInfo.featuresIndex;
            layoutColumnInfo2.titleIndex = layoutColumnInfo.titleIndex;
            layoutColumnInfo2.phoneIndex = layoutColumnInfo.phoneIndex;
            layoutColumnInfo2.maxColumnIndexValue = layoutColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_LayoutRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (LayoutColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$background() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.backgroundIndex);
    }

    public void realmSet$background(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.backgroundIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.backgroundIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.backgroundIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.backgroundIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Bank realmGet$bank() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.bankIndex)) {
            return null;
        }
        return (Bank) this.proxyState.getRealm$realm().get(Bank.class, this.proxyState.getRow$realm().getLink(this.columnInfo.bankIndex), false, Collections.emptyList());
    }

    public void realmSet$bank(Bank bank) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bank == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.bankIndex);
                return;
            }
            this.proxyState.checkValidObject(bank);
            this.proxyState.getRow$realm().setLink(this.columnInfo.bankIndex, ((RealmObjectProxy) bank).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("bank")) {
            if (bank != null && !RealmObject.isManaged(bank)) {
                bank = (Bank) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(bank, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (bank == null) {
                row$realm.nullifyLink(this.columnInfo.bankIndex);
                return;
            }
            this.proxyState.checkValidObject(bank);
            row$realm.getTable().setLink(this.columnInfo.bankIndex, row$realm.getIndex(), ((RealmObjectProxy) bank).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RealmList<Feature> realmGet$features() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Feature> realmList = this.featuresRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.featuresRealmList = new RealmList<>(Feature.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.featuresIndex), this.proxyState.getRealm$realm());
        return this.featuresRealmList;
    }

    public void realmSet$features(RealmList<Feature> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("features")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Feature> realmList2 = new RealmList<>();
                Iterator<Feature> it = realmList.iterator();
                while (it.hasNext()) {
                    Feature next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.featuresIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Feature feature = realmList.get(i);
                    this.proxyState.checkValidObject(feature);
                    modelList.addRow(((RealmObjectProxy) feature).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Feature feature2 = realmList.get(i);
            this.proxyState.checkValidObject(feature2);
            modelList.setRow((long) i, ((RealmObjectProxy) feature2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
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

    public String realmGet$phone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.phoneIndex);
    }

    public void realmSet$phone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.phoneIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.phoneIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.phoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.phoneIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        builder.addPersistedProperty(AppStateModule.APP_STATE_BACKGROUND, RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("bank", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_BankRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("features", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_FeatureRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("phone", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static LayoutColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new LayoutColumnInfo(osSchemaInfo);
    }

    public static Layout createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has("bank")) {
            arrayList.add("bank");
        }
        if (jSONObject.has("features")) {
            arrayList.add("features");
        }
        Layout layout = (Layout) realm.createObjectInternal(Layout.class, true, arrayList);
        ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface = layout;
        if (jSONObject.has(AppStateModule.APP_STATE_BACKGROUND)) {
            if (jSONObject.isNull(AppStateModule.APP_STATE_BACKGROUND)) {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$background((String) null);
            } else {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$background(jSONObject.getString(AppStateModule.APP_STATE_BACKGROUND));
            }
        }
        if (jSONObject.has("bank")) {
            if (jSONObject.isNull("bank")) {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$bank((Bank) null);
            } else {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$bank(ru_unicorn_ujin_data_realm_BankRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("bank"), z));
            }
        }
        if (jSONObject.has("features")) {
            if (jSONObject.isNull("features")) {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$features((RealmList<Feature>) null);
            } else {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$features().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("features");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$features().add(ru_unicorn_ujin_data_realm_FeatureRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("phone")) {
            if (jSONObject.isNull("phone")) {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$phone((String) null);
            } else {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$phone(jSONObject.getString("phone"));
            }
        }
        return layout;
    }

    public static Layout createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Layout layout = new Layout();
        ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface = layout;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(AppStateModule.APP_STATE_BACKGROUND)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$background(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$background((String) null);
                }
            } else if (nextName.equals("bank")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$bank((Bank) null);
                } else {
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$bank(ru_unicorn_ujin_data_realm_BankRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("features")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$features((RealmList<Feature>) null);
                } else {
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$features(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$features().add(ru_unicorn_ujin_data_realm_FeatureRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("phone")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$phone(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$phone((String) null);
            }
        }
        jsonReader.endObject();
        return (Layout) realm.copyToRealm(layout, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_LayoutRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Layout.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_LayoutRealmProxy ru_unicorn_ujin_data_realm_layoutrealmproxy = new ru_unicorn_ujin_data_realm_LayoutRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_layoutrealmproxy;
    }

    public static Layout copyOrUpdate(Realm realm, LayoutColumnInfo layoutColumnInfo, Layout layout, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (layout instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) layout;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return layout;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(layout);
        if (realmObjectProxy2 != null) {
            return (Layout) realmObjectProxy2;
        }
        return copy(realm, layoutColumnInfo, layout, z, map, set);
    }

    public static Layout copy(Realm realm, LayoutColumnInfo layoutColumnInfo, Layout layout, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(layout);
        if (realmObjectProxy != null) {
            return (Layout) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface = layout;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Layout.class), layoutColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(layoutColumnInfo.backgroundIndex, ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$background());
        osObjectBuilder.addString(layoutColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(layoutColumnInfo.phoneIndex, ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$phone());
        ru_unicorn_ujin_data_realm_LayoutRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(layout, newProxyInstance);
        Bank realmGet$bank = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$bank();
        if (realmGet$bank == null) {
            newProxyInstance.realmSet$bank((Bank) null);
        } else {
            Bank bank = (Bank) map.get(realmGet$bank);
            if (bank != null) {
                newProxyInstance.realmSet$bank(bank);
            } else {
                newProxyInstance.realmSet$bank(ru_unicorn_ujin_data_realm_BankRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BankRealmProxy.BankColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Bank.class), realmGet$bank, z, map, set));
            }
        }
        RealmList<Feature> realmGet$features = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$features();
        if (realmGet$features != null) {
            RealmList<Feature> realmGet$features2 = newProxyInstance.realmGet$features();
            realmGet$features2.clear();
            for (int i = 0; i < realmGet$features.size(); i++) {
                Feature feature = realmGet$features.get(i);
                Feature feature2 = (Feature) map.get(feature);
                if (feature2 != null) {
                    realmGet$features2.add(feature2);
                } else {
                    realmGet$features2.add(ru_unicorn_ujin_data_realm_FeatureRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FeatureRealmProxy.FeatureColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Feature.class), feature, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Layout layout, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Layout layout2 = layout;
        Map<RealmModel, Long> map2 = map;
        if (layout2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) layout2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Layout.class);
        long nativePtr = table.getNativePtr();
        LayoutColumnInfo layoutColumnInfo = (LayoutColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Layout.class);
        long createRow = OsObject.createRow(table);
        map2.put(layout2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface = layout2;
        String realmGet$background = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$background();
        if (realmGet$background != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, layoutColumnInfo.backgroundIndex, createRow, realmGet$background, false);
        } else {
            j = createRow;
        }
        Bank realmGet$bank = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$bank();
        if (realmGet$bank != null) {
            Long l = map2.get(realmGet$bank);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_BankRealmProxy.insert(realm2, realmGet$bank, map2));
            }
            Table.nativeSetLink(nativePtr, layoutColumnInfo.bankIndex, j, l.longValue(), false);
        }
        RealmList<Feature> realmGet$features = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$features();
        if (realmGet$features != null) {
            j2 = j;
            OsList osList = new OsList(table.getUncheckedRow(j2), layoutColumnInfo.featuresIndex);
            Iterator<Feature> it = realmGet$features.iterator();
            while (it.hasNext()) {
                Feature next = it.next();
                Long l2 = map2.get(next);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FeatureRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l2.longValue());
            }
        } else {
            j2 = j;
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, layoutColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            j3 = j2;
        }
        String realmGet$phone = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, layoutColumnInfo.phoneIndex, j3, realmGet$phone, false);
        }
        return j3;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Layout.class);
        long nativePtr = table.getNativePtr();
        LayoutColumnInfo layoutColumnInfo = (LayoutColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Layout.class);
        while (it.hasNext()) {
            Layout layout = (Layout) it.next();
            if (!map2.containsKey(layout)) {
                if (layout instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) layout;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(layout, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(layout, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface = layout;
                String realmGet$background = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$background();
                if (realmGet$background != null) {
                    Table.nativeSetString(nativePtr, layoutColumnInfo.backgroundIndex, createRow, realmGet$background, false);
                }
                Bank realmGet$bank = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$bank();
                if (realmGet$bank != null) {
                    Long l = map2.get(realmGet$bank);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_BankRealmProxy.insert(realm2, realmGet$bank, map2));
                    }
                    table.setLink(layoutColumnInfo.bankIndex, createRow, l.longValue(), false);
                }
                RealmList<Feature> realmGet$features = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$features();
                if (realmGet$features != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), layoutColumnInfo.featuresIndex);
                    Iterator<Feature> it2 = realmGet$features.iterator();
                    while (it2.hasNext()) {
                        Feature next = it2.next();
                        Long l2 = map2.get(next);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FeatureRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, layoutColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$phone = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, layoutColumnInfo.phoneIndex, createRow, realmGet$phone, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Layout layout, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Layout layout2 = layout;
        Map<RealmModel, Long> map2 = map;
        if (layout2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) layout2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Layout.class);
        long nativePtr = table.getNativePtr();
        LayoutColumnInfo layoutColumnInfo = (LayoutColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Layout.class);
        long createRow = OsObject.createRow(table);
        map2.put(layout2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface = layout2;
        String realmGet$background = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$background();
        if (realmGet$background != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, layoutColumnInfo.backgroundIndex, createRow, realmGet$background, false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, layoutColumnInfo.backgroundIndex, j, false);
        }
        Bank realmGet$bank = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$bank();
        if (realmGet$bank != null) {
            Long l = map2.get(realmGet$bank);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_BankRealmProxy.insertOrUpdate(realm2, realmGet$bank, map2));
            }
            Table.nativeSetLink(nativePtr, layoutColumnInfo.bankIndex, j, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, layoutColumnInfo.bankIndex, j);
        }
        long j3 = j;
        OsList osList = new OsList(table.getUncheckedRow(j3), layoutColumnInfo.featuresIndex);
        RealmList<Feature> realmGet$features = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$features();
        if (realmGet$features == null || ((long) realmGet$features.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$features != null) {
                Iterator<Feature> it = realmGet$features.iterator();
                while (it.hasNext()) {
                    Feature next = it.next();
                    Long l2 = map2.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FeatureRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l2.longValue());
                }
            }
        } else {
            int size = realmGet$features.size();
            for (int i = 0; i < size; i++) {
                Feature feature = realmGet$features.get(i);
                Long l3 = map2.get(feature);
                if (l3 == null) {
                    l3 = Long.valueOf(ru_unicorn_ujin_data_realm_FeatureRealmProxy.insertOrUpdate(realm2, feature, map2));
                }
                osList.setRow((long) i, l3.longValue());
            }
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = j3;
            Table.nativeSetString(nativePtr, layoutColumnInfo.titleIndex, j3, realmGet$title, false);
        } else {
            j2 = j3;
            Table.nativeSetNull(nativePtr, layoutColumnInfo.titleIndex, j2, false);
        }
        String realmGet$phone = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, layoutColumnInfo.phoneIndex, j2, realmGet$phone, false);
        } else {
            Table.nativeSetNull(nativePtr, layoutColumnInfo.phoneIndex, j2, false);
        }
        return j2;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Layout.class);
        long nativePtr = table.getNativePtr();
        LayoutColumnInfo layoutColumnInfo = (LayoutColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Layout.class);
        while (it.hasNext()) {
            Layout layout = (Layout) it.next();
            if (!map2.containsKey(layout)) {
                if (layout instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) layout;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(layout, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(layout, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface = layout;
                String realmGet$background = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$background();
                if (realmGet$background != null) {
                    j = createRow;
                    Table.nativeSetString(nativePtr, layoutColumnInfo.backgroundIndex, createRow, realmGet$background, false);
                } else {
                    j = createRow;
                    Table.nativeSetNull(nativePtr, layoutColumnInfo.backgroundIndex, j, false);
                }
                Bank realmGet$bank = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$bank();
                if (realmGet$bank != null) {
                    Long l = map2.get(realmGet$bank);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_BankRealmProxy.insertOrUpdate(realm2, realmGet$bank, map2));
                    }
                    Table.nativeSetLink(nativePtr, layoutColumnInfo.bankIndex, j, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, layoutColumnInfo.bankIndex, j);
                }
                long j4 = j;
                OsList osList = new OsList(table.getUncheckedRow(j4), layoutColumnInfo.featuresIndex);
                RealmList<Feature> realmGet$features = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$features();
                if (realmGet$features == null || ((long) realmGet$features.size()) != osList.size()) {
                    j2 = j4;
                    osList.removeAll();
                    if (realmGet$features != null) {
                        Iterator<Feature> it2 = realmGet$features.iterator();
                        while (it2.hasNext()) {
                            Feature next = it2.next();
                            Long l2 = map2.get(next);
                            if (l2 == null) {
                                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FeatureRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l2.longValue());
                        }
                    }
                } else {
                    int size = realmGet$features.size();
                    int i = 0;
                    while (i < size) {
                        Feature feature = realmGet$features.get(i);
                        Long l3 = map2.get(feature);
                        if (l3 == null) {
                            l3 = Long.valueOf(ru_unicorn_ujin_data_realm_FeatureRealmProxy.insertOrUpdate(realm2, feature, map2));
                        }
                        osList.setRow((long) i, l3.longValue());
                        i++;
                        j4 = j4;
                    }
                    j2 = j4;
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = j2;
                    Table.nativeSetString(nativePtr, layoutColumnInfo.titleIndex, j2, realmGet$title, false);
                } else {
                    j3 = j2;
                    Table.nativeSetNull(nativePtr, layoutColumnInfo.titleIndex, j3, false);
                }
                String realmGet$phone = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, layoutColumnInfo.phoneIndex, j3, realmGet$phone, false);
                } else {
                    Table.nativeSetNull(nativePtr, layoutColumnInfo.phoneIndex, j3, false);
                }
            }
        }
    }

    public static Layout createDetachedCopy(Layout layout, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Layout layout2;
        if (i > i2 || layout == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(layout);
        if (cacheData == null) {
            layout2 = new Layout();
            map.put(layout, new RealmObjectProxy.CacheData(i, layout2));
        } else if (i >= cacheData.minDepth) {
            return (Layout) cacheData.object;
        } else {
            cacheData.minDepth = i;
            layout2 = (Layout) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface = layout2;
        ru_unicorn_ujin_data_realm_LayoutRealmProxyInterface ru_unicorn_ujin_data_realm_layoutrealmproxyinterface2 = layout;
        ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$background(ru_unicorn_ujin_data_realm_layoutrealmproxyinterface2.realmGet$background());
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$bank(ru_unicorn_ujin_data_realm_BankRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_layoutrealmproxyinterface2.realmGet$bank(), i3, i2, map));
        if (i == i2) {
            ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$features((RealmList<Feature>) null);
        } else {
            RealmList<Feature> realmGet$features = ru_unicorn_ujin_data_realm_layoutrealmproxyinterface2.realmGet$features();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$features(realmList);
            int size = realmGet$features.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_FeatureRealmProxy.createDetachedCopy(realmGet$features.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_layoutrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_layoutrealmproxyinterface.realmSet$phone(ru_unicorn_ujin_data_realm_layoutrealmproxyinterface2.realmGet$phone());
        return layout2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Layout = proxy[");
        sb.append("{background:");
        String str = "null";
        sb.append(realmGet$background() != null ? realmGet$background() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{bank:");
        sb.append(realmGet$bank() != null ? ru_unicorn_ujin_data_realm_BankRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{features:");
        sb.append("RealmList<Feature>[");
        sb.append(realmGet$features().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{phone:");
        if (realmGet$phone() != null) {
            str = realmGet$phone();
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
        ru_unicorn_ujin_data_realm_LayoutRealmProxy ru_unicorn_ujin_data_realm_layoutrealmproxy = (ru_unicorn_ujin_data_realm_LayoutRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_layoutrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_layoutrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_layoutrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
