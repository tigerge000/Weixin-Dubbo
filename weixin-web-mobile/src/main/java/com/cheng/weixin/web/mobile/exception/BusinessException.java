package com.cheng.weixin.web.mobile.exception;


import com.cheng.weixin.web.mobile.exception.message.StatusCode;

/**
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:19:19
 */
@SuppressWarnings("serial")
public class BusinessException extends BaseException {
	public BusinessException() {
	}

	public BusinessException(Throwable ex) {
		super(ex);
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(StatusCode statusCode) {
		super(statusCode);
	}
	public BusinessException(StatusCode statusCode, String message) {
		super(statusCode, message);
	}

	public BusinessException(String message, Throwable ex) {
		super(message, ex);
	}

	protected StatusCode getStatusCode() {
		return super.statusCode != null ? super.statusCode : StatusCode.CONFLICT;
	}
}