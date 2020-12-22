package my.java.system.service;

import my.java.system.domain.Test;
import my.java.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
