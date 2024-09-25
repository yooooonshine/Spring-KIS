package springkis.backend.domains.domestic.orderAccount.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springkis.backend.domains.domestic.orderAccount.StockOrderDivision;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CashStockOrderRequest {

  @NotBlank
  private String CANO; //종합 계좌번호

  @NotBlank
  private String ACNT_PRDT_CD; // 계좌 상품 코드

  @NotBlank
  private String PDNO; // 종목 코드(6자리)

  @NotBlank
  @JsonProperty("ORD_DVSN")
  private StockOrderDivision ORD_DVSN; // 주문구분

  @NotBlank
  private String ORD_QTY; // 주문 수량

  private String ALGO_NO; // 알고리즘번호, 미사용
}
/*
{
  "CANO": "810XXXXX",
  "ACNT_PRDT_CD": "01",
  "PDNO": "009150",
  "ORD_DVSN": "00",
  "ORD_QTY": "3",
  "ORD_UNPR": "150000"
}
* */