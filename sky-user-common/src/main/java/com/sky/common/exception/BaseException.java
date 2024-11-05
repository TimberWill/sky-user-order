package com.sky.common.exception;

import lombok.Getter;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-11-05 13:02
 **/
@Getter
public class BaseException extends RuntimeException{

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }
}
