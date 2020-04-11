/**
 * 
 */
package io.jc.spring.boot.learning.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Dell
 *
 */
@Controller
@RequestMapping("/main")
public class MainController {
	
	@ResponseBody
	@RequestMapping("/")
	public String greeting() {
		return  "Main controller:hello from greeting method";
	}

}
