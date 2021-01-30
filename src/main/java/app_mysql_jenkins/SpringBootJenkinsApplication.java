package app_mysql_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	
		int x = 10;
		System.out.println("The result is " + x / 0);
	
	}

}
