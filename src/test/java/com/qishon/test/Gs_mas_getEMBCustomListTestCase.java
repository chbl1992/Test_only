package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_mas_getEMBCustomListTestCase {

    @DataProvider(name="gs_mas_getEMBCustomListTestData")
    public Object[][] gs_mas_getEMBCustomListTestData(){
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

    @Test(dataProvider = "gs_mas_getEMBCustomListTestData",groups = "LoginTrue",description = "获取绣字可定制部位列表")
    public void gs_mas_getEMBCustomListTest(int flag, String partCode,String companyId,String usrId,String platform){
        String gs_mas_getEMBCustomListTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_mas_getEMBCustomList_url,
                "QZJ001",partCode,"239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_mas_getEMBCustomListTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(gs_mas_getEMBCustomListTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String gs_mas_getEMBCustomListTest_url1 = gs_mas_getEMBCustomListTest_url.replace("&platform=DGP","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_mas_getEMBCustomListTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
