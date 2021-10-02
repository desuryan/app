package org.dex.app.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.dex.app.dto.SampleDto;
import org.dex.app.model.Sample;
import org.dex.app.repo.SampleRepository;
import org.dex.app.service.SampleService;
import org.dex.app.util.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    SampleRepository sampleRepository;

    @Override
    public SampleDto findSampleById(int id) {
        Sample sample = null;
        Optional<Sample> sampleOpt = sampleRepository.findById(id);
        if (sampleOpt.isPresent())
        {
            sample = sampleOpt.get();
        }
        assert sample != null;
        return SampleMapper.toSampleDto(sample);

    }

    @Override
    public List<SampleDto> findAllSAmple() {

       List<Sample> sampleList =  sampleRepository.findAll();

       return sampleList.stream().map(SampleMapper::toSampleDto).collect(Collectors.toList());


    }

    @Override
    public SampleDto createSample(SampleDto sampleDto) {
        Sample sample =  Sample.builder()
                .age(sampleDto.getAge())
                .name(sampleDto.getName())
                .gender(sampleDto.getGender())
                .desg(sampleDto.getDesg())
                .projectName(sampleDto.getProjectName())
                .build();

        sampleRepository.save(sample);
        return sampleDto;
    }

    @Override
    public Sample updateSample() {
        return null;
    }

    @Override
    public String deleteSample(int id) {

        sampleRepository.deleteById(id);
        return "sample deleted";
    }
}
