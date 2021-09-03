package com.otienochris.expdweb.utils.converters;

import com.otienochris.expdweb.domain.Link;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LinkConverterTest {

    LinkConverter converter = new LinkConverter();

    @Test
    void convertToDatabaseColumn() {
//        given
        Link newLink = Link.builder()
                .link("https://www.github.com/otienochris")
                .site("Git Hub")
                .build();
//        when
        String s = converter.convertToDatabaseColumn(newLink);
//        then
        assertThat(s).isEqualTo("https://www.github.com/otienochris, Git Hub");
    }

    @Test
    void convertToEntityAttribute() {
//        given
        String linkInString =  "https://www.github.com/otienochris, Git Hub";
//        when
        Link link = converter.convertToEntityAttribute(linkInString);

//        then
        Link createdLink = Link.builder()
                .link("https://www.github.com/otienochris")
                .site("Git Hub")
                .build();

        assertThat(link).isEqualTo(createdLink);
    }
}