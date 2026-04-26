package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    public TestPostRepository testPostRepository;
    public TestPostService testPostService;

    public ApplicationContext() {
        testPostRepository = new TestPostRepository();
        testPostService = new TestPostService();
    }

    public <T> T genBean(String beanName) {
        return (T) switch(beanName){
            case("testPostService") -> testPostService;
            case("testPostRepository") -> testPostRepository;
            default -> null;
        };
    }
}
