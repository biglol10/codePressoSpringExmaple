package com.codepresso.codepressoblog.model;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@Builder
public class ExampleResVO {
    private Integer id;

    private String code;

    private String title;


}
