package springkis.backend.domains.international.orderAccount;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import springkis.backend.domains.international.orderAccount.dto.request.OrderInternationalStockRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order-account")
public class OrderAccountController {

	private final OrderAccountService orderAccountService;

	@PostMapping("/order-international-stock")
	public ResponseEntity<Object> orderInternationalStock(@RequestBody @Valid OrderInternationalStockRequest request) {
		Object response = orderAccountService.orderInternationalStock(request);

		return ResponseEntity.ok(response);
	}
}
