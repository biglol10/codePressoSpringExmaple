package com.codepresso.codepressoblog.model;

import com.codepresso.codepressoblog.controller.dto.PostRequestDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@Builder
public class ExampleExtraContentReqVO {
    private Integer id;

    private String name;

    private String title;

    private List<PostRequestDto> postRequestDtoList;
}
