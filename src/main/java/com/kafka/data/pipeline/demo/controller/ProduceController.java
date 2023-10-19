package com.kafka.data.pipeline.demo.controller;

import com.kafka.data.pipeline.demo.model.RequestObject;
import com.kafka.data.pipeline.demo.service.ProduceService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/produce/v1")
public class ProduceController {

    private final ProduceService produceService;

    public ProduceController(ProduceService produceService) {
        this.produceService=produceService;
    }

    @PostMapping(path= "/event", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void postEvent(@RequestBody RequestObject requestObject){
        produceService.produceEvent(requestObject);
    }
}
