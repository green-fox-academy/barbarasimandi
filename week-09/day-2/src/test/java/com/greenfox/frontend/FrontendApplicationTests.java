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



	//Doubling
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



	//Greeting
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



	//AppendA
	@Test
	public void testAppendA() throws Exception {
		mock.perform(get("/appenda/kuty"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.appended", is("kutya")));
	}


	//DoUntil
	@Test
	public void testDoUntilFactor() throws Exception {
		mock.perform(post("/dountil/factor")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"until\": \"4\"}"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.result", is(24)))
				.andExpect(jsonPath("$.what", is("factor")));
	}

	@Test
	public void testDoUntilSum() throws Exception {
		mock.perform(post("/dountil/sum")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"until\": \"4\"}"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.result", is(10)))
				.andExpect(jsonPath("$.what", is("sum")));
	}

	@Test
	public void testDoUntilNoInputError() throws Exception {
		mock.perform(post("/dountil/sum")
				.contentType(MediaType.APPLICATION_JSON)
				.content(""))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide a number!")));
	}

}
