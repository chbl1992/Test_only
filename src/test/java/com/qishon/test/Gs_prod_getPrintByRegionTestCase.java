package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_getPrintByRegionTestCase {

    @DataProvider(name="gs_prod_getPrintByRegionTestData")
    public Object[][] gs_prod_getPrintByRegionTestData(){
        return new Object[][]{
                {1,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","239","523","DGP"},
                {2,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","239","523","DGP"},
                {1,"","","","","",""},
                {1,"QZJ111","D_SLEEVE_VENT","C85B76DB6828","239","523","DGP"},
                {1,"","D_SLEEVE_VENT","C85B76DB6828","239","523","DGP"},
                {1,"QZJ001","D_VENT","C85B76DB6828","239","523","DGP"},
                {1,"QZJ001","","C85B76DB6828","239","523","DGP"},
                {1,"QZJ001","D_SLEEVE_VENT","C85B76DB8828","239","523","DGP"},
                {1,"QZJ001","D_SLEEVE_VENT","","239","523","DGP"},
                {1,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","333","523","DGP"},
                {1,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","","523","DGP"},
                {1,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","239","555","DGP"},
                {1,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","239","","DGP"},
                {1,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","239","523","PC"},
                {1,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","239","523",""},
                {0,"QZJ001","D_SLEEVE_VENT","C85B76DB6828","239","523","DGP"}
        };
    }

    @Test(dataProvider = "gs_prod_getPrintByRegionTestData",groups = "LoginTrue",description = "获取印花列表")
    public void gs_prod_getPrintByRegionTest(int flag, String partCode,String regionCode,String deviceCode,String companyId,
                                             String usrId,String platform){
        String gs_prod_getPrintByRegionTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_prod_getPrintByRegion_url,
                "QZJ001",partCode,"D_SLEEVE_VENT",regionCode,"C85B76DB6828",deviceCode,"239",companyId,
                "523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_prod_getPrintByRegionTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(gs_prod_getPrintByRegionTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String gs_prod_getPrintByRegionTest_url1 = gs_prod_getPrintByRegionTest_url.replace("&platform=DGP","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_prod_getPrintByRegionTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }
    }
}
