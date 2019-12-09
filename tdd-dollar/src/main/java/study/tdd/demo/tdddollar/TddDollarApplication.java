package study.tdd.demo.tdddollar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddDollarApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TddDollarApplication.class);
		//웹 서버 없이 기동
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
