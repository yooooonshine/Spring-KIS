package springkis.backend.domains.domestic.orderAccount;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum TradeId {
  TTTC0802U("TTTC0802U", "실전투자 - 주식 현금 매수 주문"),
  TTTC0801U("TTTC0801U", "실전투자 - 주식 현금 매도 주문"),
  VTTC0802U("VTTC0802U", "모의투자 - 주식 현금 매수 주문"),
  VTTC0801U("VTTC0801U", "모의투자 - 주식 현금 매도 주문");

  private final String code;
  private final String description;

  TradeId(String code, String description) {
    this.code = code;
    this.description = description;
  }

  @JsonValue
  public String getCode() {
    return code;
  }
}
