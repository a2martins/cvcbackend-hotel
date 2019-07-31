package br.com.cvc.corp.hotel.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class PriceDetailDTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -359276875739564766L;
	private BigDecimal pricePerDayAdult;
	private BigDecimal pricePerDayChild;

	public BigDecimal getPricePerDayAdult() {
		return pricePerDayAdult;
	}

	public void setPricePerDayAdult(BigDecimal pricePerDayAdult) {
		this.pricePerDayAdult = pricePerDayAdult;
	}

	public BigDecimal getPricePerDayChild() {
		return pricePerDayChild;
	}

	public void setPricePerDayChild(BigDecimal pricePerDayChild) {
		this.pricePerDayChild = pricePerDayChild;
	}

}
