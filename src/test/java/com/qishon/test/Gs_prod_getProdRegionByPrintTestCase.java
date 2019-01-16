package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_getProdRegionByPrintTestCase {

    @DataProvider(name="gs_prod_getProdRegionByPrintTestData")
    public Object[][] gs_prod_getProdRegionByPrintTestData(){
        return new Object[][]{
                {1,"239","523","DGP"},
                {2,"239","523","DGP"},
                {1,"","",""},
                {1,"333","523","DGP"},
                {1,"","523","DGP"},
                {1,"239","555","DGP"},
                {1,"239","","DGP"},
                {1,"239","523","PC"},
                {1,"239","523",""},
                {0,"239","523","DGP"}
        };
    }

    @Test(dataProvider = "gs_prod_getProdRegionByPrintTestData",groups = "LoginTrue",description = "获取印花可定制部位")
    public void gs_prod_getProdRegionByPrintTest(int flag,String companyId,String usrId,String platform){
        String gs_prod_getProdRegionByPrintTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_prod_getProdRegionByPrint_url,
                "239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_prod_getProdRegionByPrintTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(gs_prod_getProdRegionByPrintTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String gs_prod_getProdRegionByPrintTest_url1 =gs_prod_getProdRegionByPrintTest_url.replace("&platform=DGP","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_prod_getProdRegionByPrintTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
