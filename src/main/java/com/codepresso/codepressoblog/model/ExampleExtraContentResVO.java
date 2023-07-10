package com.codepresso.codepressoblog.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@SuperBuilder
public class ExampleExtraContentResVO {
    private Integer id;

    private String name;

    private String title;

    private String extra1;
}
