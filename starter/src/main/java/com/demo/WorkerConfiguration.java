package com.demo;

import com.demo.lib.Ravshan;
import com.demo.lib.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


@EnableConfigurationProperties(WorkerProperties.class)
public class WorkerConfiguration {
    @Autowired
    private WorkerProperties workerProperties;

    @Bean
    Worker getWorker(){
        return new Ravshan(workerProperties.getWork(), workerProperties.getStart(), workerProperties.getFinish());
    }
}
