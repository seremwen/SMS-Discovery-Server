package zw.nseremwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsDiscoveryServerApplication.class, args);
	}

}
