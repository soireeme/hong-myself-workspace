package com.honglei.project.getway.fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author honglei
 * @version 1.0
 * @date 2021/4/2 10:07
 * @desp
 */
@RestController
public class FallBackController {
    /**
     * 全局熔断处理
     * @return
     */
    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("访问超时，请稍后再试!");
    }

    /**
     * demo熔断处理
     * @return
     */
    @RequestMapping("/demo/fallback")
    public Mono<String> fallback2() {
        return Mono.just("访问超时，请稍后再试!");
    }


}
