package springkis.backend.common.exception;

import org.springframework.http.HttpStatus;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class KisException extends RuntimeException{

	private final HttpStatus httpStatus;
	private final Object data;

	public static KisException from(HttpStatus httpStatus, Object data) {
		return new KisException(httpStatus, data);
	}
}