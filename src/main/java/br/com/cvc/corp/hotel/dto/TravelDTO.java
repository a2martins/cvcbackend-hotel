package br.com.cvc.corp.hotel.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class TravelDTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4795645207265183645L;
	private Integer codeCity;
	private LocalDate checkin;
	private LocalDate checkout;
	private Integer adults;
	private Integer childrens;

	public Integer getCodeCity() {
		return codeCity;
	}

	public void setCodeCity(Integer codeCity) {
		this.codeCity = codeCity;
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

	public Integer getChildrens() {
		return childrens;
	}

	public void setChildrens(Integer childrens) {
		this.childrens = childrens;
	}

}
