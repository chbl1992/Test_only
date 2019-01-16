package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_getProdOrdDetailTestCase {

    @DataProvider(name="Gs_prod_getProdOrdDetailTestData")
    public Object[][] Gs_prod_getProdOrdDetailTestData(){
        return new Object[][]{
                {1,"239","523","DGP","D_MAT_PC","QZJ001"},
                {2,"239","523","DGP","D_MAT_PC","QZJ001"},
                {1,"","","","",""},
                {1,"333","523","DGP","D_MAT_PC","QZJ001"},
                {1,"","523","DGP","D_MAT_PC","QZJ001"},
                {1,"239","555","DGP","D_MAT_PC","QZJ001"},
                {1,"239","","DGP","D_MAT_PC","QZJ001"},
                {1,"239","523","PC","D_MAT_PC","QZJ001"},
                {1,"239","523","","D_MAT_PC","QZJ001"},
                {1,"239","523","DGP","D_PC","QZJ001"},
                {1,"239","523","DGP","","QZJ001"},
                {1,"239","523","DGP","D_MAT_PC","QZJ111"},
                {1,"239","523","DGP","D_MAT_PC",""},
                {2,"239","523","DGP","D_MAT_PC","QZJ001"}
        };
    }

    @Test(dataProvider = "Gs_prod_getProdOrdDetailTestData",groups = "LoginTrue",description = "根据款式版型获取默认定制详情接口测试")
    public void Gs_prod_getProdOrdDetailTest(int flag,String companyId,String usrId,String platform,String platformType,String prodCode){
        String Gs_prod_getProdOrdDetailTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_prod_getProdOrdDetail_url,"239",companyId,
                "523",usrId,"DGP",platform,"D_MAT_PC",platformType,"QZJ001",prodCode);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Gs_prod_getProdOrdDetailTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(Gs_prod_getProdOrdDetailTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String Gs_prod_getProdOrdDetailTest_url1=Gs_prod_getProdOrdDetailTest_url.replace("&prodCode=QZJ001","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Gs_prod_getProdOrdDetailTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
