package com.wlgzs.huipeasant.controller;

import com.wlgzs.huipeasant.base.BaseController;
import com.wlgzs.huipeasant.service.CollectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author:胡亚星
 * @createTime 2018-07-18 17:16
 * @description:
 **/
@Controller
@RequestMapping("CollectionController")
public class CollectionController extends BaseController {

    //添加收藏
    @RequestMapping("/addCollectionVideo")
    public ModelAndView addCollectionVideo(long userId,long videoId){
        collectionService.collectionVideo(userId,videoId);
        return new ModelAndView("redirect:/VideoController/detailsVideo?videoId="+videoId);
    }

    //删除收藏
    @RequestMapping("/deleteCollection")
    public ModelAndView deleteCollection(long collectionId,long userId){
        collectionService.deleteCollection(collectionId);
        return new ModelAndView("index");
    }

}
