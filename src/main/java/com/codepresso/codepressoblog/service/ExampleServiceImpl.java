package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.model.ExampleResVO;
import com.codepresso.codepressoblog.model.ExampleSearchReqVO;
import com.codepresso.codepressoblog.repository.ExampleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExampleServiceImpl implements ExampleService {
    private final ExampleRepository exampleRepository;

    public ExampleServiceImpl(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ExampleResVO> getExampleContents(ExampleSearchReqVO exampleSearchReqVO) {
        return exampleRepository.getExampleList(exampleSearchReqVO);
    }
}
