package springkis.backend.domains.international.orderAccount;

import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import springkis.backend.common.webClient.WebClientUtil;
import springkis.backend.domains.international.orderAccount.dto.request.KisOrderInternationalStockBody;
import springkis.backend.domains.international.orderAccount.dto.request.OrderInternationalStockRequest;

@Service
@RequiredArgsConstructor
public class OrderAccountService {

	private final WebClientUtil webClientUtil;

	public Object orderInternationalStock(OrderInternationalStockRequest request) {
		final String url = "/uapi/overseas-stock/v1/trading/order";

		Map<String, String> headers = request.getHeader().toMap();

		KisOrderInternationalStockBody body = KisOrderInternationalStockBody.from(request.getBody());

		return webClientUtil.postFromKis(headers,url, body, Object.class);
	}
}
