package io.jpress;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Title: JPress 常量
 * @Package io.jpress
 */
public class JPressConstants {

    /**
     * 后台系统菜单的 ID
     */
    public static final String SYSTEM_MENU_USER = "user";
    public static final String SYSTEM_MENU_ATTACHMENT = "attachment";
    public static final String SYSTEM_MENU_TEMPLATE = "template";
    public static final String SYSTEM_MENU_SYSTEM = "system";
    //    public static final String SYSTEM_MENU_APPEARANCE = "appearance";
//    public static final String SYSTEM_MENU_STATISTICS = "statistics";
    public static final String SYSTEM_MENU_FINANCE = "finance";
    public static final String SYSTEM_MENU_WECHAT_PUBULIC_ACCOUNT = "wechat_pubulic_account";
    public static final String SYSTEM_MENU_WECHAT_MINI_PROGRAM = "wechat_mini_program";


    /**
     * 以下是配置相关
     */
    public static final String OPTION_WEB_NAME = "web_name"; //网站名称
    public static final String OPTION_WEB_FAKE_STATIC_ENABLE = "web_fake_static_enable"; //是否启用伪静态
    public static final String OPTION_WEB_FAKE_STATIC_SUFFIX = "web_fake_static_suffix"; //网站伪静态后缀

    public static final String OPTION_CDN_ENABLE = "cdn_enable"; //是否启用CDN
    public static final String OPTION_CDN_DOMAIN = "cdn_domain"; //CDN域名

    public static final String OPTION_API_ENABLE = "api_enable"; //是否启用API
    public static final String OPTION_API_SECRET = "api_secret"; //API密钥

    public static final String OPTION_WECHAT_APPID = "wechat_appid"; //微信的APP Id
    public static final String OPTION_WECHAT_APPSECRET = "wechat_appsecret"; //微信的 APP Secret
    public static final String OPTION_WECHAT_TOKEN = "wechat_token"; //微信的 token

    public static final String OPTION_WECHAT_MINIPROGRAM_APPID = "wechat_miniprogram_appid"; //微信小程序的 token
    public static final String OPTION_WECHAT_MINIPROGRAM_APPSECRET = "wechat_miniprogram_appsecret"; //微信小程序的 token
    public static final String OPTION_WECHAT_MINIPROGRAM_TOKEN = "wechat_miniprogram_token"; //微信小程序的 token


    /**
     * 用到的cookie name 常量
     */
    public static final String COOKIE_UID = "_jpuid";

    /**
     * 用到的request attribute常量
     */
    public static final String ATTR_LOGINED_USER = "USER";

    /**
     * 用到的事件机制相关常量
     */
    public static final String EVENT_OPTION_UPDATE = "event_option_update";
}
