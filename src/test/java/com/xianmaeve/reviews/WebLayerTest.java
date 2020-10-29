package com.xianmaeve.reviews;

import com.xianmaeve.reviews.repositories.ReviewRepository;
import com.xianmaeve.reviews.repositories.TypeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTest {

    @MockBean
    private TypeRepository typeRepo;

    @MockBean
    private ReviewRepository reviewRepository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void typesShould200andReturnTypeViewWithModelAttribute() throws Exception {
        mockMvc.perform(get("/types"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("typesTemplate"))
                .andExpect(model().attributeExists("types"));

    }

    @Test
    public void ReviewShould200andReturnReviewViewWithModelAttribute() throws Exception {
        mockMvc.perform(get("/reviews"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("reviewsTemplate"))
                .andExpect(model().attributeExists("reviews"));

    }
}
