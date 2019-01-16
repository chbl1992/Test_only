package com.qishon.utils;

import com.qishon.test.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFiles {

    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);
    public static String getUrl(InterfaceName name){
        String base_address = bundle.getString("base_url");
        String uri = "";
        if(name == InterfaceName.GETTOKEN){
            uri = bundle.getString("getToken_url");
        }
        if (name == InterfaceName.GS_SYS_SHOPLOGIN){
            uri = bundle.getString("gs_sys_shopLogin_url");
        }
        if (name == InterfaceName.GS_SYS_AMDPWD){
            uri = bundle.getString("gs_sys_amdpwd_url");
        }
        if (name == InterfaceName.MAT_MDL_GETNAVCLASSLIST){
            uri = bundle.getString("mat_mdl_getNavClassList_url");
        }
        if (name == InterfaceName.GS_SYS_GETPERSONINFOBYJOB){
            uri = bundle.getString("gs_sys_getPersoninFobyJob_url");
        }
        if (name == InterfaceName.GS_SYS_REGDEVICEINF){
            uri = bundle.getString("gs_sys_regDeviceInf_url");
        }
        if (name == InterfaceName.GS_PROD_LIST){
            uri = bundle.getString("gs_prod_list_url");
        }
        if (name == InterfaceName.GS_PROD_GETPRODINFO){
            uri = bundle.getString("gs_prod_getProdInfo_url");
        }
        if (name ==InterfaceName.GS_PROD_GETPRODORDDETAIL){
            uri = bundle.getString("gs_prod_getProdOrdDetail_url");
        }
        if (name == InterfaceName.GS_MATCH_GETFITPRODINFONEW){
            uri = bundle.getString("gs_match_getFitProdInfoNew_url");
        }
        if (name == InterfaceName.GS_MATCH_GET3DMODELINFONEW){
            uri = bundle.getString("gs_match_get3DModelInfoNew_url");
        }
        if (name == InterfaceName.GS_MATCH_GETFITPRODRENDERNEW){
            uri = bundle.getString("gs_match_getFitProdRenderNew_url");
        }
        if (name == InterfaceName.GS_PROD_GETREGIONBYTYPE){
            uri = bundle.getString("gs_prod_getRegionByType_url");
        }
        if (name == InterfaceName.GS_PROD_GETREPLACEPART){
            uri = bundle.getString("gs_prod_getReplacePart_url");
        }
        if (name == InterfaceName.GS_MAS_FILTERPRODFABRICATTR){
            uri = bundle.getString("gs_mas_filterProdFabRicattr_url");
        }
        if (name == InterfaceName.GS_PROD_DETAIL){
            uri = bundle.getString("gs_prod_detail_url");
        }
        if (name == InterfaceName.GS_PROD_GETPRODREGIONBYPRINT){
            uri = bundle.getString("gs_prod_getProdRegionByPrint_url");
        }
        if (name == InterfaceName.GS_PROD_GETPRINTBYREGION){
            uri = bundle.getString("gs_prod_getPrintByRegion_url");
        }
        if (name == InterfaceName.GS_MAS_GETEMBCUSTOMLIST){
            uri = bundle.getString("gs_mas_getEMBCustomList_url");
        }
        if (name == InterfaceName.GS_CUS_SAVECUSTOM){
            uri = bundle.getString("gs_cus_saveCustom_url");
        }
        if (name == InterfaceName.GS_CUS_GETCUSTOMLIST){
            uri = bundle.getString("gs_cus_getCustomList_url");
        }
        String testUrl = base_address + uri;
        return testUrl;
    }
}
