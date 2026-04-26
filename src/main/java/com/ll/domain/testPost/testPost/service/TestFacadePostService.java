package com.ll.domain.testPost.testPost.service;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.framework.ioc.ApplicationContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestFacadePostService {
    private final TestPostService testPostService = ApplicationContext.testPostService;
    private final TestPostRepository testPostRepository = ApplicationContext.testPostRepository;
}
