package com.hmx.jxc.controller;

import com.hmx.jxc.entity.Product;
import com.hmx.jxc.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 14051
 * @date 2023/6/1
 **/
@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {


    @Autowired
    private ProductService productService;

    @RequestMapping("/getList")
    public List<Product> getList(){
        log.info("sadashfasifhas");
        return productService.list();
    }


}
