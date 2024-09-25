package springkis.backend.domains.domestic.orderAccount.dto.response;

import jakarta.validation.constraints.NotBlank;
import springkis.backend.domains.domestic.orderAccount.StockOrderResponseDetail;

public class StockOrderModificationResponse {

  @NotBlank
  private String rt_cd; // 0:성공 , 0 이외의 값 : 실패

  @NotBlank
  private String msg_cd; // 응답 코드

  @NotBlank
  private String msg1; // 응답 메시지

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
    "ODNO": "0001569139",
    "ORD_TMD": "131438"
  }
}
* */