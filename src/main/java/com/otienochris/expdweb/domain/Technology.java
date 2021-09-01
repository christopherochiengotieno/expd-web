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
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "technologies")
@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private String description;

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
        Technology that = (Technology) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1718937050;
    }
}