package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_sys_getPersonInfoByJobTestCase {

    @DataProvider(name="Gs_sys_getPersonInfoByJobTestData")
    public Object[][] Gs_sys_getPersonInfoByJobTestData(){
        return new Object[][]{
                {1,"239","523","DGP","QS0001","D_SHOPGUIDER"},
                {2,"239","523","DGP","QS0001","D_SHOPGUIDER"},
                {1,"333","523","DGP","QS0001","D_SHOPGUIDER"},
                {1,"","523","DGP","QS0001","D_SHOPGUIDER"},
                {1,"239","555","DGP","QS0001","D_SHOPGUIDER"},
                {1,"239","","DGP","QS0001","D_SHOPGUIDER"},
                {1,"239","523","PC","QS0001","D_SHOPGUIDER"},
                {1,"239","523","","QS0001","D_SHOPGUIDER"},
                {1,"239","523","DGP","QS1111","D_SHOPGUIDER"},
                {1,"239","523","DGP","","D_SHOPGUIDER"},
                {1,"239","523","DGP","QS0001","D_GUIDER"},
                {1,"239","523","DGP","QS0001","null"},
                {0,"239","523","DGP","QS0001","D_SHOPGUIDER"}
        };
    }

    @Test(dataProvider = "Gs_sys_getPersonInfoByJobTestData",groups = "LoginTest",description = "获取门店的导购员信息接口测试")
    public void Gs_sys_getPersonInfoByJobTest(int flag,String companyId,String usrId,String platform,String shopCode,String jobType){

        String Gs_sys_getPersonInfoByJobTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_sys_getPersoninFobyJob_url,"239",companyId,
                "523",usrId,"DGP",platform,"QS0001",shopCode,"D_SHOPGUIDER",jobType);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Gs_sys_getPersonInfoByJobTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(Gs_sys_getPersonInfoByJobTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String Gs_sys_getPersonInfoByJobTest_url1=Gs_sys_getPersonInfoByJobTest_url.replace("&jobType=D_SHOPGUIDER","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Gs_sys_getPersonInfoByJobTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
