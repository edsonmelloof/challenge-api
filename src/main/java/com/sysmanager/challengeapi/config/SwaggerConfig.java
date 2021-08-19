package com.sysmanager.challengeapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger.yaml", "swagger.html", "swagger-ui-bundle.js",
                "swagger-ui-standalone-preset.js", "swagger-ui.css").
                addResourceLocations("classpath:/swagger/");
        registry.addResourceHandler("logo.png").
                addResourceLocations("classpath:/images/");
    }
}
