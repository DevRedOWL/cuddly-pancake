package p046io.realm;

import java.io.File;
import java.util.Locale;
import p046io.reactivex.Flowable;
import p046io.realm.BaseRealm;
import p046io.realm.RealmCache;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.CheckedRow;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectStore;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.OsSharedRealm;
import p046io.realm.internal.Table;
import p046io.realm.log.RealmLog;

/* renamed from: io.realm.DynamicRealm */
public class DynamicRealm extends BaseRealm {
    private final RealmSchema schema = new MutableRealmSchema(this);

    /* renamed from: io.realm.DynamicRealm$Transaction */
    public interface Transaction {
        void execute(DynamicRealm dynamicRealm);
    }

    public /* bridge */ /* synthetic */ void beginTransaction() {
        super.beginTransaction();
    }

    public /* bridge */ /* synthetic */ void cancelTransaction() {
        super.cancelTransaction();
    }

    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public /* bridge */ /* synthetic */ void commitTransaction() {
        super.commitTransaction();
    }

    public /* bridge */ /* synthetic */ void deleteAll() {
        super.deleteAll();
    }

    public /* bridge */ /* synthetic */ RealmConfiguration getConfiguration() {
        return super.getConfiguration();
    }

    public /* bridge */ /* synthetic */ String getPath() {
        return super.getPath();
    }

    public /* bridge */ /* synthetic */ long getVersion() {
        return super.getVersion();
    }

    public /* bridge */ /* synthetic */ boolean isAutoRefresh() {
        return super.isAutoRefresh();
    }

    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    public /* bridge */ /* synthetic */ boolean isInTransaction() {
        return super.isInTransaction();
    }

    public /* bridge */ /* synthetic */ void refresh() {
        super.refresh();
    }

    public /* bridge */ /* synthetic */ void setAutoRefresh(boolean z) {
        super.setAutoRefresh(z);
    }

    public /* bridge */ /* synthetic */ void stopWaitForChange() {
        super.stopWaitForChange();
    }

    public /* bridge */ /* synthetic */ boolean waitForChange() {
        return super.waitForChange();
    }

    public /* bridge */ /* synthetic */ void writeCopyTo(File file) {
        super.writeCopyTo(file);
    }

    public /* bridge */ /* synthetic */ void writeEncryptedCopyTo(File file, byte[] bArr) {
        super.writeEncryptedCopyTo(file, bArr);
    }

    private DynamicRealm(final RealmCache realmCache) {
        super(realmCache, (OsSchemaInfo) null);
        RealmCache.invokeWithGlobalRefCount(realmCache.getConfiguration(), new RealmCache.Callback() {
            public void onResult(int i) {
                if (i <= 0 && !realmCache.getConfiguration().isReadOnly() && OsObjectStore.getSchemaVersion(DynamicRealm.this.sharedRealm) == -1) {
                    DynamicRealm.this.sharedRealm.beginTransaction();
                    if (OsObjectStore.getSchemaVersion(DynamicRealm.this.sharedRealm) == -1) {
                        OsObjectStore.setSchemaVersion(DynamicRealm.this.sharedRealm, -1);
                    }
                    DynamicRealm.this.sharedRealm.commitTransaction();
                }
            }
        });
    }

    private DynamicRealm(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
    }

    public static DynamicRealm getInstance(RealmConfiguration realmConfiguration) {
        if (realmConfiguration != null) {
            return (DynamicRealm) RealmCache.createRealmOrGetFromCache(realmConfiguration, DynamicRealm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public static RealmAsyncTask getInstanceAsync(RealmConfiguration realmConfiguration, Callback callback) {
        if (realmConfiguration != null) {
            return RealmCache.createRealmOrGetFromCacheAsync(realmConfiguration, callback, DynamicRealm.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    public DynamicRealmObject createObject(String str) {
        checkIfValid();
        Table table = this.schema.getTable(str);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, str);
        if (primaryKeyForObject == null) {
            return new DynamicRealmObject(this, CheckedRow.getFromRow(OsObject.create(table)));
        }
        throw new RealmException(String.format(Locale.US, "'%s' has a primary key field '%s', use  'createObject(String, Object)' instead.", new Object[]{str, primaryKeyForObject}));
    }

    public DynamicRealmObject createObject(String str, Object obj) {
        return new DynamicRealmObject(this, CheckedRow.getFromRow(OsObject.createWithPrimaryKey(this.schema.getTable(str), obj)));
    }

    public RealmQuery<DynamicRealmObject> where(String str) {
        checkIfValid();
        if (this.sharedRealm.hasTable(Table.getTableNameForClass(str))) {
            return RealmQuery.createDynamicQuery(this, str);
        }
        throw new IllegalArgumentException("Class does not exist in the Realm and cannot be queried: " + str);
    }

    public void addChangeListener(RealmChangeListener<DynamicRealm> realmChangeListener) {
        addListener(realmChangeListener);
    }

    public void removeChangeListener(RealmChangeListener<DynamicRealm> realmChangeListener) {
        removeListener(realmChangeListener);
    }

    public void removeAllChangeListeners() {
        removeAllListeners();
    }

    public void delete(String str) {
        checkIfValid();
        checkIfInTransaction();
        if (!this.sharedRealm.isPartial()) {
            this.schema.getTable(str).clear(this.sharedRealm.isPartial());
            return;
        }
        throw new IllegalStateException("This API is not supported by partially synchronized Realms. Either unsubscribe using 'Realm.unsubscribeAsync()' or delete the objects using a query and 'RealmResults.deleteAllFromRealm()'");
    }

    public void executeTransaction(Transaction transaction) {
        if (transaction != null) {
            beginTransaction();
            try {
                transaction.execute(this);
                commitTransaction();
            } catch (RuntimeException e) {
                if (isInTransaction()) {
                    cancelTransaction();
                } else {
                    RealmLog.warn("Could not cancel transaction, not currently in a transaction.", new Object[0]);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Transaction should not be null");
        }
    }

    static DynamicRealm createInstance(RealmCache realmCache) {
        return new DynamicRealm(realmCache);
    }

    static DynamicRealm createInstance(OsSharedRealm osSharedRealm) {
        return new DynamicRealm(osSharedRealm);
    }

    public Flowable<DynamicRealm> asFlowable() {
        return this.configuration.getRxFactory().from(this);
    }

    public boolean isEmpty() {
        checkIfValid();
        return this.sharedRealm.isEmpty();
    }

    public RealmSchema getSchema() {
        return this.schema;
    }

    /* access modifiers changed from: package-private */
    public void setVersion(long j) {
        OsObjectStore.setSchemaVersion(this.sharedRealm, j);
    }

    /* renamed from: io.realm.DynamicRealm$Callback */
    public static abstract class Callback extends BaseRealm.InstanceCallback<DynamicRealm> {
        public abstract void onSuccess(DynamicRealm dynamicRealm);

        public void onError(Throwable th) {
            super.onError(th);
        }
    }
}
