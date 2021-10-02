package org.dex.app.service;

import org.dex.app.dto.SampleDto;
import org.dex.app.model.Sample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleService {

    public SampleDto findSampleById(int id);
    public List<SampleDto> findAllSAmple();
    public SampleDto createSample(SampleDto sampleDto);
    public Sample updateSample();
    public String deleteSample(int id);

}
