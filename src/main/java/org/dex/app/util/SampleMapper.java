package org.dex.app.util;

import org.dex.app.dto.SampleDto;
import org.dex.app.model.Sample;

public class SampleMapper {

    private SampleMapper(){

    }
    public static SampleDto toSampleDto(Sample sample)
    {
        return SampleDto.builder()
                .id(sample.getId())
                .age(sample.getAge())
                .name(sample.getName())
                .desg(sample.getDesg())
                .gender(sample.getGender())
                .projectName(sample.getProjectName())
                .build();

    }

    public static Sample toSample(SampleDto sampleDto)
    {

        return Sample.builder()
                .id(sampleDto.getId())
                .age(sampleDto.getAge())
                .name(sampleDto.getName())
                .desg(sampleDto.getDesg())
                .gender(sampleDto.getGender())
                .projectName(sampleDto.getProjectName())
                .build();
    }
}
