package com.qishon.test;

import com.qishon.utils.ReplaceUtils;
import com.qishon.utils.UrlConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Gs_match_get3DModelInfoNewTestCase {

    @DataProvider(name="Gs_match_get3DModelInfoNewTestData")
    public Object[][] Gs_match_get3DModelInfoNewTestData(){
        return new Object[][]{
                {1,"239","523","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {2,"239","523","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"","","","null","null","null"},
                {1,"333","523","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"","523","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"239","555","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"239","","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"239","523","PC","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"239","523","","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"239","523","DGP","QZJ111","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"239","523","DGP","null","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"239","523","DGP","QZJ001","[{\"regionId\":\"86\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"888\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"},
                {1,"239","523","DGP","QZJ001","null","D_MAT_PC"},
                {1,"239","523","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_PC"},
                {1,"239","523","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "null"},
                {0,"239","523","DGP","QZJ001","[{\"regionId\":\"66\",\"regionCode\":\"D_POCKET\",\"partId\":\"530\"," +
                        "\"partCode\":\"J_11_PCCA_F\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"腰兜\",\"partName\":\"J_11_PCCA_F\"},{\"regionId\":\"67\",\"regionCode\":\"D_COLLA\"," +
                        "\"partId\":\"513\",\"partCode\":\"J_32_COLL_PL_C\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"领型\",\"partName\":\"J_32_COLL_PL_C\"},{\"regionId\":\"71\"," +
                        "\"regionCode\":\"D_BACK_PIECE\",\"partId\":\"468\",\"partCode\":\"J_BACK_C\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"后片\",\"partName\":\"J_BACK_C\"}," +
                        "{\"regionId\":\"72\",\"regionCode\":\"D_BREAST_POCKET\",\"partId\":\"476\",\"partCode\":\"J_11_PCBR_C\"," +
                        "\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"胸兜\"," +
                        "\"partName\":\"J_11_PCBR_C\"},{\"regionId\":\"73\",\"regionCode\":\"D_FRONT_PIECE\",\"partId\":\"516\"," +
                        "\"partCode\":\"J_32_FRON_LC\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\",\"salePrice\":null," +
                        "\"regionName\":\"前片\",\"partName\":\"J_32_FRON_LC\"},{\"regionId\":\"74\",\"regionCode\":\"D_SLEEVE_BUTTON\"," +
                        "\"partId\":\"547\",\"partCode\":\"J_SLBU_5B\",\"fabricId\":\"597\",\"fabricCode\":\"QS1010152\"," +
                        "\"salePrice\":null,\"regionName\":\"袖扣\",\"partName\":\"J_SLBU_5B\"},{\"regionId\":\"75\"," +
                        "\"regionCode\":\"D_SLEEVE_VENT\",\"partId\":\"549\",\"partCode\":\"J_SLEE_B\",\"fabricId\":\"597\"," +
                        "\"fabricCode\":\"QS1010152\",\"salePrice\":null,\"regionName\":\"袖开衩\",\"partName\":\"J_SLEE_B\"}]",
                        "D_MAT_PC"}
        };
    }

    @Test(dataProvider = "Gs_match_get3DModelInfoNewTestData",groups = "LoginTrue",description = "定制渲染接口测试")
    public void Gs_match_get3DModelInfoNewTest(int flag,String companyId,String usrId,String platform,String prodCode,
                                               String prodPartSet,String platformType){
        String Gs_match_get3DModelInfoNewTest_url= ReplaceUtils.replaceUtilsTools(UrlConfig.gs_match_get3DModelInfoNew_url,
                "239",companyId,"523",usrId,"DGP",platform);
        if (flag == 1){
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"prodCode\":\""+prodCode+"\",\"mainFabricCode\":null,\"prodPartSet\":"+prodPartSet+"," +
                            "\"platformType\":\""+platformType+"\",\"needEnv\":null,\"needModel\":null}")
                    .post(Gs_match_get3DModelInfoNewTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),200);
        }else if (flag == 2){
            Response response = given()
                    .contentType("application/json")
                    .body("{\"prodCode\":\""+prodCode+"\",\"mainFabricCode\":null,\"prodPartSet\":"+prodPartSet+"," +
                            "\"platformType\":\""+platformType+"\",\"needEnv\":null,\"needModel\":null}")
                    .post(Gs_match_get3DModelInfoNewTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }else {
            Response response = given()
                    .contentType("application/json")
                    .auth().oauth2(UrlConfig.access_token)
                    .body("{\"prodCode\":\""+prodCode+"\",\"mainFabricCode\":null,\"prodPartSet\":"+prodPartSet+"," +
                            "\"needEnv\":null,\"needModel\":null}")
                    .post(Gs_match_get3DModelInfoNewTest_url);
            response.prettyPrint();
            Assert.assertEquals(response.getStatusCode(),404);
        }
    }
}
