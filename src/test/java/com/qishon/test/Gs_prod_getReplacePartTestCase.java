package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_prod_getReplacePartTestCase {

    @DataProvider(name="gs_prod_getReplacePartTestData")
    public Object[][] gs_prod_getReplacePartTestData(){
        return new Object[][]{
                {1,"239","523","DGP","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {2,"239","523","DGP","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"","","","","","","","",""},
                {1,"333","523","DGP","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"","523","DGP","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","555","DGP","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","","DGP","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","PC","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","0","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","-1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","2","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ111","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","333","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","311","POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","311","","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","311","D_POCKET","-1","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","311","D_POCKET","2","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","311","D_POCKET","1","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","311","D_POCKET","","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","311","D_POCKET","0","[\"J_11_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"},
                {1,"239","523","DGP","1","QZJ001","311","D_POCKET","0",""},
                {0,"239","523","DGP","1","QZJ001","311","D_POCKET","0","[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]"}
        };
    }

    @Test(dataProvider = "gs_prod_getReplacePartTestData",groups = "LoginTrue",description = "获取可替换部件和面料")
    public void gs_prod_getReplacePartTest(int flag,String companyId,String usrId,String platform,String isDgp,String goodsCode,
                                           String dptId,String regionCode,String checkFlag, String partCodes){
        String gs_prod_getReplacePartTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_prod_getReplacePart_url,"239",companyId,
                "523",usrId,"DGP",platform,"1",isDgp,"QZJ001",goodsCode,"311",dptId,"D_POCKET",regionCode,
                "0",checkFlag,"[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]",partCodes);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_prod_getReplacePartTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(gs_prod_getReplacePartTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String gs_prod_getReplacePartTest_url1=gs_prod_getReplacePartTest_url.replace("&partCodes=[\"J_11_PCCA_F\",\"J_32_COLL_PL_C\",\"J_BACK_C\",\"J_11_PCBR_C\",\"J_32_FRON_LC\",\"J_SLBU_5B\",\"J_SLEE_B\"]","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(gs_prod_getReplacePartTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
