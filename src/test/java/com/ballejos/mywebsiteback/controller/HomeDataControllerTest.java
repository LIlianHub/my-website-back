package com.ballejos.mywebsiteback.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HomeDataControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetHomeData() throws Exception {

        mockMvc.perform(get("/getHomeData"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(not(0))));

    }


}

