package com.otienochris.expdweb.domain;

import com.otienochris.expdweb.enums.ProgrammingLanguage;
import com.otienochris.expdweb.utils.converters.CreationDateConverter;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
@Getter
@Setter
@ToString
@Builder
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "projects")
public class Project {

    @Id
    private Long id;
    private String sourceLink;
    private ProgrammingLanguage language;
    private String framework;
    private String Description;

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
        Project project = (Project) o;
        return Objects.equals(id, project.id);
    }

    @Override
    public int hashCode() {
        return 1545761250;
    }
}
