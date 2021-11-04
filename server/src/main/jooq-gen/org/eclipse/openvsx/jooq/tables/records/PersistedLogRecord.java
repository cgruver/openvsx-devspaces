/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import java.time.LocalDateTime;

import org.eclipse.openvsx.jooq.tables.PersistedLog;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersistedLogRecord extends UpdatableRecordImpl<PersistedLogRecord> implements Record4<Long, LocalDateTime, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.persisted_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.persisted_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.persisted_log.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.persisted_log.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.persisted_log.user_data</code>.
     */
    public void setUserData(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.persisted_log.user_data</code>.
     */
    public Long getUserData() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.persisted_log.message</code>.
     */
    public void setMessage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.persisted_log.message</code>.
     */
    public String getMessage() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, LocalDateTime, Long, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, LocalDateTime, Long, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PersistedLog.PERSISTED_LOG.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return PersistedLog.PERSISTED_LOG.TIMESTAMP;
    }

    @Override
    public Field<Long> field3() {
        return PersistedLog.PERSISTED_LOG.USER_DATA;
    }

    @Override
    public Field<String> field4() {
        return PersistedLog.PERSISTED_LOG.MESSAGE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getTimestamp();
    }

    @Override
    public Long component3() {
        return getUserData();
    }

    @Override
    public String component4() {
        return getMessage();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getTimestamp();
    }

    @Override
    public Long value3() {
        return getUserData();
    }

    @Override
    public String value4() {
        return getMessage();
    }

    @Override
    public PersistedLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PersistedLogRecord value2(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public PersistedLogRecord value3(Long value) {
        setUserData(value);
        return this;
    }

    @Override
    public PersistedLogRecord value4(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public PersistedLogRecord values(Long value1, LocalDateTime value2, Long value3, String value4) {
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
     * Create a detached PersistedLogRecord
     */
    public PersistedLogRecord() {
        super(PersistedLog.PERSISTED_LOG);
    }

    /**
     * Create a detached, initialised PersistedLogRecord
     */
    public PersistedLogRecord(Long id, LocalDateTime timestamp, Long userData, String message) {
        super(PersistedLog.PERSISTED_LOG);

        setId(id);
        setTimestamp(timestamp);
        setUserData(userData);
        setMessage(message);
    }
}
