package com.zhibodata.gis.kfqpopulation.common;

/**
 * Created by hzllb on 2019/7/9.
 */
public enum EmBusinessError {

    //通用的错误类型10000开头
    NO_OBJECT_FOUND(10001,"请求对象不存在"),
    UNKNOWN_ERROR(10002,"未知错误"),
    NO_HANDLER_FOUND(10003,"找不到执行的路径操作"),
    BIND_EXCEPTION_ERROR(10004,"请求参数错误"),
    PARAMETER_VALIDATION_ERROR(10005,"请求参数校验失败"),
    NO_PARENT_PIN_ERROR(10006,"没有继承Pin父类"),
    NO_SUCH_ALGORITH_ERROR(10007,"NoSuchAlgorithmException"),
    NO_SUCH_PADDING_ERROR(10008,"NoSuchPaddingException"),
    INVALID_KEY_EXCEPTION(10009,"InvalidKeyException"),
    ILLEGAL_BLOCKSIZE_EXCEPTION(10010,"IllegalBlockSizeException"),
    BAD_PADDING_EXCEPTION(10011,"BadPaddingException"),
    //用户服务相关的错误类型20000开头
    REGISTER_DUP_FAIL(20001,"用户已存在"),
    //admin相关错误
    ADMIN_SHOULD_LOGIN(30001,"管理员需要先登录"),
    LOGIN_FAIL(20002,"手机号或密码错误"),
    USER_PASSWD_ERROR(20003,"用户名密码错误"),
    //品类相关错误
    PIN_ERROR(40001,"PIN码校验失败"),

    ;



    private Integer errCode;

    private String errMsg;

    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
