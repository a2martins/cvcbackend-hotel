package br.com.cvc.corp.hotel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.cvc.corp.hotel.model.Hotel;

@Service
public class BrokerService {

	@Autowired
	private RestTemplate restTemplate;

	public List<Hotel> hotelsAvails(Integer codeCity) {
		String url = "https://cvcbackendhotel.herokuapp.com/hotels/avail/" + codeCity.toString();
		ResponseEntity<ArrayList<Hotel>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<ArrayList<Hotel>>() {
				});

		return responseEntity.getBody();

	}

	public Hotel hotelDetails(Integer idHotel) {
		String url = "https://cvcbackendhotel.herokuapp.com/hotels/" + idHotel.toString();
		ResponseEntity<ArrayList<Hotel>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<ArrayList<Hotel>>() {
				});

		return responseEntity.getBody().get(0);
	}
}
