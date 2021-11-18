package org.dex.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.dex.app.dto.SampleDto;
import org.dex.app.model.Sample;
import org.dex.app.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Slf4j
@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/test")
    public String test()
    {
        return "hello";
    }

    @PostMapping("/sample")
    public SampleDto createSample(@RequestBody SampleDto sampleDto)
    {
        log.info(sampleDto.toString());

        return sampleService.createSample(sampleDto);


    }

    @GetMapping("/samples")
    public List<SampleDto> findAllSamples()
    {
        return sampleService.findAllSAmple();
    }

    @GetMapping("/samples/{id}")

    public SampleDto getById(@PathVariable int id){
        return sampleService.findSampleById(id);
    }

    @DeleteMapping("/sample/{id}")
    public String deleteSample(@PathVariable int id)
    {
        return sampleService.deleteSample(id);

    }


}
