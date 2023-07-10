package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.model.ExampleResVO;
import com.codepresso.codepressoblog.model.ExampleSearchReqVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ExampleService {
    public List<ExampleResVO> getExampleContents(ExampleSearchReqVO exampleSearchReqVO);
}
