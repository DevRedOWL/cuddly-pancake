package p046io.realm;

/* renamed from: io.realm.ObjectChangeSet */
public interface ObjectChangeSet {
    String[] getChangedFields();

    boolean isDeleted();

    boolean isFieldChanged(String str);
}
