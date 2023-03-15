package com.lbms.library.core.dto.category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class CategorySummaryDTO {
    private String id;

    private String category;

    private String createdBy;

    private Date createdDate;
}
