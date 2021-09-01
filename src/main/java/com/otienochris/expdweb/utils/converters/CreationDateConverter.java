package com.otienochris.expdweb.utils.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.sql.Timestamp;

@Converter
public class CreationDateConverter implements AttributeConverter<Timestamp, Date> {
    @Override
    public Date convertToDatabaseColumn(Timestamp timestamp) {
        return new Date(timestamp.getTime());
    }

    @Override
    public Timestamp convertToEntityAttribute(Date date) {
        return new Timestamp(date.getTime());
    }
}
