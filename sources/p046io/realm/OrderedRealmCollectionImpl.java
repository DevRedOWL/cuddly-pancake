package p046io.realm;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import javax.annotation.Nullable;
import p046io.realm.internal.InvalidRow;
import p046io.realm.internal.OsResults;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Table;
import p046io.realm.internal.UncheckedRow;
import p046io.realm.internal.core.QueryDescriptor;
import p046io.realm.internal.fields.FieldDescriptor;

/* renamed from: io.realm.OrderedRealmCollectionImpl */
abstract class OrderedRealmCollectionImpl<E> extends AbstractList<E> implements OrderedRealmCollection<E> {
    private static final String NOT_SUPPORTED_MESSAGE = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.";
    @Nullable
    final String className;
    @Nullable
    final Class<E> classSpec;
    final boolean forValues;
    final OsResults osResults;
    final BaseRealm realm;

    public boolean isManaged() {
        return true;
    }

    OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults2, Class<E> cls) {
        this(baseRealm, osResults2, cls, (String) null);
    }

    OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults2, String str) {
        this(baseRealm, osResults2, (Class) null, str);
    }

    private OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults2, @Nullable Class<E> cls, @Nullable String str) {
        this.forValues = false;
        this.realm = baseRealm;
        this.osResults = osResults2;
        this.classSpec = cls;
        this.className = str;
    }

    /* access modifiers changed from: package-private */
    public Table getTable() {
        return this.osResults.getTable();
    }

    /* access modifiers changed from: package-private */
    public OsResults getOsResults() {
        return this.osResults;
    }

    public boolean isValid() {
        return this.osResults.isValid();
    }

    public boolean contains(@Nullable Object obj) {
        if (!isLoaded() || ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm() == InvalidRow.INSTANCE)) {
            return false;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            if (it.next().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public E get(int i) {
        this.realm.checkIfValid();
        return this.realm.get(this.classSpec, this.className, this.osResults.getUncheckedRow(i));
    }

    @Nullable
    public E first() {
        return firstImpl(true, (Object) null);
    }

    @Nullable
    public E first(@Nullable E e) {
        return firstImpl(false, e);
    }

    @Nullable
    private E firstImpl(boolean z, @Nullable E e) {
        UncheckedRow firstUncheckedRow = this.osResults.firstUncheckedRow();
        if (firstUncheckedRow != null) {
            return this.realm.get(this.classSpec, this.className, firstUncheckedRow);
        }
        if (!z) {
            return e;
        }
        throw new IndexOutOfBoundsException("No results were found.");
    }

    @Nullable
    public E last() {
        return lastImpl(true, (Object) null);
    }

    @Nullable
    public E last(@Nullable E e) {
        return lastImpl(false, e);
    }

    @Nullable
    private E lastImpl(boolean z, @Nullable E e) {
        UncheckedRow lastUncheckedRow = this.osResults.lastUncheckedRow();
        if (lastUncheckedRow != null) {
            return this.realm.get(this.classSpec, this.className, lastUncheckedRow);
        }
        if (!z) {
            return e;
        }
        throw new IndexOutOfBoundsException("No results were found.");
    }

    public void deleteFromRealm(int i) {
        this.realm.checkIfValidAndInTransaction();
        this.osResults.delete((long) i);
    }

    public boolean deleteAllFromRealm() {
        this.realm.checkIfValid();
        if (size() <= 0) {
            return false;
        }
        this.osResults.clear();
        return true;
    }

    public Iterator<E> iterator() {
        return new RealmCollectionIterator();
    }

    public ListIterator<E> listIterator() {
        return new RealmCollectionListIterator(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new RealmCollectionListIterator(i);
    }

    private long getColumnIndexForSort(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-empty field name required.");
        } else if (!str.contains(".")) {
            long columnIndex = this.osResults.getTable().getColumnIndex(str);
            if (columnIndex >= 0) {
                return columnIndex;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Field '%s' does not exist.", new Object[]{str}));
        } else {
            throw new IllegalArgumentException("Aggregates on child object fields are not supported: " + str);
        }
    }

    public RealmResults<E> sort(String str) {
        return createLoadedResults(this.osResults.sort(QueryDescriptor.getInstanceForSort((FieldDescriptor.SchemaProxy) getSchemaConnector(), this.osResults.getTable(), str, Sort.ASCENDING)));
    }

    public RealmResults<E> sort(String str, Sort sort) {
        return createLoadedResults(this.osResults.sort(QueryDescriptor.getInstanceForSort((FieldDescriptor.SchemaProxy) getSchemaConnector(), this.osResults.getTable(), str, sort)));
    }

    public RealmResults<E> sort(String[] strArr, Sort[] sortArr) {
        return createLoadedResults(this.osResults.sort(QueryDescriptor.getInstanceForSort((FieldDescriptor.SchemaProxy) getSchemaConnector(), this.osResults.getTable(), strArr, sortArr)));
    }

    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }

    public int size() {
        if (!isLoaded()) {
            return 0;
        }
        long size = this.osResults.size();
        if (size > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) size;
    }

    public Number min(String str) {
        this.realm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.MINIMUM, getColumnIndexForSort(str));
    }

    public Date minDate(String str) {
        this.realm.checkIfValid();
        return this.osResults.aggregateDate(OsResults.Aggregate.MINIMUM, getColumnIndexForSort(str));
    }

    public Number max(String str) {
        this.realm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.MAXIMUM, getColumnIndexForSort(str));
    }

    @Nullable
    public Date maxDate(String str) {
        this.realm.checkIfValid();
        return this.osResults.aggregateDate(OsResults.Aggregate.MAXIMUM, getColumnIndexForSort(str));
    }

    public Number sum(String str) {
        this.realm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.SUM, getColumnIndexForSort(str));
    }

    public double average(String str) {
        this.realm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.AVERAGE, getColumnIndexForSort(str)).doubleValue();
    }

    @Deprecated
    public E remove(int i) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Deprecated
    public E set(int i, E e) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    public boolean deleteLastFromRealm() {
        this.realm.checkIfValidAndInTransaction();
        return this.osResults.deleteLast();
    }

    public boolean deleteFirstFromRealm() {
        this.realm.checkIfValidAndInTransaction();
        return this.osResults.deleteFirst();
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Deprecated
    public boolean add(E e) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Deprecated
    public void add(int i, E e) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Deprecated
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    /* renamed from: io.realm.OrderedRealmCollectionImpl$RealmCollectionIterator */
    private class RealmCollectionIterator extends OsResults.Iterator<E> {
        RealmCollectionIterator() {
            super(OrderedRealmCollectionImpl.this.osResults);
        }

        /* access modifiers changed from: protected */
        public E convertRowToObject(UncheckedRow uncheckedRow) {
            return OrderedRealmCollectionImpl.this.realm.get(OrderedRealmCollectionImpl.this.classSpec, OrderedRealmCollectionImpl.this.className, uncheckedRow);
        }
    }

    public OrderedRealmCollectionSnapshot<E> createSnapshot() {
        String str = this.className;
        if (str != null) {
            return new OrderedRealmCollectionSnapshot<>(this.realm, this.osResults, str);
        }
        return new OrderedRealmCollectionSnapshot<>(this.realm, this.osResults, this.classSpec);
    }

    public Realm getRealm() {
        this.realm.checkIfValid();
        BaseRealm baseRealm = this.realm;
        if (baseRealm instanceof Realm) {
            return (Realm) baseRealm;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }

    /* renamed from: io.realm.OrderedRealmCollectionImpl$RealmCollectionListIterator */
    private class RealmCollectionListIterator extends OsResults.ListIterator<E> {
        RealmCollectionListIterator(int i) {
            super(OrderedRealmCollectionImpl.this.osResults, i);
        }

        /* access modifiers changed from: protected */
        public E convertRowToObject(UncheckedRow uncheckedRow) {
            return OrderedRealmCollectionImpl.this.realm.get(OrderedRealmCollectionImpl.this.classSpec, OrderedRealmCollectionImpl.this.className, uncheckedRow);
        }
    }

    /* access modifiers changed from: package-private */
    public RealmResults<E> createLoadedResults(OsResults osResults2) {
        RealmResults<E> realmResults;
        String str = this.className;
        if (str != null) {
            realmResults = new RealmResults<>(this.realm, osResults2, str);
        } else {
            realmResults = new RealmResults<>(this.realm, osResults2, this.classSpec);
        }
        realmResults.load();
        return realmResults;
    }

    private SchemaConnector getSchemaConnector() {
        return new SchemaConnector(this.realm.getSchema());
    }
}
