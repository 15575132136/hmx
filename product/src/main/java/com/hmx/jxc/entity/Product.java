package com.hmx.jxc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 14051
 * @date 2023/6/3
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {


    private String productId;

    private String productName;

    private String userId;

    private String createTime;

    private String updateTime;

    private String typeId;





}
