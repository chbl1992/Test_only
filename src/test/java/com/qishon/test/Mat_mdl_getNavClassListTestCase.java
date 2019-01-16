package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Mat_mdl_getNavClassListTestCase {

    @DataProvider(name="Mat_mdl_getNavClassListTestData")
    public Object[][] Mat_mdl_getNavClassListTestData(){
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

    @Test(dataProvider = "Mat_mdl_getNavClassListTestData",groups = "loginTrue",description = "获取运营分类接口测试")
    public void Mat_mdl_getNavClassListTest(int flag,String companyId,String usrId,String platform){
        String Mat_mdl_getNavClassListTest_url = ReplaceUtils.replaceUtilsTools(UrlConfig.mat_mdl_getNavClassList_url,
                "239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Mat_mdl_getNavClassListTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .get(Mat_mdl_getNavClassListTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            String Mat_mdl_getNavClassListTest_url1=Mat_mdl_getNavClassListTest_url.replace("&platform=DGP","");
            Response response = given()
                    .auth().oauth2(UrlConfig.access_token)
                    .get(Mat_mdl_getNavClassListTest_url1);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
