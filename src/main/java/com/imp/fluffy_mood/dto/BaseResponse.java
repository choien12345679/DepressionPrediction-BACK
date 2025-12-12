package com.imp.fluffy_mood.dto;

public class BaseResponse<T> {
    private boolean result;
    private int status;
    private T data;
    private String message;

    public BaseResponse() {}

    public BaseResponse(boolean result, int status, T data, String message) {
        this.result = result;
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(true, 200, data, "success");
    }

    public static <T> BaseResponse<T> fail(int status, String message) {
        return new BaseResponse<>(false, status, null, message);
    }

    public boolean isResult() { return result; }
    public int getStatus() { return status; }
    public T getData() { return data; }
    public String getMessage() { return message; }
}