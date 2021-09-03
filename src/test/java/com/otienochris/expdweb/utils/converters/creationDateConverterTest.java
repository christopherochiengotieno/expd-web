package com.otienochris.expdweb.utils.converters;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.Timestamp;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class creationDateConverterTest {

    private CreationDateConverter converter = new CreationDateConverter();
    private final long time  = System.currentTimeMillis();

    @Test
    void convertToDatabaseColumn() {
//        given
        Date actualDate = new Date(time);
        Timestamp timestamp = new Timestamp(time);

//        when
        Date convertedDate = converter.convertToDatabaseColumn(timestamp);

//        then
        assertThat(convertedDate.getTime()).isEqualTo(actualDate.getTime());
    }

    @Test
    void convertToEntityAttribute() {

//        given
        Timestamp actualTimestamp = new Timestamp(time);
        Date date = new Date(time);

//        when
        Timestamp convertedTimestamp = converter.convertToEntityAttribute(date);

//        then
        assertThat(convertedTimestamp.getTime()).isEqualTo(actualTimestamp.getTime());
    }
}