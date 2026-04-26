package com.ll.framework.ioc;

import com.ll.domain.testPost.testPost.repository.TestPostRepository;
import com.ll.domain.testPost.testPost.service.TestFacadePostService;
import com.ll.domain.testPost.testPost.service.TestPostService;

public class ApplicationContext {
    public static TestPostRepository testPostRepository;
    public static TestPostService testPostService;
    public static TestFacadePostService testFacadePostService;

    public ApplicationContext() {
        testPostRepository = new TestPostRepository();
        testPostService = new TestPostService();
        testFacadePostService = new TestFacadePostService();
    }

    public <T> T genBean(String beanName) {
        return (T) switch(beanName){
            case("testPostService") -> testPostService;
            case("testPostRepository") -> testPostRepository;
            case("testFacadePostService") -> testFacadePostService;
            default -> null;
        };
    }
}
