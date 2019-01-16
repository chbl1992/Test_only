package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_match_getFitProdRenderNewTestCase {

    @DataProvider(name="gs_match_getFitProdRenderNewTestData")
    public Object[][] gs_match_getFitProdRenderNewTestData(){
        return new Object[][]{
                {1,"239","523","DGP","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {2,"239","523","DGP","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"","","","null","null","null","null","null"},
                {1,"333","523","DGP","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"","523","DGP","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","555","DGP","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","","DGP","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","PC","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","555","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","523","333","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","523","","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","523","239","QZJ111","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","523","239","","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","523","239","QZJ001","D_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","523","239","QZJ001","","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"10215\",\"prodId\":\"7322\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","523","239","QZJ001","D_MAT_PC","null"},
                {0,"239","523","DGP","523","239","QZJ001","D_MAT_PC","[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"}
        };
    }

    @Test(dataProvider = "gs_match_getFitProdRenderNewTestData",groups ="LoginTrue",description = "获取商品配件渲染信息")
    public void gs_match_getFitProdRenderNewTest(int flag,String companyId,String usrId,String platform,String usrId1,String companyId1,
                                                 String mainProdCode,String platformType,String fitProdList){
        String gs_match_getFitProdRenderNewTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_match_getFitProdRenderNew_url,
                "239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"customKey\":null,\"usrId\":\""+usrId1+"\",\"companyId\":\""+companyId1+"\",\"mainProdCode\":\""+mainProdCode+"\"," +
                            "\"platformType\":\""+platformType+"\",\"fitProdList\":"+fitProdList+"}")
                    .post(gs_match_getFitProdRenderNewTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .contentType("application/json")
                    .body("{\"customKey\":null,\"usrId\":\""+usrId1+"\",\"companyId\":\""+companyId1+"\",\"mainProdCode\":\""+mainProdCode+"\"," +
                            "\"platformType\":\""+platformType+"\",\"fitProdList\":"+fitProdList+"}")
                    .post(gs_match_getFitProdRenderNewTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"customKey\":null,\"usrId\":\""+usrId1+"\",\"companyId\":\""+companyId1+"\",\"mainProdCode\":\""+mainProdCode+"\"," +
                            "\"platformType\":\""+platformType+"\"}")
                    .post(gs_match_getFitProdRenderNewTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }

    }
}
