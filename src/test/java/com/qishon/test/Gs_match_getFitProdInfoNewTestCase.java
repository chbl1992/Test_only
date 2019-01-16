package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_match_getFitProdInfoNewTestCase {

    @DataProvider(name="Gs_match_getFitProdInfoNewTestData")
    public Object[][] Gs_match_getFitProdInfoNewTestData(){
        return new Object[][]{
                {1,"239","523","DGP","QZJ001"},
                {2,"239","523","DGP","QZJ001"},
                {1,"","","",""},
                {1,"333","523","DGP","QZJ001"},
                {1,"","523","DGP","QZJ001"},
                {1,"239","555","DGP","QZJ001"},
                {1,"239","","DGP","QZJ001"},
                {1,"239","523","PC","QZJ001"},
                {1,"239","523","","QZJ001"},
                {1,"239","523","DGP","QZJ111"},
                {1,"239","523","DGP",""},
                {0,"239","523","DGP","QZJ001"}
        };
    }

    @Test(dataProvider = "Gs_match_getFitProdInfoNewTestData",groups = "LoginTest",description = "获取商品配件信息")
    public void Gs_match_getFitProdInfoNewTest(int flag,String companyId,String usrId,String platform,String prodCode){
        String Gs_match_getFitProdInfoNewTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_match_getFitProdInfoNew_url,
                "239",companyId,"523",usrId,"DGP",platform,"QZJ001",prodCode);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Gs_match_getFitProdInfoNewTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(Gs_match_getFitProdInfoNewTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String Gs_match_getFitProdInfoNewTest_url1=Gs_match_getFitProdInfoNewTest_url.replace("&prodCode=QZJ001","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Gs_match_getFitProdInfoNewTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
