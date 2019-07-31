package br.com.cvc.corp.hotel.model;

import java.math.BigDecimal;

public class Price {

	private BigDecimal adult;
	private BigDecimal child;

	public BigDecimal getAdult() {
		return adult;
	}

	public void setAdult(BigDecimal adult) {
		this.adult = adult;
	}

	public BigDecimal getChild() {
		return child;
	}

	public void setChild(BigDecimal child) {
		this.child = child;
	}

}
