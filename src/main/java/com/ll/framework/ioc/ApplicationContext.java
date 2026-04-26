package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    public ApplicationContext() {

    }

    public <T> T genBean(String beanName) {
        TestPostService testPostService = new TestPostService();
        return (T) testPostService;
    }
}
