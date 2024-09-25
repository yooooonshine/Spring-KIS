package springkis.backend.domains.domestic.orderAccount;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum StockOrderDivision {
  Limit("00", "지정가"), Market("01", "시장가"),
  ConditionalLimit("02", "조건부지정가"), BestLimit("03", "최유리지정가"),
  TopPriorityLimit("04", "최우선지정가"), PreMarket("05", "장전 시간외"),
  AfterMarket("06", "장후 시간외"), OffHoursSinglePrice("07", "시간외 단일가"),
  TreasuryStock("08", "자기주식"), TreasuryStockSOption("09", "자기주식S-Option"),
  TreasuryStockMonetaryTrust("10", "자기주식금전신탁"),
  ImmediateLimitWithCancellation("11", "IOC지정가 (즉시체켤,잔량취소)"),
  FillOrKillLimit("12", "FOK지정가 (즉시체결,전량취소)"), ImmediateOrCancelMarket("13", "IOC시장가 (즉시체결,잔량취소)"),
  FillOrKillMarket("14", "FOK시장가 (즉시체결,전량취소)"), ImmediateOrCancelBest("15", " IOC최유리 (즉시체결,잔량취소)"),
  FillOrKillBest("16", "FOK최유리 (즉시체결,전량취소)");

  private final String code;
  private final String description;

  StockOrderDivision(String code, String description) {
    this.code = code;
    this.description = description;
  }

  @JsonValue
  public String getCode() {
    return code;
  }

}
