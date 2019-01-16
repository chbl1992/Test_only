package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_cus_saveCustomTestCase {

    @DataProvider(name="gs_cus_saveCustomTestData")
    public Object[][] gs_cus_saveCustomTestData(){
        return new Object[][]{
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {2,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"","","","null","null","null","null","null","null","null"},
                {1,"333","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","555","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","PC","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","null","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS1111","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","null","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6888","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","null","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9988","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","null","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ111","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","null","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"111\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"1\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","null",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"1111\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"},
                {1,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "null"},
                {0,"239","523","DGP","D_BUSCONTS_DGP","QS0001","C85B76DB6828","9978","QZJ001","[{\"regionId\":\"66\",\"partId\":\"530\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\"," +
                        "\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null," +
                        "\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}," +
                        "{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\"," +
                        "\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\"," +
                        "\"fabricId\":\"597\",\"embList\":null,\"printList\":null}]",
                        "[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\"," +
                                "\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]"}
        };
    }

    @Test(dataProvider = "gs_cus_saveCustomTestData",groups = "LoginTrue",description = "保存定制方案")
    public void gs_cus_saveCustomTest(int flag,String companyId,String usrId,String platform,String busContsCode,String shopCode,
                                      String deviceCode,String designHdFileHdId,String goodsCode,String detailedList,String propPartList){
        String gs_cus_saveCustomTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_cus_saveCustom_url,"239",companyId,
                "523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"busContsCode\":\""+busContsCode+"\",\"ctmUsrId\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceCode+"\"," +
                            "\"designHdFileHdId\":\""+designHdFileHdId+"\",\"goodsCode\":\""+goodsCode+"\",\"mainFabricCode\":null," +
                            "\"detailedList\":"+detailedList+",\"propPartList\":"+propPartList+"}")
//                    .body("{\"busContsCode\":\"D_BUSCONTS_DGP\",\"ctmUsrId\":null,\"shopCode\":\"QS0001\",\"deviceCode\":\"C85B76DB6828\",\"designHdFileHdId\":\"9978\",\"goodsCode\":\"QZJ001\",\"mainFabricCode\":null,\"detailedList\":[{\"regionId\":\"66\",\"partId\":\"530\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"67\",\"partId\":\"513\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"71\",\"partId\":\"468\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"72\",\"partId\":\"476\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"73\",\"partId\":\"516\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"74\",\"partId\":\"547\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null},{\"regionId\":\"75\",\"partId\":\"549\",\"fabricId\":\"597\",\"embList\":null,\"printList\":null}],\"propPartList\":[{\"colorId\":\"105\",\"prodId\":\"732\",\"prodCode\":\"DT001\",\"colorCode\":\"999\"},{\"colorId\":\"105\",\"prodId\":\"735\",\"prodCode\":\"DS001\",\"colorCode\":\"999\"}]}")
                    .post(gs_cus_saveCustomTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .contentType("application/json")
                    .body("{\"busContsCode\":\""+busContsCode+"\",\"ctmUsrId\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceCode+"\"," +
                            "\"designHdFileHdId\":\""+designHdFileHdId+"\",\"goodsCode\":\""+goodsCode+"\",\"mainFabricCode\":null," +
                            "\"detailedList\":"+detailedList+",\"propPartList\":"+propPartList+"}")
                    .post(gs_cus_saveCustomTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else {
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"busContsCode\":\""+busContsCode+"\",\"ctmUsrId\":null,\"shopCode\":\""+shopCode+"\",\"deviceCode\":\""+deviceCode+"\"," +
                            "\"designHdFileHdId\":\""+designHdFileHdId+"\",\"goodsCode\":\""+goodsCode+"\",\"mainFabricCode\":null," +
                            "\"detailedList\":"+detailedList+"}")
                    .post(gs_cus_saveCustomTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
