package com.otienochris.expdweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
}
