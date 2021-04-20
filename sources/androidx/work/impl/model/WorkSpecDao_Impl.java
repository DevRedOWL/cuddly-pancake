package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.StringUtil;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WorkSpecDao_Impl implements WorkSpecDao {
    /* access modifiers changed from: private */
    public final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfWorkSpec;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;

    /* renamed from: __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast */
    private final SharedSQLiteStatement f141xd91a9514;
    private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkSpec = new EntityInsertionAdapter<WorkSpec>(roomDatabase) {
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
                if (workSpec.f138id == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, workSpec.f138id);
                }
                supportSQLiteStatement.bindLong(2, (long) WorkTypeConverters.stateToInt(workSpec.state));
                if (workSpec.workerClassName == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, workSpec.workerClassName);
                }
                if (workSpec.inputMergerClassName == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
                }
                byte[] byteArray = Data.toByteArray(workSpec.input);
                if (byteArray == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindBlob(5, byteArray);
                }
                byte[] byteArray2 = Data.toByteArray(workSpec.output);
                if (byteArray2 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindBlob(6, byteArray2);
                }
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, (long) workSpec.runAttemptCount);
                supportSQLiteStatement.bindLong(11, (long) WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.periodStartTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    supportSQLiteStatement.bindLong(16, (long) WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    supportSQLiteStatement.bindLong(17, constraints.requiresCharging() ? 1 : 0);
                    supportSQLiteStatement.bindLong(18, constraints.requiresDeviceIdle() ? 1 : 0);
                    supportSQLiteStatement.bindLong(19, constraints.requiresBatteryNotLow() ? 1 : 0);
                    supportSQLiteStatement.bindLong(20, constraints.requiresStorageNotLow() ? 1 : 0);
                    supportSQLiteStatement.bindLong(21, constraints.getTriggerContentUpdateDelay());
                    supportSQLiteStatement.bindLong(22, constraints.getTriggerMaxContentDelay());
                    byte[] contentUriTriggersToByteArray = WorkTypeConverters.contentUriTriggersToByteArray(constraints.getContentUriTriggers());
                    if (contentUriTriggersToByteArray == null) {
                        supportSQLiteStatement.bindNull(23);
                    } else {
                        supportSQLiteStatement.bindBlob(23, contentUriTriggersToByteArray);
                    }
                } else {
                    supportSQLiteStatement.bindNull(16);
                    supportSQLiteStatement.bindNull(17);
                    supportSQLiteStatement.bindNull(18);
                    supportSQLiteStatement.bindNull(19);
                    supportSQLiteStatement.bindNull(20);
                    supportSQLiteStatement.bindNull(21);
                    supportSQLiteStatement.bindNull(22);
                    supportSQLiteStatement.bindNull(23);
                }
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetPeriodStartTime = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.f141xd91a9514 = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    public void insertWorkSpec(WorkSpec workSpec) {
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void delete(String str) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        this.__db.beginTransaction();
        if (str == null) {
            try {
                acquire.bindNull(1);
            } catch (Throwable th) {
                this.__db.endTransaction();
                this.__preparedStmtOfDelete.release(acquire);
                throw th;
            }
        } else {
            acquire.bindString(1, str);
        }
        acquire.executeUpdateDelete();
        this.__db.setTransactionSuccessful();
        this.__db.endTransaction();
        this.__preparedStmtOfDelete.release(acquire);
    }

    public void setOutput(String str, Data data) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetOutput.acquire();
        this.__db.beginTransaction();
        try {
            byte[] byteArray = Data.toByteArray(data);
            if (byteArray == null) {
                acquire.bindNull(1);
            } else {
                acquire.bindBlob(1, byteArray);
            }
            if (str == null) {
                acquire.bindNull(2);
            } else {
                acquire.bindString(2, str);
            }
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetOutput.release(acquire);
        }
    }

    public void setPeriodStartTime(String str, long j) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetPeriodStartTime.acquire();
        this.__db.beginTransaction();
        try {
            acquire.bindLong(1, j);
            if (str == null) {
                acquire.bindNull(2);
            } else {
                acquire.bindString(2, str);
            }
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetPeriodStartTime.release(acquire);
        }
    }

    public int incrementWorkSpecRunAttemptCount(String str) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        this.__db.beginTransaction();
        if (str == null) {
            try {
                acquire.bindNull(1);
            } catch (Throwable th) {
                this.__db.endTransaction();
                this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
                throw th;
            }
        } else {
            acquire.bindString(1, str);
        }
        int executeUpdateDelete = acquire.executeUpdateDelete();
        this.__db.setTransactionSuccessful();
        this.__db.endTransaction();
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
        return executeUpdateDelete;
    }

    public int resetWorkSpecRunAttemptCount(String str) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        this.__db.beginTransaction();
        if (str == null) {
            try {
                acquire.bindNull(1);
            } catch (Throwable th) {
                this.__db.endTransaction();
                this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
                throw th;
            }
        } else {
            acquire.bindString(1, str);
        }
        int executeUpdateDelete = acquire.executeUpdateDelete();
        this.__db.setTransactionSuccessful();
        this.__db.endTransaction();
        this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
        return executeUpdateDelete;
    }

    public int markWorkSpecScheduled(String str, long j) {
        SupportSQLiteStatement acquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        this.__db.beginTransaction();
        try {
            acquire.bindLong(1, j);
            if (str == null) {
                acquire.bindNull(2);
            } else {
                acquire.bindString(2, str);
            }
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfMarkWorkSpecScheduled.release(acquire);
        }
    }

    public int resetScheduledState() {
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetScheduledState.acquire();
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetScheduledState.release(acquire);
        }
    }

    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        SupportSQLiteStatement acquire = this.f141xd91a9514.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.f141xd91a9514.release(acquire);
        }
    }

    public WorkSpec getWorkSpec(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        String str2 = str;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str2);
        }
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                if (query.moveToFirst()) {
                    String string = query.getString(columnIndexOrThrow);
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i8 = columnIndexOrThrow7;
                    Constraints constraints = new Constraints();
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                    int i9 = query.getInt(columnIndexOrThrow17);
                    boolean z = false;
                    constraints.setRequiresCharging(i9 != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                    if (query.getInt(columnIndexOrThrow20) != 0) {
                        z = true;
                    }
                    constraints.setRequiresStorageNotLow(z);
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                    workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    workSpec.initialDelay = query.getLong(i8);
                    workSpec.intervalDuration = query.getLong(i7);
                    workSpec.flexDuration = query.getLong(i6);
                    workSpec.runAttemptCount = query.getInt(i5);
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i4));
                    workSpec.backoffDelayDuration = query.getLong(i3);
                    workSpec.periodStartTime = query.getLong(i2);
                    workSpec.minimumRetentionDuration = query.getLong(i);
                    workSpec.scheduleRequestedAt = query.getLong(columnIndexOrThrow15);
                    workSpec.constraints = constraints;
                } else {
                    workSpec = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public WorkSpec[] getWorkSpecs(List<String> list) {
        RoomSQLiteQuery roomSQLiteQuery;
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (String next : list) {
            if (next == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, next);
            }
            i++;
        }
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i7 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i8 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i9 = columnIndexOrThrow7;
                WorkSpec[] workSpecArr = new WorkSpec[query.getCount()];
                int i10 = 0;
                while (query.moveToNext()) {
                    WorkSpec[] workSpecArr2 = workSpecArr;
                    String string = query.getString(columnIndexOrThrow);
                    int i11 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i12 = columnIndexOrThrow3;
                    Constraints constraints = new Constraints();
                    int i13 = columnIndexOrThrow16;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                    int i14 = columnIndexOrThrow19;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    int i15 = columnIndexOrThrow18;
                    int i16 = i9;
                    workSpec.initialDelay = query.getLong(i16);
                    int i17 = i8;
                    int i18 = columnIndexOrThrow17;
                    workSpec.intervalDuration = query.getLong(i17);
                    int i19 = columnIndexOrThrow4;
                    int i20 = i7;
                    int i21 = columnIndexOrThrow5;
                    workSpec.flexDuration = query.getLong(i20);
                    int i22 = i6;
                    workSpec.runAttemptCount = query.getInt(i22);
                    int i23 = i5;
                    i9 = i16;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i23));
                    int i24 = i20;
                    int i25 = i4;
                    int i26 = i17;
                    workSpec.backoffDelayDuration = query.getLong(i25);
                    int i27 = i3;
                    int i28 = i19;
                    workSpec.periodStartTime = query.getLong(i27);
                    i6 = i22;
                    int i29 = i23;
                    int i30 = i2;
                    workSpec.minimumRetentionDuration = query.getLong(i30);
                    int i31 = i27;
                    i2 = i30;
                    int i32 = columnIndexOrThrow15;
                    workSpec.scheduleRequestedAt = query.getLong(i32);
                    workSpec.constraints = constraints;
                    workSpecArr2[i10] = workSpec;
                    i10++;
                    columnIndexOrThrow15 = i32;
                    columnIndexOrThrow18 = i15;
                    columnIndexOrThrow4 = i28;
                    workSpecArr = workSpecArr2;
                    columnIndexOrThrow3 = i12;
                    columnIndexOrThrow19 = i14;
                    columnIndexOrThrow16 = i13;
                    i3 = i31;
                    columnIndexOrThrow5 = i21;
                    i7 = i24;
                    i5 = i29;
                    columnIndexOrThrow17 = i18;
                    i8 = i26;
                    i4 = i25;
                    columnIndexOrThrow = i11;
                }
                WorkSpec[] workSpecArr3 = workSpecArr;
                query.close();
                roomSQLiteQuery.release();
                return workSpecArr3;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkSpec.IdAndState idAndState = new WorkSpec.IdAndState();
                idAndState.f139id = query.getString(columnIndexOrThrow);
                idAndState.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                arrayList.add(idAndState);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getAllWorkSpecIds() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        Cursor query = this.__db.query(acquire);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public WorkInfo.State getState(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            return query.moveToFirst() ? WorkTypeConverters.intToState(query.getInt(0)) : null;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        Cursor query;
        WorkSpec.WorkInfoPojo workInfoPojo;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            query = this.__db.query(acquire);
            ArrayMap arrayMap = new ArrayMap();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            if (query.moveToFirst()) {
                workInfoPojo = new WorkSpec.WorkInfoPojo();
                workInfoPojo.f140id = query.getString(columnIndexOrThrow);
                workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    ArrayList arrayList = (ArrayList) arrayMap.get(string);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        arrayMap.put(string, arrayList);
                    }
                    workInfoPojo.tags = arrayList;
                }
            } else {
                workInfoPojo = null;
            }
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return workInfoPojo;
        } catch (Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        Cursor query;
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (String next : list) {
            if (next == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, next);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            query = this.__db.query(acquire);
            ArrayMap arrayMap = new ArrayMap();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                workInfoPojo.f140id = query.getString(columnIndexOrThrow);
                workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    ArrayList arrayList2 = (ArrayList) arrayMap.get(string);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        arrayMap.put(string, arrayList2);
                    }
                    workInfoPojo.tags = arrayList2;
                }
                arrayList.add(workInfoPojo);
            }
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (String next : list) {
            if (next == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, next);
            }
            i++;
        }
        return new ComputableLiveData<List<WorkSpec.WorkInfoPojo>>() {
            private InvalidationTracker.Observer _observer;

            /* access modifiers changed from: protected */
            public List<WorkSpec.WorkInfoPojo> compute() {
                Cursor query;
                if (this._observer == null) {
                    this._observer = new InvalidationTracker.Observer("WorkTag", "workspec") {
                        public void onInvalidated(Set<String> set) {
                            C068610.this.invalidate();
                        }
                    };
                    WorkSpecDao_Impl.this.__db.getInvalidationTracker().addWeakObserver(this._observer);
                }
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = WorkSpecDao_Impl.this.__db.query(acquire);
                    ArrayMap arrayMap = new ArrayMap();
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.f140id = query.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                        if (!query.isNull(columnIndexOrThrow)) {
                            String string = query.getString(columnIndexOrThrow);
                            ArrayList arrayList2 = (ArrayList) arrayMap.get(string);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                arrayMap.put(string, arrayList2);
                            }
                            workInfoPojo.tags = arrayList2;
                        }
                        arrayList.add(workInfoPojo);
                    }
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        }.getLiveData();
    }

    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        Cursor query;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            query = this.__db.query(acquire);
            ArrayMap arrayMap = new ArrayMap();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                workInfoPojo.f140id = query.getString(columnIndexOrThrow);
                workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    ArrayList arrayList2 = (ArrayList) arrayMap.get(string);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        arrayMap.put(string, arrayList2);
                    }
                    workInfoPojo.tags = arrayList2;
                }
                arrayList.add(workInfoPojo);
            }
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return new ComputableLiveData<List<WorkSpec.WorkInfoPojo>>() {
            private InvalidationTracker.Observer _observer;

            /* access modifiers changed from: protected */
            public List<WorkSpec.WorkInfoPojo> compute() {
                Cursor query;
                if (this._observer == null) {
                    this._observer = new InvalidationTracker.Observer("WorkTag", "workspec", "worktag") {
                        public void onInvalidated(Set<String> set) {
                            C068811.this.invalidate();
                        }
                    };
                    WorkSpecDao_Impl.this.__db.getInvalidationTracker().addWeakObserver(this._observer);
                }
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = WorkSpecDao_Impl.this.__db.query(acquire);
                    ArrayMap arrayMap = new ArrayMap();
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.f140id = query.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                        if (!query.isNull(columnIndexOrThrow)) {
                            String string = query.getString(columnIndexOrThrow);
                            ArrayList arrayList2 = (ArrayList) arrayMap.get(string);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                arrayMap.put(string, arrayList2);
                            }
                            workInfoPojo.tags = arrayList2;
                        }
                        arrayList.add(workInfoPojo);
                    }
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        }.getLiveData();
    }

    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        Cursor query;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            query = this.__db.query(acquire);
            ArrayMap arrayMap = new ArrayMap();
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                workInfoPojo.f140id = query.getString(columnIndexOrThrow);
                workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                if (!query.isNull(columnIndexOrThrow)) {
                    String string = query.getString(columnIndexOrThrow);
                    ArrayList arrayList2 = (ArrayList) arrayMap.get(string);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        arrayMap.put(string, arrayList2);
                    }
                    workInfoPojo.tags = arrayList2;
                }
                arrayList.add(workInfoPojo);
            }
            __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return new ComputableLiveData<List<WorkSpec.WorkInfoPojo>>() {
            private InvalidationTracker.Observer _observer;

            /* access modifiers changed from: protected */
            public List<WorkSpec.WorkInfoPojo> compute() {
                Cursor query;
                if (this._observer == null) {
                    this._observer = new InvalidationTracker.Observer("WorkTag", "workspec", "workname") {
                        public void onInvalidated(Set<String> set) {
                            C069012.this.invalidate();
                        }
                    };
                    WorkSpecDao_Impl.this.__db.getInvalidationTracker().addWeakObserver(this._observer);
                }
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = WorkSpecDao_Impl.this.__db.query(acquire);
                    ArrayMap arrayMap = new ArrayMap();
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output");
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.f140id = query.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                        if (!query.isNull(columnIndexOrThrow)) {
                            String string = query.getString(columnIndexOrThrow);
                            ArrayList arrayList2 = (ArrayList) arrayMap.get(string);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                arrayMap.put(string, arrayList2);
                            }
                            workInfoPojo.tags = arrayList2;
                        }
                        arrayList.add(workInfoPojo);
                    }
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        }.getLiveData();
    }

    public List<Data> getInputsFromPrerequisites(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(Data.fromByteArray(query.getBlob(0)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getUnfinishedWorkWithTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getUnfinishedWorkWithName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        Cursor query = this.__db.query(acquire);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getAllUnfinishedWork() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        Cursor query = this.__db.query(acquire);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<WorkSpec> getEligibleWorkForScheduling(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, (long) i);
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i7 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i8 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i9 = columnIndexOrThrow7;
                int i10 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i11 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i12 = columnIndexOrThrow3;
                    Constraints constraints = new Constraints();
                    int i13 = columnIndexOrThrow16;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                    int i14 = columnIndexOrThrow18;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    int i15 = i10;
                    workSpec.output = Data.fromByteArray(query.getBlob(i15));
                    i10 = i15;
                    int i16 = columnIndexOrThrow17;
                    int i17 = i9;
                    workSpec.initialDelay = query.getLong(i17);
                    i9 = i17;
                    int i18 = i8;
                    workSpec.intervalDuration = query.getLong(i18);
                    i8 = i18;
                    int i19 = i7;
                    workSpec.flexDuration = query.getLong(i19);
                    int i20 = i6;
                    workSpec.runAttemptCount = query.getInt(i20);
                    int i21 = i5;
                    i6 = i20;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i21));
                    i7 = i19;
                    int i22 = i4;
                    int i23 = columnIndexOrThrow2;
                    workSpec.backoffDelayDuration = query.getLong(i22);
                    int i24 = i22;
                    i5 = i21;
                    int i25 = i3;
                    workSpec.periodStartTime = query.getLong(i25);
                    i3 = i25;
                    int i26 = i2;
                    workSpec.minimumRetentionDuration = query.getLong(i26);
                    int i27 = columnIndexOrThrow15;
                    i2 = i26;
                    int i28 = i24;
                    workSpec.scheduleRequestedAt = query.getLong(i27);
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow15 = i27;
                    columnIndexOrThrow17 = i16;
                    columnIndexOrThrow = i11;
                    columnIndexOrThrow3 = i12;
                    columnIndexOrThrow18 = i14;
                    columnIndexOrThrow16 = i13;
                    int i29 = i23;
                    i4 = i28;
                    columnIndexOrThrow2 = i29;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getScheduledWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i8 = columnIndexOrThrow7;
                int i9 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i10 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i11 = columnIndexOrThrow3;
                    Constraints constraints = new Constraints();
                    int i12 = columnIndexOrThrow16;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                    int i13 = columnIndexOrThrow18;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    int i14 = i9;
                    workSpec.output = Data.fromByteArray(query.getBlob(i14));
                    i9 = i14;
                    int i15 = columnIndexOrThrow17;
                    int i16 = i8;
                    workSpec.initialDelay = query.getLong(i16);
                    i8 = i16;
                    int i17 = i7;
                    workSpec.intervalDuration = query.getLong(i17);
                    i7 = i17;
                    int i18 = i6;
                    workSpec.flexDuration = query.getLong(i18);
                    int i19 = i5;
                    workSpec.runAttemptCount = query.getInt(i19);
                    int i20 = i4;
                    i5 = i19;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i20));
                    i6 = i18;
                    int i21 = i3;
                    int i22 = columnIndexOrThrow2;
                    workSpec.backoffDelayDuration = query.getLong(i21);
                    int i23 = i21;
                    i4 = i20;
                    int i24 = i2;
                    workSpec.periodStartTime = query.getLong(i24);
                    i2 = i24;
                    int i25 = i;
                    workSpec.minimumRetentionDuration = query.getLong(i25);
                    i = i25;
                    int i26 = i23;
                    int i27 = columnIndexOrThrow15;
                    workSpec.scheduleRequestedAt = query.getLong(i27);
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow15 = i27;
                    columnIndexOrThrow17 = i15;
                    columnIndexOrThrow = i10;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow18 = i13;
                    columnIndexOrThrow16 = i12;
                    int i28 = i22;
                    i3 = i26;
                    columnIndexOrThrow2 = i28;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getEnqueuedWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0", 0);
        Cursor query = this.__db.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = query.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = query.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = query.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = query.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = query.getColumnIndexOrThrow("minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = query.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = query.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                int columnIndexOrThrow17 = query.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = query.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = query.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = query.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = query.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                int columnIndexOrThrow22 = query.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                int columnIndexOrThrow23 = query.getColumnIndexOrThrow("content_uri_triggers");
                int i8 = columnIndexOrThrow7;
                int i9 = columnIndexOrThrow6;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i10 = columnIndexOrThrow;
                    String string2 = query.getString(columnIndexOrThrow3);
                    int i11 = columnIndexOrThrow3;
                    Constraints constraints = new Constraints();
                    int i12 = columnIndexOrThrow16;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                    constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                    constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                    constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                    constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                    int i13 = columnIndexOrThrow18;
                    constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                    constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                    workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    int i14 = i9;
                    workSpec.output = Data.fromByteArray(query.getBlob(i14));
                    i9 = i14;
                    int i15 = columnIndexOrThrow17;
                    int i16 = i8;
                    workSpec.initialDelay = query.getLong(i16);
                    i8 = i16;
                    int i17 = i7;
                    workSpec.intervalDuration = query.getLong(i17);
                    i7 = i17;
                    int i18 = i6;
                    workSpec.flexDuration = query.getLong(i18);
                    int i19 = i5;
                    workSpec.runAttemptCount = query.getInt(i19);
                    int i20 = i4;
                    i5 = i19;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i20));
                    i6 = i18;
                    int i21 = i3;
                    int i22 = columnIndexOrThrow2;
                    workSpec.backoffDelayDuration = query.getLong(i21);
                    int i23 = i21;
                    i4 = i20;
                    int i24 = i2;
                    workSpec.periodStartTime = query.getLong(i24);
                    i2 = i24;
                    int i25 = i;
                    workSpec.minimumRetentionDuration = query.getLong(i25);
                    i = i25;
                    int i26 = i23;
                    int i27 = columnIndexOrThrow15;
                    workSpec.scheduleRequestedAt = query.getLong(i27);
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    columnIndexOrThrow15 = i27;
                    columnIndexOrThrow17 = i15;
                    columnIndexOrThrow = i10;
                    columnIndexOrThrow3 = i11;
                    columnIndexOrThrow18 = i13;
                    columnIndexOrThrow16 = i12;
                    int i28 = i22;
                    i3 = i26;
                    columnIndexOrThrow2 = i28;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public int setState(WorkInfo.State state, String... strArr) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("UPDATE workspec SET state=");
        newStringBuilder.append("?");
        newStringBuilder.append(" WHERE id IN (");
        StringUtil.appendPlaceholders(newStringBuilder, strArr.length);
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(newStringBuilder.toString());
        compileStatement.bindLong(1, (long) WorkTypeConverters.stateToInt(state));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
        }
    }

    /* access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap<String, ArrayList<String>> arrayMap) {
        ArrayList arrayList;
        int i;
        Set<String> keySet = arrayMap.keySet();
        if (!keySet.isEmpty()) {
            if (arrayMap.size() > 999) {
                ArrayMap arrayMap2 = new ArrayMap((int) RoomDatabase.MAX_BIND_PARAMETER_CNT);
                int size = arrayMap.size();
                ArrayMap arrayMap3 = arrayMap2;
                int i2 = 0;
                loop0:
                while (true) {
                    i = 0;
                    while (i2 < size) {
                        arrayMap3.put(arrayMap.keyAt(i2), arrayMap.valueAt(i2));
                        i2++;
                        i++;
                        if (i == 999) {
                            __fetchRelationshipWorkTagAsjavaLangString(arrayMap3);
                            arrayMap3 = new ArrayMap((int) RoomDatabase.MAX_BIND_PARAMETER_CNT);
                        }
                    }
                    break loop0;
                }
                if (i > 0) {
                    __fetchRelationshipWorkTagAsjavaLangString(arrayMap3);
                    return;
                }
                return;
            }
            StringBuilder newStringBuilder = StringUtil.newStringBuilder();
            newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            StringUtil.appendPlaceholders(newStringBuilder, size2);
            newStringBuilder.append(")");
            RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2 + 0);
            int i3 = 1;
            for (String next : keySet) {
                if (next == null) {
                    acquire.bindNull(i3);
                } else {
                    acquire.bindString(i3, next);
                }
                i3++;
            }
            Cursor query = this.__db.query(acquire);
            try {
                int columnIndex = query.getColumnIndex("work_spec_id");
                if (columnIndex != -1) {
                    while (query.moveToNext()) {
                        if (!query.isNull(columnIndex) && (arrayList = arrayMap.get(query.getString(columnIndex))) != null) {
                            arrayList.add(query.getString(0));
                        }
                    }
                    query.close();
                }
            } finally {
                query.close();
            }
        }
    }
}
