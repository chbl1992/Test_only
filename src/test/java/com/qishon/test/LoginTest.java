package com.qishon.test;

import com.qishon.utils.ConfigFiles;
import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
/*
   flag代表含义 1---参数正常、异常情况验证，包括正确、错误、为空、超出范围
                2---缺少Token验证
                0---缺少参数的情况
 */
public class LoginTest {

    @BeforeTest(groups = "LoginTrue",description = "登陆前获取url")
    public void beforeTest_url(){
        UrlConfig.getToken_url = ConfigFiles.getUrl(InterfaceName.GETTOKEN);
        UrlConfig.gs_sys_shopLogin_url = ConfigFiles.getUrl(InterfaceName.GS_SYS_SHOPLOGIN);
        UrlConfig.gs_sys_amdpwd_url = ConfigFiles.getUrl(InterfaceName.GS_SYS_AMDPWD);
        UrlConfig.mat_mdl_getNavClassList_url = ConfigFiles.getUrl(InterfaceName.MAT_MDL_GETNAVCLASSLIST);
        UrlConfig.gs_sys_getPersoninFobyJob_url = ConfigFiles.getUrl(InterfaceName.GS_SYS_GETPERSONINFOBYJOB);
        UrlConfig.gs_sys_regDeviceInf_url = ConfigFiles.getUrl(InterfaceName.GS_SYS_REGDEVICEINF);
        UrlConfig.gs_prod_list_url = ConfigFiles.getUrl(InterfaceName.GS_PROD_LIST);
        UrlConfig.gs_prod_getProdInfo_url = ConfigFiles.getUrl(InterfaceName.GS_PROD_GETPRODINFO);
        UrlConfig.gs_prod_getProdOrdDetail_url = ConfigFiles.getUrl(InterfaceName.GS_PROD_GETPRODORDDETAIL);
        UrlConfig.gs_match_getFitProdInfoNew_url = ConfigFiles.getUrl(InterfaceName.GS_MATCH_GETFITPRODINFONEW);
        UrlConfig.gs_match_get3DModelInfoNew_url = ConfigFiles.getUrl(InterfaceName.GS_MATCH_GET3DMODELINFONEW);
        UrlConfig.gs_match_getFitProdRenderNew_url = ConfigFiles.getUrl(InterfaceName.GS_MATCH_GETFITPRODRENDERNEW);
        UrlConfig.gs_prod_getRegionByType_url = ConfigFiles.getUrl(InterfaceName.GS_PROD_GETREGIONBYTYPE);
        UrlConfig.gs_prod_getReplacePart_url = ConfigFiles.getUrl(InterfaceName.GS_PROD_GETREPLACEPART);
        UrlConfig.gs_mas_filterProdFabRicattr_url = ConfigFiles.getUrl(InterfaceName.GS_MAS_FILTERPRODFABRICATTR);
        UrlConfig.gs_prod_detail_url = ConfigFiles.getUrl(InterfaceName.GS_PROD_DETAIL);
        UrlConfig.gs_prod_getProdRegionByPrint_url = ConfigFiles.getUrl(InterfaceName.GS_PROD_GETPRODREGIONBYPRINT);
        UrlConfig.gs_prod_getPrintByRegion_url = ConfigFiles.getUrl(InterfaceName.GS_PROD_GETPRINTBYREGION);
        UrlConfig.gs_mas_getEMBCustomList_url = ConfigFiles.getUrl(InterfaceName.GS_MAS_GETEMBCUSTOMLIST);
        UrlConfig.gs_cus_saveCustom_url = ConfigFiles.getUrl(InterfaceName.GS_CUS_SAVECUSTOM);
        UrlConfig.gs_cus_getCustomList_url = ConfigFiles.getUrl(InterfaceName.GS_CUS_GETCUSTOMLIST);

    }

    @Test(groups = "LoginTrue",description = "获取Token")
    public void getToken(){

        Response response = given()
                .contentType("application/json")
                .body("{\"platform\":\"DGP\",\"password\":\"123456\",\"username\":\"QS003\",\"domainUrl\":\"qsxls.iss.com:8088\"," +
                        "\"client_id\":\"u3dIssClient\",\"client_secret\":\"u3dIssClientSecret\"}")
                .post(UrlConfig.getToken_url);
        UrlConfig.access_token = response.jsonPath().getString("access_token");
    }

