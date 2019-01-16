package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_cus_getCustomListTestCase {

    @DataProvider(name="gs_cus_getCustomListTestData")
    public Object[][] gs_cus_getCustomListTestData(){
        return new Object[][]{
                {1,"QZJ001","QS0001","C85B76DB6828","239","523","DGP"},
                {2,"QZJ001","QS0001","C85B76DB6828","239","523","DGP"},
                {1,"","","","","",""},
                {1,"QZJ111","QS0001","C85B76DB6828","239","523","DGP"},
                {1,"","QS0001","C85B76DB6828","239","523","DGP"},
                {1,"QZJ001","QS1111","C85B76DB6828","239","523","DGP"},
                {1,"QZJ001","","C85B76DB6828","239","523","DGP"},
                {1,"QZJ001","QS0001","C85B76DB6888","239","523","DGP"},
                {1,"QZJ001","QS0001","","239","523","DGP"},
                {1,"QZJ001","QS0001","C85B76DB6828","333","523","DGP"},
                {1,"QZJ001","QS0001","C85B76DB6828","","523","DGP"},
                {1,"QZJ001","QS0001","C85B76DB6828","239","555","DGP"},
                {1,"QZJ001","QS0001","C85B76DB6828","239","","DGP"},
                {1,"QZJ001","QS0001","C85B76DB6828","239","523","PC"},
                {1,"QZJ001","QS0001","C85B76DB6828","239","523",""},
                {0,"QZJ001","QS0001","C85B76DB6828","239","523","DGP"}
        };
    }

    @Test(dataProvider = "gs_cus_getCustomListTestData",groups = "LoginTrue",description = "获取定制方案列表接口")
    public void gs_cus_getCustomListTest(int flag,String partCode,String shopCode,String deviceCode,String companyId,String usrId,String platform){
        String gs_cus_getCustomListTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_cus_getCustomList_url,"QZJ001",partCode,
                "QS0001",shopCode,"C85B76DB6828",deviceCode,"239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_cus_getCustomListTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(gs_cus_getCustomListTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String gs_cus_getCustomListTest_url1=gs_cus_getCustomListTest_url.replace("&platform=DGP","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_cus_getCustomListTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
