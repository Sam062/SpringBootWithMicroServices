package base.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import base.request.PassengerInfo;
import base.response.TicketInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("This is Air india Rest Controller")
public class AirIndiaRestController {


	@PostMapping(value = "/bookTicket",
			consumes = {"application/json","application/xml"},
			produces = {"application/json","application/xml"}
			)
	@ApiOperation("This Resource is used to Book Flight Ticket")
	public ResponseEntity<TicketInfo> getTicket(@RequestBody PassengerInfo pinfo){
		TicketInfo ticketInfo = new TicketInfo();

		ticketInfo.setName(pinfo.getFname()+" "+pinfo.getLname());
		ticketInfo.setFrom(pinfo.getFrom());
		ticketInfo.setTo(pinfo.getTo());
		ticketInfo.setJourneyDate(pinfo.getJourneyDate());
		ticketInfo.setFlightId(pinfo.getFlightId());
		ticketInfo.setTicketStatus("CONFIRMED");
		ticketInfo.setTicketPrice("4500.00 INR");

		return new ResponseEntity<TicketInfo>(ticketInfo,HttpStatus.CREATED);
	}
}
