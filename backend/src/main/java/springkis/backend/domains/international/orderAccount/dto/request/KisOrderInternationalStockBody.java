package springkis.backend.domains.international.orderAccount.dto.request;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;
import static lombok.AccessLevel.*;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;
import springkis.backend.domains.international.orderAccount.OrderStatus;
import springkis.backend.domains.international.orderAccount.dto.request.OrderInternationalStockRequest.Body;

@Data
@Builder(access = PRIVATE)
public class KisOrderInternationalStockBody {
	private String CANO;

	private String ACNT_PRDT_CD;

	private String OVRS_EXCG_CD;

	private String PDNO;

	private String ORD_QTY;

	private String OVRS_ORD_UNPR;

	@JsonInclude(value = NON_NULL)
	private String SLL_TYPE;

	private String ORD_SVR_DVSN_CD;

	private String ORD_DVSN;

	public static KisOrderInternationalStockBody from(Body body) {
		String SLL_TYPE = convertToSLL_TYPE(body.getSLL_TYPE());

		return KisOrderInternationalStockBody.builder()
			.CANO(body.getCANO())
			.ACNT_PRDT_CD(body.getACNT_PRDT_CD())
			.PDNO(body.getPDNO())
			.ORD_QTY(body.getORD_QTY())
			.OVRS_ORD_UNPR(body.getOVRS_ORD_UNPR())
			.SLL_TYPE(SLL_TYPE)
			.ORD_SVR_DVSN_CD("0")
			.ORD_DVSN(body.getORD_DVSN())
			.build();
	}

	private static String convertToSLL_TYPE(OrderStatus orderStatus) {
		if (orderStatus == OrderStatus.BUY) {
			return null;
		}
		return "00";
	}
}
