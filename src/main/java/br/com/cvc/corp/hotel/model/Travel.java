package br.com.cvc.corp.hotel.model;

import java.time.LocalDate;
import java.util.List;

public class Travel {

	private LocalDate checkin;
	private LocalDate checkout;
	private Integer adults;
	private Integer childs;
	private List<Hotel> hotels;

	public Travel() {}
	
	public Travel(LocalDate pCheckin, LocalDate pCheckout, Integer pAdults, Integer pChilds, List<Hotel> pHotels) {
		checkin = pCheckin;
		checkout = pCheckout;
		adults = pAdults;
		childs = pChilds;
		hotels = pHotels;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

	public Integer getAdults() {
		return adults;
	}

	public void setAdults(Integer adults) {
		this.adults = adults;
	}

	public Integer getChilds() {
		return childs;
	}

	public void setChilds(Integer childs) {
		this.childs = childs;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	

}
