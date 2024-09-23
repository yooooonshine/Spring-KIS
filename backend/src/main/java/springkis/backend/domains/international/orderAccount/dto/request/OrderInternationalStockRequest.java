package springkis.backend.domains.international.orderAccount.dto.request;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;
import static lombok.AccessLevel.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import springkis.backend.common.dto.Header;
import springkis.backend.domains.international.orderAccount.OrderStatus;
import springkis.backend.domains.international.orderAccount.OverseasExchangeCode;

@Data
@NoArgsConstructor(access = PRIVATE)
public class OrderInternationalStockRequest {

	private Header header;
	private Body body;

	@Data
	@NoArgsConstructor(access = PRIVATE)
	@JsonInclude(NON_NULL)
	public static class Body {
		@JsonProperty("CANO")
		private String CANO;

		@JsonProperty("ACNT_PRDT_CD")
		private String ACNT_PRDT_CD;

		@JsonProperty("OVRS_EXCG_CD")
		private OverseasExchangeCode OVRS_EXCG_CD;

		@JsonProperty("PDNO")
		private String PDNO;

		@JsonProperty("ORD_QTY")
		private String ORD_QTY;

		@JsonProperty("OVRS_ORD_UNPR")
		private String OVRS_ORD_UNPR;

		@JsonProperty("SLL_TYPE")
		private OrderStatus SLL_TYPE;

		@JsonProperty("ORD_DVSN")
		private String ORD_DVSN;
	}
}
