package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyMRestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(MyMRestApiApplication.class, args);
		
		MymService bean=context.getBean(MymService.class);
		List<Ticket> allTickets=bean.getAllTickets();
		allTickets.forEach(System.out::println);
	}

}
