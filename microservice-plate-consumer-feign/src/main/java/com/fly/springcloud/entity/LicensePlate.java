package com.fly.springcloud.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by XianRui on 2020-01-16 9:13
 **/
@Data
@Accessors(chain = true)
public class LicensePlate {
    private Long id;

    private String number;

    private String color;

    private String briefCase;

}
