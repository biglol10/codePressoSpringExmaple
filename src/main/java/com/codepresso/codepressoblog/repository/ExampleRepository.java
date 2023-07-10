package com.codepresso.codepressoblog.repository;

import com.codepresso.codepressoblog.model.ExampleResVO;
import com.codepresso.codepressoblog.model.ExampleSearchReqVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExampleRepository {
    List<ExampleResVO> getExampleList(ExampleSearchReqVO exampleSearchReqVO);
}
