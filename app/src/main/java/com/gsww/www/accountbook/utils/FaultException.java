package com.gsww.www.accountbook.utils;


/**
 * 错误代码编号
 * 1 message为NULL
 * 2 网络出错
 */
public class FaultException extends RuntimeException {
    public FaultException(String message){
        super(message);

    }
}
