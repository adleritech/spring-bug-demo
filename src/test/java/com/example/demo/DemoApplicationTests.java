package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private DemoRepository demoRepository;

    @Test
    public void repositoryShouldWork() {

        demoRepository.save(new Item());

        List<Item> all = demoRepository.findAll();
        assertThat(all.get(0).getCreatedAt()).isNotNull();
    }

}
