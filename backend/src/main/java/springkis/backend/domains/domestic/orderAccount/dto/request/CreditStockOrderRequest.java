package springkis.backend.domains.domestic.orderAccount.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springkis.backend.domains.domestic.orderAccount.StockOrderDivision;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreditStockOrderRequest {
  @NotBlank
  private String CANO; //종합 계좌번호

  @NotBlank
  private String ACNT_PRDT_CD; // 계좌 상품 코드

  @NotBlank
  private String PDNO; // 상품 번호

  @NotBlank
  private String CRDT_TYPE; // 신용 유형

  @NotBlank
  private String LOAN_DT; // 대출 일자, yyyyMMdd

  @NotBlank
  private StockOrderDivision ORD_DVSN; // 주문 구분

  @NotBlank
  private String ORD_QTY; // 주문 수량

  @NotBlank
  private String ORD_UNPR; // 주문 단가

  private String RSVN_ORD_YN; // 예약 주문 여부

  private String ALGO_NO; // 알고리즘 번호, 미사용

}
/*
{
    "CANO": "810XXXXX",
    "ACNT_PRDT_CD": "01",
    "PDNO": "009150",
    "CRDT_TYPE": "21",
    "LOAN_DT": "20211103",
    "ORD_DVSN": "00",
    "ORD_QTY": "1",
    "ORD_UNPR": "130000",
    "RSVN_ORD_YN": "N"
}
* */