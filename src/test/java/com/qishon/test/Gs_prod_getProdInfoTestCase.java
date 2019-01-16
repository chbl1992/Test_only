package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_getProdInfoTestCase {

    @DataProvider(name="Gs_prod_getProdInfoTestData")
    public Object[][] Gs_prod_getProdInfoTestData(){
        return new Object[][]{
                {1,"QZJ001","C85B76DB6828","239","523","DGP"},
                {2,"QZJ001","C85B76DB6828","239","523","DGP"},
                {1,"","","","",""},
                {1,"QZJ111","C85B76DB6828","239","523","DGP"},
                {1,"","C85B76DB6828","239","523","DGP"},
                {1,"QZJ001","C85B76DB688","239","523","DGP"},
                {1,"QZJ001","","239","523","DGP"},
                {1,"QZJ001","C85B76DB6828","333","523","DGP"},
                {1,"QZJ001","C85B76DB6828","","523","DGP"},
                {1,"QZJ001","C85B76DB6828","239","555","DGP"},
                {1,"QZJ001","C85B76DB6828","239","","DGP"},
                {1,"QZJ001","C85B76DB6828","239","523","PC"},
                {1,"QZJ001","C85B76DB6828","239","523",""},
                {0,"QZJ001","C85B76DB6828","239","523","DGP"}
        };
    }

    @Test(dataProvider = "Gs_prod_getProdInfoTestData",groups = "LoginTest",description = "获取商品基本信息接口测试")
    public void Gs_prod_getProdInfoTest(int flag,String partCode,String deviceCode,String companyId,String usrId,String platform){
        String Gs_prod_getProdInfoTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_prod_getProdInfo_url,"QZJ001",partCode,
                "C85B76DB6828",deviceCode,"239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Gs_prod_getProdInfoTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(Gs_prod_getProdInfoTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String Gs_prod_getProdInfoTest_url1 = Gs_prod_getProdInfoTest_url.replace("&platform=DGP","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Gs_prod_getProdInfoTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }
    }
}
