package com.example;

import org.springframework.data.annotation.Id;

/**
 * Created by sasha on 11/8/16.
 */
public class Asset extends com.example.types.Asset {
    @Id
    String id;
}
