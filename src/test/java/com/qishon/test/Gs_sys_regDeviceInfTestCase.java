package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_sys_regDeviceInfTestCase {

    @DataProvider(name="Gs_sys_regDeviceInfTestData")
    public Object[][] Gs_sys_regDeviceInfTestData(){
        return new Object[][]{
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {2,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"","","","null","null","null","null","null","null","null","null","null","null","null"},
                {1,"333","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","555","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","PC","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS1111","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","null","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","333","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","null","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS333","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","null","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33327701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","null","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_GUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","null","zh-CN","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","UTF-8","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","null","qwe","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","?!(","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","null","110000","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","1111213","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","null","110100","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","111121","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","null","110101","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","112121","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","null","D_DIPAD"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DPC"},
                {1,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","null"},
                {0,"239","523","DGP","QS0001","111","QS003","C33367701511B4F6020EC61DED352059","D_SHOPGUIDER","zh-CN","qwe","110000","110100","110101","D_DIPAD"}
        };
    }

    @Test(dataProvider = "Gs_sys_regDeviceInfTestData",groups = "Login",description = "设备注册接口测试")
    public void Gs_sys_regDeviceInfTest(int flag,String companyId,String usrId,String platform,String shopCode,String deviceVode,
                                        String userName,String loginPwd,String jobType, String languageCode,String address,
                                        String provinceCode,String cityCode,String districtCode,String deviceType){
        String Gs_sys_regDeviceInfTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_sys_regDeviceInf_url,"239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"usrKey\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceVode+"\",\"brandCode\":null," +
                            "\"usrName\":\""+userName+"\",\"loginPwd\":\""+loginPwd+"\",\"jobType\":\""+jobType+"\"," +
                            "\"languageCode\":\""+languageCode+"\",\"address\":\""+address+"\",\"provinceCode\":\""+provinceCode+"\"," +
                            "\"cityCode\":\""+cityCode+"\",\"districtCode\":\""+districtCode+"\",\"deviceType\":\""+deviceType+"\",\"pwdFlag\":null}")
                    .post(Gs_sys_regDeviceInfTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .contentType("application/json")
                    .body("{\"usrKey\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceVode+"\",\"brandCode\":null," +
                            "\"usrName\":\""+userName+"\",\"loginPwd\":\""+loginPwd+"\",\"jobType\":\""+jobType+"\"," +
                            "\"languageCode\":\""+languageCode+"\",\"address\":\""+address+"\",\"provinceCode\":\""+provinceCode+"\"," +
                            "\"cityCode\":\""+cityCode+"\",\"districtCode\":\""+districtCode+"\",\"deviceType\":\""+deviceType+"\",\"pwdFlag\":null}")
                    .post(Gs_sys_regDeviceInfTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else{
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"usrKey\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceVode+"\",\"brandCode\":null," +
                            "\"usrName\":\""+userName+"\",\"loginPwd\":\""+loginPwd+"\",\"jobType\":\""+jobType+"\"," +
                            "\"languageCode\":\""+languageCode+"\",\"address\":\""+address+"\",\"provinceCode\":\""+provinceCode+"\"," +
                            "\"cityCode\":\""+cityCode+"\",\"districtCode\":\""+districtCode+"\",\"deviceType\":\""+deviceType+"\"}")
                    .post(Gs_sys_regDeviceInfTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
