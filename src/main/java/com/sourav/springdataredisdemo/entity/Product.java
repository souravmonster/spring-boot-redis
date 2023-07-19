package com.sourav.springdataredisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RedisHash("Product")
public class Product implements Serializable {
    private static final long serialVersionUID = 9114425563064791934L;
    @Id
    private int id;
    private String name;
    private int quantity;
    private long price;
}
