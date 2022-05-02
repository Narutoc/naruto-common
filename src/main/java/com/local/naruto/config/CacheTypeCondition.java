//package com.local.naruto.config;
//
//import org.springframework.context.annotation.Condition;
//import org.springframework.context.annotation.ConditionContext;
//import org.springframework.core.type.AnnotatedTypeMetadata;
//
//public class CacheTypeCondition implements Condition {
//
//    @Override
//    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        String cacheType = context.getEnvironment().getProperty("spring.cache.type");
//        return cacheType != null && cacheType.equals("redis");
//    }
//}
