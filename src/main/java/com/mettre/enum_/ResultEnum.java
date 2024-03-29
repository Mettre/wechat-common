package com.mettre.enum_;

public enum ResultEnum {

    UNKONW_ERROR("-1", "未知错误"),
    SUCCESS("0", "成功"),
    PRIMARY_SCHOOL("100", "我猜测,你可能还在上小学"),
    MIDDLE_SCHOOL("101", "你可能在上初中"),
    IMG_NOT_EMPTY("102", "图片不存在"),
    IMG_QINIUYUN_EMPTY("103", "上传失败，请检查七牛云配置"),
    IMG_FORMAT_ERROR("104", "图片格式不正确"),
    PASSWORD_MODIFICATION_FAILED("105", "修改密码失败"),
    GOODS_NOT("106", "商品不存在"),
    VERIFICATION_ERROR("107", "验证码输入错误"),
    VERIFICATION_EXPIRES("109", "验证码已过期，请重新获取"),



    OK("200", "成功"),
    SINGTIMEOUT("400", "超时"),
    UNREGISTER("E107", "该手机号未注册"),
    REGISTERED("E108", "该手机号已注册"),
    MODIFYUSERINFOERROR("E115", "个人修改信息失败"),
    REGISTERERROR("E116", "注册失败"),
    FORGET_PASSWORD("E118", "密码修改失败"),
    GENBDERERROY("E117", "性别不能为空"),


    VISTORERROY("E118", "访客记录插入失败"),
    VISTORDELETEERROY("E119", "访客记录删除失败"),
    VISTORSELECTERROY("E119", "访客记录插入失败"),


    SMSDELETEERROR("E120", "短信删除失败"),
    SMS_SEND_ERROR("E121", "短信发送失败"),


    CATEGORYCREATED("E110", "该分类已创建"),
    NEWSNULL("E111", "新闻不存在"),
    NEWSIDNOTEMPTY("E112", "新闻id为空"),
    COMMENTARYDELETING("E113", "该条评论已被删除，无法评论"),
    DELETE_ERROR("E114", "删除失败"),
    DYNAMICTYPE("E114", "资讯类型不能为空"),
    USEREMPTY("E115", "未查到用户"),


    IMG_INSERT_ERROR("106", "图片插入失败"),
    ACCOUNT_PASSWORD_ERROR("E109", "账号或者密码不正确"),
    FILE_EXCEED("105", "上传文件超过1M"),
    FEEDBACK_STATE("107", "操作失败"),
    INSERT_ERROR("108", "插入失败"),
    USERIDNOT("E111", "用户信息不存在"),
    CANCELFOLLOW("E112", "取消关注失败"),
    FOLLOWERROR("E113", "关注失败"),
    HAVEDFOLLOWED("E114", "已经是关注关系"),
    PERMISSION_DENIED("E401", "未登录");



    private String code;
    private String msg;


    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
