package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_mas_filterProdFabRicattrTestCase {

    @DataProvider(name="gs_mas_filterProdFabRicattrTestData")
    public Object[][] gs_mas_filterProdFabRicattrTestData(){
        return new Object[][]{
                {1,"311","QZP001","QSA107-09","1","20","239","523","DGP"},
                {2,"311","QZP001","QSA107-09","1","20","239","523","DGP"},
                {1,"","","Q","","","","",""},
                {1,"333","QZP001","QSA107-09","1","20","239","523","DGP"},
                {1,"","QZP001","QSA107-09","1","20","239","523","DGP"},
                {1,"311","QZP111","QSA107-09","1","20","239","523","DGP"},
                {1,"311","","QSA107-09","1","20","239","523","DGP"},
                {1,"311","QZP001","QSA10709","1","20","239","523","DGP"},
                {1,"311","QZP001","","1","20","239","523","DGP"},
                {1,"311","QZP001","QSA107-09","0","20","239","523","DGP"},
                {1,"311","QZP001","QSA107-09","-1","20","239","523","DGP"},
                {1,"311","QZP001","QSA107-09","","20","239","523","DGP"},
                {1,"311","QZP001","QSA107-09","1","0","239","523","DGP"},
                {1,"311","QZP001","QSA107-09","1","-1","239","523","DGP"},
                {1,"311","QZP001","QSA107-09","1","50","239","523","DGP"},
                {1,"311","QZP001","QSA107-09","1","20","333","523","DGP"},
                {1,"311","QZP001","QSA107-09","1","20","","523","DGP"},
                {1,"311","QZP001","QSA107-09","1","20","239","555","DGP"},
                {1,"311","QZP001","QSA107-09","1","20","239","","DGP"},
                {1,"311","QZP001","QSA107-09","1","20","239","523","PC"},
                {1,"311","QZP001","QSA107-09","1","20","239","523",""},
                {0,"311","QZP001","QSA107-09","1","20","239","523","DGP"}
        };
    }

    @Test(dataProvider = "gs_mas_filterProdFabRicattrTestData",groups = "LoginTrue",description = "搜索可替换面料")
    public void gs_mas_filterProdFabRicattrTest(int flag,String shopId,String prodCode,String mainFabricCode,String pageNum,
                                                String pageSize,String companyId,String usrId,String platform){
        String gs_mas_filterProdFabRicattrTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_mas_filterProdFabRicattr_url,
                "311",shopId,"QZP001",prodCode,"QSA107-09",mainFabricCode,
                "1",pageNum,"20",pageSize,"239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .post(gs_mas_filterProdFabRicattrTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .contentType("application/json")
                    .post(gs_mas_filterProdFabRicattrTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String gs_mas_filterProdFabRicattrTest_url1=gs_mas_filterProdFabRicattrTest_url.replace("&platform=DGP","");
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .post(gs_mas_filterProdFabRicattrTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
