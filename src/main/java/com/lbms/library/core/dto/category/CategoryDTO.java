package com.lbms.library.core.dto.category;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDTO extends CategorySummaryDTO {

    private String description;

    private String updatedBy;

    private Date updatedDate;
}
