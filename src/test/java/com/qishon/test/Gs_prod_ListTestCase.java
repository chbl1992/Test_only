package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_ListTestCase {

    @DataProvider(name="Gs_prod_ListData")
    public Object[][] Gs_prod_ListData(){
        return new Object[][]{
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {2,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"","","","","","","null","null","null","null"},
                {1,"333","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","1","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","-1","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","2","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","333","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","555","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","PC","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goo","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","null","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","-1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","0","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","null","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","-1","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","0","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sal\\\",\\\"order\\\":\\\"DE\\\"}]"},
                {1,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","null"},
                {0,"311","0","D_BUSCONTS_DGP","239","523","DGP","goods","1","15","[{\\\"field\\\":\\\"sales\\\",\\\"order\\\":\\\"DESC\\\"}]"}
        };
    }

    @Test(dataProvider = "Gs_prod_ListData",groups = "LoginTest",description = "获取商品墙商品列表接口测试")
    public void Gs_prod_List(int flag,String shopCode,String queryNullBusFlag,String busContsCode,String companyId,
                             String usrId,String platform,String origin,String pageNum,String pageSize,String sortParam){
        String Gs_prod_List_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_prod_list_url,"311",shopCode,"0",queryNullBusFlag,
                "D_BUSCONTS_DGP",busContsCode,"239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"filters\":null,\"keyword\":\"\",\"origin\":\""+origin+"\",\"pageNum\":"+pageNum+",\"range\":null," +
                            "\"pageSize\":"+pageSize+",\"sortParam\":\""+sortParam+"\"}")
                    .post(Gs_prod_List_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .contentType("application/json")
                    .body("{\"filters\":null,\"keyword\":\"\",\"origin\":\""+origin+"\",\"pageNum\":"+pageNum+",\"range\":null," +
                            "\"pageSize\":"+pageSize+",\"sortParam\":\""+sortParam+"\"}")
                    .post(Gs_prod_List_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"filters\":null,\"keyword\":\"\",\"origin\":\""+origin+"\",\"pageNum\":"+pageNum+",\"range\":null," +
                            "\"pageSize\":"+pageSize+"}")
                    .post(Gs_prod_List_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }
    }
}
