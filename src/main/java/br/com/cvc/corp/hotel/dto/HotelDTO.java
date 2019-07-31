package br.com.cvc.corp.hotel.dto;

import java.io.Serializable;
import java.util.List;

public class HotelDTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3538548116778588811L;
	private Integer id;
	private String cityName;
	private List<RoomsDTO> rooms;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<RoomsDTO> getRooms() {
		return rooms;
	}

	public void setRooms(List<RoomsDTO> rooms) {
		this.rooms = rooms;
	}

}
