/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import java.time.LocalDateTime;

import org.eclipse.openvsx.jooq.tables.AzureDownloadCountProcessedItem;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AzureDownloadCountProcessedItemRecord extends UpdatableRecordImpl<AzureDownloadCountProcessedItemRecord> implements Record5<Long, String, LocalDateTime, Integer, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.azure_download_count_processed_item.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.azure_download_count_processed_item.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.azure_download_count_processed_item.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.azure_download_count_processed_item.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.azure_download_count_processed_item.processed_on</code>.
     */
    public void setProcessedOn(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.azure_download_count_processed_item.processed_on</code>.
     */
    public LocalDateTime getProcessedOn() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.azure_download_count_processed_item.execution_time</code>.
     */
    public void setExecutionTime(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.azure_download_count_processed_item.execution_time</code>.
     */
    public Integer getExecutionTime() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.azure_download_count_processed_item.success</code>.
     */
    public void setSuccess(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.azure_download_count_processed_item.success</code>.
     */
    public Boolean getSuccess() {
        return (Boolean) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, LocalDateTime, Integer, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, LocalDateTime, Integer, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AzureDownloadCountProcessedItem.AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM.ID;
    }

    @Override
    public Field<String> field2() {
        return AzureDownloadCountProcessedItem.AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM.NAME;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return AzureDownloadCountProcessedItem.AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM.PROCESSED_ON;
    }

    @Override
    public Field<Integer> field4() {
        return AzureDownloadCountProcessedItem.AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM.EXECUTION_TIME;
    }

    @Override
    public Field<Boolean> field5() {
        return AzureDownloadCountProcessedItem.AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM.SUCCESS;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public LocalDateTime component3() {
        return getProcessedOn();
    }

    @Override
    public Integer component4() {
        return getExecutionTime();
    }

    @Override
    public Boolean component5() {
        return getSuccess();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public LocalDateTime value3() {
        return getProcessedOn();
    }

    @Override
    public Integer value4() {
        return getExecutionTime();
    }

    @Override
    public Boolean value5() {
        return getSuccess();
    }

    @Override
    public AzureDownloadCountProcessedItemRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AzureDownloadCountProcessedItemRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AzureDownloadCountProcessedItemRecord value3(LocalDateTime value) {
        setProcessedOn(value);
        return this;
    }

    @Override
    public AzureDownloadCountProcessedItemRecord value4(Integer value) {
        setExecutionTime(value);
        return this;
    }

    @Override
    public AzureDownloadCountProcessedItemRecord value5(Boolean value) {
        setSuccess(value);
        return this;
    }

    @Override
    public AzureDownloadCountProcessedItemRecord values(Long value1, String value2, LocalDateTime value3, Integer value4, Boolean value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AzureDownloadCountProcessedItemRecord
     */
    public AzureDownloadCountProcessedItemRecord() {
        super(AzureDownloadCountProcessedItem.AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM);
    }

    /**
     * Create a detached, initialised AzureDownloadCountProcessedItemRecord
     */
    public AzureDownloadCountProcessedItemRecord(Long id, String name, LocalDateTime processedOn, Integer executionTime, Boolean success) {
        super(AzureDownloadCountProcessedItem.AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM);

        setId(id);
        setName(name);
        setProcessedOn(processedOn);
        setExecutionTime(executionTime);
        setSuccess(success);
    }
}