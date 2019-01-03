package com.zhuhao.eshop.controller;

import com.zhuhao.eshop.entity.Product;
import com.zhuhao.eshop.service.ProductService;
import com.zhuhao.eshop.serviceImpl.CategoryImpl;
import com.zhuhao.eshop.serviceImpl.ProductServiceImpl;
import com.zhuhao.eshop.serviceImpl.StockServiceImpl;
import com.zhuhao.eshop.serviceImpl.TypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductServiceImpl productService;

    @Autowired
    StockServiceImpl stockService;

    @Autowired
    CategoryImpl category;

    @Autowired
    TypeServiceImpl typeService;

    //映射 index.html主页
    @RequestMapping(value = {"/","/index"})
    public String index(HttpSession session, HttpServletRequest request){
        session.setAttribute("productlist", productService.selectProductLimit());
        session.setAttribute("categorylist",category.selectAllCategory());
        session.setAttribute("typelist",typeService.selectAllType());
        return "/index";
    }

    //查询所有数据记录 ajax
    @ResponseBody
    @RequestMapping(value = "/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.selectAllProduct();
    }

    //根据ID查询产品信息
    @RequestMapping(value = "/getproductById/{productId}/{categoryId}")
    public String getproductById(@PathVariable(value = "productId",required = false) Integer productId,
                                 @PathVariable(value = "categoryId",required = false) Integer categoryId,HttpSession session){

        session.setAttribute("category",category.selectBycategoryId(categoryId));
        Product product = new Product();
        product.setProductId(productId);
        //商品信息
        session.setAttribute("product",productService.selectProductById(product));
        //库存信息
        session.setAttribute("quantity",stockService.selectStockByPId(product).getQuantity());
        return "redirect:/detail";
    }

    //模糊搜索产品
    @ResponseBody
    @RequestMapping("/searchlikeproduct")
    public List<Product> searchlikeproduct(@RequestParam(value = "data",required = false)String data){
        System.out.println(data);
        String description = data.trim();
        System.out.println(productService.selectlikeProduct(description));
        return productService.selectlikeProduct(description);
    }
}
