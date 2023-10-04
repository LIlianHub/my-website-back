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
public class ProjectControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetProject() throws Exception {

        mockMvc.perform(get("/getProject"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(not(0))));

    }

    @Test
    public void testGetProjectValidId() throws Exception {

        mockMvc.perform(get("/getProject/projetQlearning"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(4)));

    }

    @Test
    public void testGetProjectInvalidId() throws Exception {

        mockMvc.perform(get("/getProject/invalidId"))
                .andExpect(status().isNotFound());

    }


}


