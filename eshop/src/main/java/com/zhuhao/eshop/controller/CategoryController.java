package com.zhuhao.eshop.controller;

import com.zhuhao.eshop.serviceImpl.CategoryImpl;
import com.zhuhao.eshop.serviceImpl.TypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CategoryController {
    @Autowired
    CategoryImpl category;

    @Autowired
    TypeServiceImpl typeService;


    @RequestMapping("/categorylist")
    public String categorylist(HttpSession session) {
        session.setAttribute("typelist",typeService.selectAllType());
        return "categorylist";
    }

    @RequestMapping("/selectCategoryId/{categoryId}")
    public String selectCategoryId(@PathVariable(value = "categoryId",required = false) int categoryId,HttpSession session){
        session.setAttribute("productlist",category.selectproductByCategoryId(categoryId));
        return "redirect:/categorylist";
    }
}
