package springkis.backend.common.dto;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import springkis.backend.common.exception.ErrorCode;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse extends BaseResponse {
	private final String message;
	private final List<String> reasons;
	private final Object data;

	private ErrorResponse(Boolean isSuccess, HttpStatus status, String message, List<String> reasons, Object data) {
		super(isSuccess, status);
		this.message = message;
		this.reasons = reasons;
		this.data = data;
	}

	public static ErrorResponse of(ErrorCode errorCode, List<String> reasons) {
		Boolean isSuccess = false;
		HttpStatus status = errorCode.getHttpStatus();
		String message = errorCode.getMessage();

		return new ErrorResponse(isSuccess, status, message, reasons, null);
	}

	public static ErrorResponse from(ErrorCode errorCode) {
		Boolean isSuccess = false;
		HttpStatus status = errorCode.getHttpStatus();
		String message = errorCode.getMessage();

		return new ErrorResponse(isSuccess, status, message, null, null);
	}

	public static ErrorResponse of(HttpStatus httpStatus, String message) {
		Boolean isSuccess = false;
		return new ErrorResponse(isSuccess, httpStatus, message, null, null);
	}

	public static ErrorResponse of(HttpStatus httpStatus, Object data) {
		Boolean isSuccess = false;
		return new ErrorResponse(isSuccess, httpStatus, null, null, data);
	}
}