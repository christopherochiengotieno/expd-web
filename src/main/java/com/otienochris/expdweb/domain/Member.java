package com.otienochris.expdweb.domain;

import com.otienochris.expdweb.utils.converters.CreationDateConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author otien christopherochiengotieno@gmail.com
 * @version 1.0
 * @since 01/09/2021
 */

@Data
@Builder
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "members")
public class Member {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String description;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Technology> technologies;
    private String interests;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Project> projects;
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
}
