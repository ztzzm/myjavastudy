package my.java.system.controller;

import my.java.system.domain.Test;
import my.java.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    TestService testService;

    @RequestMapping("/test")
    public List<Test> test(){
        return testService.list();
    }
}
