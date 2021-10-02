package org.dex.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleDto {

    private int id ;
    private String name;
    private String age;
    private String gender;
    private String desg;
    private String projectName;

}
