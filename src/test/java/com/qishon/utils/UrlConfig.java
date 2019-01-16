package com.qishon.utils;

import io.restassured.http.Headers;
//import lombok.Data;
//
//@Data
public class UrlConfig {

    //获取Token
    public static String getToken_url;

    //店铺登陆
    public static String gs_sys_shopLogin_url;

    //修改密码
    public static String gs_sys_amdpwd_url;

    //获取运营分类
    public static String mat_mdl_getNavClassList_url;

    //获取门店的导购员信息
    public static String gs_sys_getPersoninFobyJob_url;

    //设备注册
    public static String gs_sys_regDeviceInf_url;

    //获取商品墙商品列表
    public static String gs_prod_list_url;

    //获取商品基本信息
    public static String gs_prod_getProdInfo_url;

    //根据款式版型获取默认定制详情
    public static String gs_prod_getProdOrdDetail_url;

    //获取商品配件信息
    public static String gs_match_getFitProdInfoNew_url;

    //定制渲染接口
    public static String gs_match_get3DModelInfoNew_url;

    //获取商品配件渲染信息
    public static String gs_match_getFitProdRenderNew_url;

    //获取定制商品可替换部位
    public static String gs_prod_getRegionByType_url;

    //获取可替换部件和面料
    public static String gs_prod_getReplacePart_url;

    //搜索可替换面料
    public static String gs_mas_filterProdFabRicattr_url;

    //获取商品销量，评价，标签
    public static String gs_prod_detail_url;

    //获取印花可定制部位
    public static String gs_prod_getProdRegionByPrint_url;

    //获取印花列表
    public static String gs_prod_getPrintByRegion_url;

    //获取绣字可定制部位列表
    public static String gs_mas_getEMBCustomList_url;

    //保存定制方案
    public static String gs_cus_saveCustom_url;

    //获取定制方案列表接口
    public static String gs_cus_getCustomList_url;

    //获取的Token
    public static String access_token;
}
