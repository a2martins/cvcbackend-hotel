package br.com.cvc.corp.hotel.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class RoomsDTO implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 424504788909873526L;
	private Integer roomId;
	private String categoryName;
	private BigDecimal totalPrice;
	private PriceDetailDTO priceDetail;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public PriceDetailDTO getPriceDetail() {
		return priceDetail;
	}

	public void setPriceDetail(PriceDetailDTO priceDetail) {
		this.priceDetail = priceDetail;
	}

}
