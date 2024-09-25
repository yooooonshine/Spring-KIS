package springkis.backend.domains.domestic.orderAccount.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import springkis.backend.domains.domestic.orderAccount.StockOrderModificationCode;
import springkis.backend.domains.domestic.orderAccount.StockOrderDivision;

public class StockOrderModificationRequest {

  @NotBlank
  private String CANO; // 종합 계좌번호

  @NotBlank
  private String ACNT_PRDT_CD; // 계좌상품코드

  @NotBlank
  private String KRX_FWDG_ORD_ORGNO; // 주문시 한국투자증권 시스템에서 지정된 영업점코드

  @NotBlank
  private String ORGN_ODNO; // 원주문번호 , 주문시 한국투자증권 시스템에서 채번된 주문번호

  @NotBlank
  private StockOrderDivision ORD_DVSN; // 주문 구분

  @NotBlank
  private StockOrderModificationCode RVSE_CNCL_DVSN_CD; // 정정 or 취소 구분 코드, 정정:01 , 취소:02

  @NotBlank
  private String ORD_QTY; // 주문 수량

  @NotBlank
  private String ORD_UNPR; // 주문 단가

  @NotBlank
  private String QTY_ALL_ORD_YN; // 잔량 전부 주문 여부 , Y:잔량전부 , N:잔량일부

  private String ALGO_NO; // 미사용
}
/*
{
  "CANO": "810XXXXX",
  "ACNT_PRDT_CD": "01",
  "KRX_FWDG_ORD_ORGNO": "",
  "ORGN_ODNO": "0001566017",
  "ORD_DVSN": "00",
  "RVSE_CNCL_DVSN_CD": "01",
  "ORD_QTY": "1",
  "ORD_UNPR": "180000",
  "QTY_ALL_ORD_YN": "N"
}
* */
