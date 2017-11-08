package com.greenfox.frontend;


import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrontendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class FrontendApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(),
			Charset.forName("utf8"));

	@Autowired
	WebApplicationContext webApplicationContext;

	private MockMvc mock;

	@Before
	public void setUp() throws Exception {
		mock = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testDoubling() throws Exception {
		mock.perform(get("/doubling?input=4"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.received", is(4)))
				.andExpect(jsonPath("$.result", is(8)));
	}

	@Test
	public void testDoublingError() throws Exception {
		mock.perform(get("/doubling"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide an input!")));
	}

	@Test
	public void testGreeter() throws Exception {
		mock.perform(get("/greeter/?name=Barbi&title=genious"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.name", is("Barbi")))
				.andExpect(jsonPath("$.title", is("genious")))
				.andExpect(jsonPath("$.welcome_message", is("Oh, hi there Barbi, my dear genious!")));
	}

	@Test
	public void testGreeterNameMissingError() throws Exception {
		mock.perform(get("/greeter"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide a name!")));
	}

	@Test
	public void testGreeterTitleMissingError() throws Exception {
		mock.perform(get("/greeter?name=Barbi"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide a title!")));
	}

}
