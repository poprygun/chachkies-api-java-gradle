package io.microsamples.openapi.chachkies.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class ChachkiesApiImplTest {

    private ChachkiesApiImpl chachkiesApi;
    private MockMvc mockMvc;

    @BeforeEach
    void setUp(){
        chachkiesApi = new ChachkiesApiImpl();
        mockMvc = MockMvcBuilders.standaloneSetup(chachkiesApi).build();
    }

    @Test
    void whenNothingToReturnThen204() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/chachkies"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.NO_CONTENT.value()));
    }

}