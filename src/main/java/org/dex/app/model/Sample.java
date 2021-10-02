package org.dex.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Sample")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sample {
    @Id
    @GeneratedValue
    private int id ;
    private String name;
    private String age;
    private String gender;
    private String desg;
    private String projectName;

}

