package com.otienochris.expdweb.domain;

import com.otienochris.expdweb.utils.converters.CreationDateConverter;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name = "links")
public class Link {
    @Id
    private Long id;
    private String site;
    private String description;
    private String link;

    @Convert(converter = CreationDateConverter.class)
    @CreationTimestamp
    private Timestamp creationDate;

    @Convert(converter = CreationDateConverter.class)
    @UpdateTimestamp
    private Timestamp modificationDate;
    @Version
    private Integer version;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Link link = (Link) o;

        return Objects.equals(id, link.id);
    }

    @Override
    public int hashCode() {
        return 1900957211;
    }
}

