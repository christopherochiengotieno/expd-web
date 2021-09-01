package com.otienochris.expdweb.utils.converters;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.Timestamp;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class creationDateConverterTest {



    @Test
    void convertToDatabaseColumn() {
//        given
        CreationDateConverter converter = new CreationDateConverter();
        long time = System.currentTimeMillis();

//        when
        Timestamp timestamp = new Timestamp(time);
        Date date = converter.convertToDatabaseColumn(timestamp);

//        then
        assertThat(date.getTime()).isEqualTo(time);
    }

    @Test
    void convertToEntityAttribute() {

//        given
        CreationDateConverter converter = new CreationDateConverter();
        long time = System.currentTimeMillis();

//        when
        Date date = new Date(time);
        Timestamp timestamp = converter.convertToEntityAttribute(date);

//        then
        assertThat(timestamp.getTime()).isEqualTo(new Date(time).getTime());
    }
}