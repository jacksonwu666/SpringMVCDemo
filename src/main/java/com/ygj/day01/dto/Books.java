package com.ygj.day01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-17 18:36
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private String bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
