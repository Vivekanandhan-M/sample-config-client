package viperan.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConfigClientController {
    @Value("${spring.application.name}")
	//@Value("Test")
	private String appName;
	
	@GetMapping
	public String getAppName() {
		return appName;
	}
}
