package com.bonc.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/25.9:05
 */
@Component
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
    }

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
        super.configurePathMatch(configurer);
    }
}
