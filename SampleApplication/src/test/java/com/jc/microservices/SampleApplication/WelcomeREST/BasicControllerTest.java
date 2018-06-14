package com.jc.microservices.SampleApplication.WelcomeREST;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(BasicController.class)
public class BasicControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void welcome() throws Exception
	{
		MockHttpServletRequestBuilder req= MockMvcRequestBuilders.get("/welcome")
				.accept(MediaType.APPLICATION_JSON);

		mvc.perform(req)
		.andExpect(status().isOk())
		.andExpect(content().string(equalTo("Hello JC!!")));	
	}
	

}
