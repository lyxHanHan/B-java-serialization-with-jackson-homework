package com.thoughtworks.capability.gtb.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.capability.gtb.vo.EventType;
import com.thoughtworks.capability.gtb.vo.EventVo;
import com.thoughtworks.capability.gtb.vo.UserVo;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EventController {

  @GetMapping("/events/{id}")
  public EventVo getEventById(@PathVariable("id") String id) {
    UserVo user = new UserVo("3", "张三");
    return new EventVo(id, "下载文件", EventType.DOWNLOAD, new Date(), user);
//    EventVo event = new EventVo("1","下载内容","U","",user);
//    ObjectMapper objectMapper = new ObjectMapper();
//    String jsonOfEvent = objectMapper.writeValueAsString(event);
//    System.out.println(jsonOfEvent);
  }

  @PostMapping("/events")
  public void createEvent(@RequestBody EventVo event) {
    log.info("create event: {}", event);
  }


}
