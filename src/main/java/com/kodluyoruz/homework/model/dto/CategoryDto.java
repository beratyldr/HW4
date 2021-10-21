package com.kodluyoruz.homework.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private int id;
    private String name;
    private Integer parentId;
//    private CategoryDto parentCategory;
}
