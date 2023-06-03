package com.hmx.jxc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hmx.jxc.entity.Product;
import com.hmx.jxc.mapper.ProductMapper;
import com.hmx.jxc.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author 14051
 * @date 2023/6/3
 **/
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService{
}
