package in.ashokit;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MymService {
	public Ticket bookTicket(Passenger p) {
		String apiUrl = "http://43.205.144.253:8080/ticket";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> forEntity = rt.postForEntity(apiUrl, p, Ticket.class);
		Ticket body = forEntity.getBody();
		return body;
	}

	public List<Ticket> getAllTickets() {
		String apiUrl = "http://43.205.144.253:8080/tickets";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl, Ticket[].class);
		Ticket[] body = forEntity.getBody();
		List<Ticket> tickets = Arrays.asList(body);
		return tickets;

	}
}
