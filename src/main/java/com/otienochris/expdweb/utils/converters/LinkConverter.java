package com.otienochris.expdweb.utils.converters;

import com.otienochris.expdweb.domain.Link;
import lombok.SneakyThrows;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 03/09/2021
 */
@Converter
public class LinkConverter implements AttributeConverter<Link, String> {

    private StringBuilder stringBuilder = new StringBuilder();
    private final String SEPARATOR = ", ";

    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Link attribute) {

        if (!attribute.getLink().isEmpty() && !attribute.getLink().isBlank()){
            stringBuilder.append(attribute.getLink());
        } else throw new Exception("Link cannot have null entry");

        stringBuilder.append(SEPARATOR);

        if (attribute.getSite() == null || attribute.getSite().isBlank() || attribute.getSite().isEmpty()){
            stringBuilder.append("");
        }else stringBuilder.append(attribute.getSite());

        return stringBuilder.toString();
    }

    @Override
    public Link convertToEntityAttribute(String dbData) {
        String [] data = dbData.split(SEPARATOR);
        return Link.builder().link(data[0]).site(data[1]).build();
    }
}
