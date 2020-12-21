package com.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@ConfigurationProperties("worker.actions")
public class WorkerProperties {
   private String start;
   private String finish;
   private String work;
}