    @DataProvider(name="getTokenTestData")
    public Object[][] getTokenTestData(){
        return new Object[][]{
                {1,"DGP","password","123456","username","QS003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"null","null","null","null","null","null","null","null"},
                {1,"PC","password","123456","username","QS003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"null","password","123456","username","QS003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","password","1","username","QS003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","password","null","username","QS003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","PWD","123456","username","QS003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","password","123456","username","QS0003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","password","123456","username","null","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","password","123456","LoginName","QS003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","password","123456","username","QS003","qsxls.iss.com:8888","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","password","123456","username","QS003","null","u3dIssClient","u3dIssClientSecret"},
                {1,"DGP","password","123456","username","QS003","qsxls.iss.com:8088","IssClient","u3dIssClientSecret"},
                {1,"DGP","password","123456","username","QS003","qsxls.iss.com:8088","null","u3dIssClientSecret"},
                {1,"DGP","password","123456","username","QS003","qsxls.iss.com:8088","u3dIssClient","IssClientSecret"},
                {1,"DGP","password","123456","username","QS003","qsxls.iss.com:8088","u3dIssClient","null"},
                {0,"DGP","password","123456","username","QS003","qsxls.iss.com:8088","u3dIssClient","u3dIssClientSecret"}
        };
    }

    @Test(dataProvider = "getTokenTestData",groups = "LoginTrue",description = "获取Token")
    public void getTokenTest(int flag,String platform,String pwdKey,String password,String userNameKey,String userName,
                         String domainUrl,String client_id,String client_secret){

        if (flag == 1){//参数正常、异常的情况
            Response response = given()
                    .contentType("application/json")
                    .body("{\"platform\":\""+platform+"\",\""+pwdKey+"\":\""+password+"\",\""+userNameKey+"\":\""+userName+
                            "\",\"domainUrl\":\""+domainUrl+"\",\"client_id\":\""+client_id+"\",\"client_secret\":\""+client_secret+"\"}")
                    .post(UrlConfig.getToken_url);
            Assert.assertEquals(response.getStatusCode(),200);
            response.prettyPrint();
        }else {//缺少参数的情况
            Response response = given()
                    .contentType("application/json")
                    .body("{\"platform\":\""+platform+"\",\""+pwdKey+"\":\""+password+"\",\""+userNameKey+"\":\""+userName+
                            "\",\"domainUrl\":\""+domainUrl+"\",\"client_id\":\""+client_id+"\"}")
                    .post(UrlConfig.getToken_url);
            Assert.assertEquals(response.getStatusCode(),404);
            response.prettyPrint();
        }
    }

    @DataProvider(name="gs_sys_shopLoginData")
    public Object[][] gs_sys_shopLoginData(){
        return new Object[][]{
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {2,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"","","","null","null","usrName","null","loginPwd","null","null","null","null","null"},
                {1,"555","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","555","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","PC","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","null","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0055","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","null","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6888","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","null","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS333","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","LoginName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F888E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","null","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","password","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_GUIDER","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","null","zh-CN","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","UTF-8","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","null","D_DIPAD","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DPC","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","null","1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","2"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","-1"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","0"},
                {1,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","null"},
                {0,"239","523","DGP","QS0001","C85B76DB6828","usrName","QS003","loginPwd","E10ADC3949BA59ABBE56E057F20F883E","D_SHOPGUIDER","zh-CN","D_DIPAD","1"}
        };
    }

    @Test(dataProvider = "gs_sys_shopLoginData",dependsOnMethods = "getToken",groups = "loginTrue",description = "店铺登陆接口测试",priority = 1)
    public void gs_sys_shopLogin(int flag,String companyId,String usrId,String platform,String shopCode,String deviceVode,
                                 String userNameKey,String userName,String loginPwdKey,String loginPwd,String jobType,
                                 String languageCode,String deviceType,String pwdFlag){
        String shopLogin_url = ReplaceUtils.replaceUtilsTools(UrlConfig.gs_sys_shopLogin_url,"239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){//参数正常、异常情况验证
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token )
                    .body("{\"usrKey\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceVode+"\",\"brandCode\":null," +
                            "\""+userNameKey+"\":\""+userName+"\",\""+loginPwdKey+"\":\""+loginPwd+"\",\"jobType\":\""+jobType+"\"," +
                            "\"languageCode\":\""+languageCode+"\",\"address\":null,\"provinceCode\":null,\"cityCode\":null," +
                            "\"districtCode\":null,\"deviceType\":\""+deviceType+"\",\"pwdFlag\":\""+pwdFlag+"\"}")
                    .post(shopLogin_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){//缺少Token的验证
            Response response = given()
                    .contentType("application/json")
                    .body("{\"usrKey\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceVode+"\",\"brandCode\":null," +
                            "\""+userNameKey+"\":\""+userName+"\",\""+loginPwdKey+"\":\""+loginPwd+"\",\"jobType\":\""+jobType+"\"," +
                            "\"languageCode\":\""+languageCode+"\",\"address\":null,\"provinceCode\":null,\"cityCode\":null," +
                            "\"districtCode\":null,\"deviceType\":\""+deviceType+"\",\"pwdFlag\":\""+pwdFlag+"\"}")
                    .post(shopLogin_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else {//缺少参数的验证
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token )
                    .body("{\"usrKey\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceVode+"\",\"brandCode\":null," +
                            "\""+userNameKey+"\":\""+userName+"\",\""+loginPwdKey+"\":\""+loginPwd+"\",\"jobType\":\""+jobType+"\"," +
                            "\"languageCode\":\""+languageCode+"\",\"address\":null,\"provinceCode\":null,\"cityCode\":null," +
                            "\"districtCode\":null,\"deviceType\":\""+deviceType+"\"}")
                    .post(shopLogin_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }
    }

    @DataProvider(name="alter_PWDData")
    public Object[][] alter_PWDData(){
        return new Object[][]{
                {1,"239","523","DGP","123456","654321","usrName","QS003","D_SHOPGUIDER"},
                {2,"239","523","DGP","123456","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"","","","null","null","usrName","null","null"},
                {1,"333","523","DGP","123456","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"","523","DGP","123456","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","555","DGP","123456","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","","DGP","123456","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","523","PC","123456","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","523","","123456","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","523","DGP","111","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","523","DGP","null","654321","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","523","DGP","123456","?!.","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","523","DGP","123456","null","usrName","QS003","D_SHOPGUIDER"},
                {1,"239","523","DGP","123456","654321","usrName","QS333","D_SHOPGUIDER"},
                {1,"239","523","DGP","123456","654321","usrName","null","D_SHOPGUIDER"},
                {1,"239","523","DGP","123456","654321","LoginName","QS003","D_SHOPGUIDER"},
                {1,"239","523","DGP","123456","654321","usrName","QS003","D_GUIDER"},
                {1,"239","523","DGP","123456","654321","usrName","QS003","null"},
                {0,"239","523","DGP","123456","654321","usrName","QS003","D_SHOPGUIDER"}
        };
    }

    @Test(dataProvider = "alter_PWDData",dependsOnMethods = "getToken",groups = "loginTrue",description = "修改密码接口测试",priority = 2)
    public void alter_PWD(int flag,String companyId,String usrId,String platform,String oldPwd,String newPwd,
                          String userNameKey,String userName,String jobType){
        String alter_PWD_url = ReplaceUtils.replaceUtilsTools(UrlConfig.gs_sys_amdpwd_url,"239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){//验证参数正常、异常的情况
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"oldPwd\":\""+oldPwd+"\",\"newPwd\":\""+newPwd+"\",\""+userNameKey+"\":\""+userName+"\",\"jobType\":\""+jobType+"\"}")
                    .put(alter_PWD_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){//验证缺少Token的情况
            Response response = given()
                    .contentType("application/json")
                    .body("{\"oldPwd\":\""+oldPwd+"\",\"newPwd\":\""+newPwd+"\",\""+userNameKey+"\":\""+userName+"\",\"jobType\":\""+jobType+"\"}")
                    .put(alter_PWD_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        } else {//验证缺少参数的情况
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"oldPwd\":\""+oldPwd+"\",\"newPwd\":\""+newPwd+"\",\""+userNameKey+"\":\""+userName+"\"}")
                    .put(alter_PWD_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
