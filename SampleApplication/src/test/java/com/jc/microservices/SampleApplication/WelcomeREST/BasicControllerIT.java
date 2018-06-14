package com.jc.microservices.SampleApplication.WelcomeREST;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.jc.microservices.SampleApplication.SampleApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class BasicControllerIT {

	private static String local_host = "http://localhost:";

	@LocalServerPort
	private int port;

	private TestRestTemplate template = new TestRestTemplate();

	@Test
	public void welcome() throws Exception {
		ResponseEntity<String> response = template.getForEntity(createURL("/welcome"), String.class);
		assertThat(response.getBody(), equalTo("Hello JC!"));

	}

	@Test
	public void welcomeObj() throws Exception {
		ResponseEntity<String> response = template.getForEntity(createURL("/welcomeBean"), String.class);
		assertThat(response.getBody(), containsString("Hello from Bean"));

	}

	private String createURL(String uri) {
		// TODO Auto-generated method stub
		return local_host + port + uri;
	}

}
