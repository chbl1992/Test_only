package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_detailTestCase {

    @DataProvider(name="gs_prod_detailTestData")
    public Object[][] gs_prod_detailTestData(){
        return new Object[][]{
                {1,"QZJ001","239","523","DGP"},
                {2,"QZJ001","239","523","DGP"},
                {1,"","","",""},
                {1,"QZJ111","239","523","DGP"},
                {1,"","239","523","DGP"},
                {1,"QZJ001","333","523","DGP"},
                {1,"QZJ001","","523","DGP"},
                {1,"QZJ001","239","555","DGP"},
                {1,"QZJ001","239","","DGP"},
                {1,"QZJ001","239","523","PC"},
                {1,"QZJ001","239","523",""},
                {0,"QZJ001","239","523","DGP"}
        };
    }

    @Test(dataProvider = "gs_prod_detailTestData",groups = "LoginTrue",description = "获取商品销量，评价，标签")
    public void gs_prod_detailTest(int flag,String partCode,String companyId,String usrId,String platform){
        String gs_prod_detailTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_prod_detail_url,"QZJ001",partCode,
                "239",companyId,"523",usrId,"DGP",platform );
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_prod_detailTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(gs_prod_detailTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String gs_prod_detailTest_url1=gs_prod_detailTest_url.replace("&platform=DGP","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_prod_detailTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }
    }
}
