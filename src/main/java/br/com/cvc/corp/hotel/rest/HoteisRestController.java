package br.com.cvc.corp.hotel.rest;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.corp.hotel.dto.HotelDTO;
import br.com.cvc.corp.hotel.model.Hotel;
import br.com.cvc.corp.hotel.model.Travel;
import br.com.cvc.corp.hotel.service.BrokerService;
import br.com.cvc.corp.hotel.service.PriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@CrossOrigin("*")
@RestController
@Api
@RequestMapping(value = "/api/hotel", produces = "application/json")
public class HoteisRestController {

	@Autowired
	private PriceService priceService;
	
	@Autowired
	private BrokerService brokerService;
	
	@ApiOperation(value = "Return total price hotels")
	@GetMapping(value = "/calculate/avail/{codeCity}")
	public List<HotelDTO> calculateAvails(@PathVariable("codeCity") @Valid Integer codeCity,
			@ApiParam(required = true, example = "20/07/2019") @RequestParam @Valid LocalDate checkin,
			@ApiParam(required = true, example = "25/07/2019") @RequestParam @Valid LocalDate checkout,
			@RequestParam @Valid Integer adults, @RequestParam @Valid Integer childs) {
		
		List<Hotel> hotelsAvails = brokerService.hotelsAvails(codeCity);
		priceService = new PriceService(new Travel(checkin, checkout, adults, childs, hotelsAvails));
		List<HotelDTO> hotels = priceService.calculateAvails();
		
		return hotels;
	}
	
	@ApiOperation(value = "Return total price hotel")
	@GetMapping(value = "/calculate/{hotelId}")
	public HotelDTO calculate(@PathVariable("hotelId") @Valid Integer hotelId) {
		
		Hotel hotel = brokerService.hotelDetails(hotelId);
		HotelDTO hotelDTO = priceService.calculateDetails(hotel);
		
		return hotelDTO;
	} 
}
