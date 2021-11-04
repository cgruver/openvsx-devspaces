/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import java.time.LocalDateTime;

import org.eclipse.openvsx.jooq.tables.Shedlock;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShedlockRecord extends UpdatableRecordImpl<ShedlockRecord> implements Record4<String, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.shedlock.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.shedlock.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.shedlock.lock_until</code>.
     */
    public void setLockUntil(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.shedlock.lock_until</code>.
     */
    public LocalDateTime getLockUntil() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.shedlock.locked_at</code>.
     */
    public void setLockedAt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.shedlock.locked_at</code>.
     */
    public LocalDateTime getLockedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.shedlock.locked_by</code>.
     */
    public void setLockedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.shedlock.locked_by</code>.
     */
    public String getLockedBy() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Shedlock.SHEDLOCK.NAME;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return Shedlock.SHEDLOCK.LOCK_UNTIL;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Shedlock.SHEDLOCK.LOCKED_AT;
    }

    @Override
    public Field<String> field4() {
        return Shedlock.SHEDLOCK.LOCKED_BY;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public LocalDateTime component2() {
        return getLockUntil();
    }

    @Override
    public LocalDateTime component3() {
        return getLockedAt();
    }

    @Override
    public String component4() {
        return getLockedBy();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public LocalDateTime value2() {
        return getLockUntil();
    }

    @Override
    public LocalDateTime value3() {
        return getLockedAt();
    }

    @Override
    public String value4() {
        return getLockedBy();
    }

    @Override
    public ShedlockRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public ShedlockRecord value2(LocalDateTime value) {
        setLockUntil(value);
        return this;
    }

    @Override
    public ShedlockRecord value3(LocalDateTime value) {
        setLockedAt(value);
        return this;
    }

    @Override
    public ShedlockRecord value4(String value) {
        setLockedBy(value);
        return this;
    }

    @Override
    public ShedlockRecord values(String value1, LocalDateTime value2, LocalDateTime value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShedlockRecord
     */
    public ShedlockRecord() {
        super(Shedlock.SHEDLOCK);
    }

    /**
     * Create a detached, initialised ShedlockRecord
     */
    public ShedlockRecord(String name, LocalDateTime lockUntil, LocalDateTime lockedAt, String lockedBy) {
        super(Shedlock.SHEDLOCK);

        setName(name);
        setLockUntil(lockUntil);
        setLockedAt(lockedAt);
        setLockedBy(lockedBy);
    }
}
