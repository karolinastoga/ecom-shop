package com.ecom_shop.products.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/product")
public class ProductController {

    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "Udało się";
    }
}
