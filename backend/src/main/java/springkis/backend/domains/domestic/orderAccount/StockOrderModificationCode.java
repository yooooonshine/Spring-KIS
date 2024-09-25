package springkis.backend.domains.domestic.orderAccount;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum StockOrderModificationCode {
  MODIFICATION("01", "정정"), CANCEL("02", "취소");

  private final String code;
  private final String description;

  StockOrderModificationCode(String code, String description) {
    this.code = code;
    this.description = description;
  }

  @JsonValue
  public String getCode() {
    return code;
  }
}
