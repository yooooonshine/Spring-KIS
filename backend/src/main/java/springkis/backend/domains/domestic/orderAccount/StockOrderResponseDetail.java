package springkis.backend.domains.domestic.orderAccount;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StockOrderResponseDetail {

  @NotBlank
//  @JsonProperty("-KRX_FWDG_ORD_ORGNO")
  private String KRX_FWDG_ORD_ORGNO; // 주문시 한국투자증권 시스템에서 지정된 영업점코드

  @NotBlank
//  @JsonProperty("-ODNO")
  private String ODNO; // 주문번호 ,주문시 한국투자증권 시스템에서 채번된 주문번호

  @NotBlank
//  @JsonProperty("-ORD_TMD")
  private String ORD_TMD; // 주문 시각 , HHMMSS
}

/*
  "output": {
    "KRX_FWDG_ORD_ORGNO": "06010",
    "ODNO": "0001569138",
    "ORD_TMD": "131421"
  }
* */
