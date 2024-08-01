package com.spring.zkui;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.spring.zkui.controller.ZookeeperController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ZookeeperController.class)
public class ZookeeperControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void pingTest() throws Exception {
        mvc.perform(get("/api/zkui/ping"))
                .andExpect(status().isOk())
                .andExpect(content().string("pong"));
    }

}
