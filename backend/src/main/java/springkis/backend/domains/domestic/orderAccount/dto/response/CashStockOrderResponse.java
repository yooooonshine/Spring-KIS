package springkis.backend.domains.domestic.orderAccount.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springkis.backend.domains.domestic.orderAccount.StockOrderResponseDetail;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CashStockOrderResponse {

  @NotBlank
  private String rt_cd; //성공 실패 여부 / 성공 : 0 , 실패 : 0이외의 값

  @NotBlank
  private String msg_cd; // 응답 코드

  @NotBlank
  private String msg; // 응답 메시지

  @NotBlank
  private StockOrderResponseDetail output; // 응답 상세

}
/*
{
  "rt_cd": "0",
  "msg_cd": "APBK0013",
  "msg1": "주문 전송 완료 되었습니다.",
  "output": {
    "KRX_FWDG_ORD_ORGNO": "06010",
    "ODNO": "0001569157",
    "ORD_TMD": "155211"
  }
}
* */
