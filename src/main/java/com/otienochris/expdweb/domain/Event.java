package com.otienochris.expdweb.domain;

import com.otienochris.expdweb.utils.converters.CreationDateConverter;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "events")

public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String title;
    private Date date;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Link> links;

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
        Event event = (Event) o;

        return Objects.equals(id, event.id);
    }

    @Override
    public int hashCode() {
        return 1491041522;
    }
}
