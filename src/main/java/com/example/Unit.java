package com.example;

import org.springframework.data.annotation.Id;

/**
 * Created by sasha on 11/8/16.
 */
public class Unit extends com.example.types.Unit {
    @Id
    String id;
}
