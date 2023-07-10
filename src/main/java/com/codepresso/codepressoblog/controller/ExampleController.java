package com.codepresso.codepressoblog.controller;

import com.codepresso.codepressoblog.model.ExampleResVO;
import com.codepresso.codepressoblog.model.ExampleSearchReqVO;
import com.codepresso.codepressoblog.service.ExampleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@Validated
@RequestMapping("/loa/items")
public class ExampleController {
    private final ExampleService exampleService;

    // React router = https://velog.io/@velopert/react-router-v6-tutorial
    // Biglol github = https://github.com/biglol10

//    @Operation(
//            summary = "브랜드 컨텐츠 전체 조회",
//            description = "브랜드 컨텐츠 전체 조회",
//            tags = {"BrandContents"})
    @GetMapping(path = "/v1/contents")
    public List<ExampleResVO> getBrandContents(
            @Valid
            ExampleSearchReqVO brandContentsSearchReqVO) {
        return exampleService.getExampleContents(brandContentsSearchReqVO);
    }
}
