package com.sky.user.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-10-23 15:52
 **/
@Builder
@Data
@AllArgsConstructor
public class PageVO<T> {

    private Long totalRecordsNum;

    private Long totalPageNum;

    private List<T> data;
}
