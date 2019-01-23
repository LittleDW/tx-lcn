package com.codingapi.txlcn.tc.config;

import com.codingapi.txlcn.tc.TCAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Description: 允许分布式事务的注解
 * Date: 1/19/19
 *
 * @author ujued
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(TCAutoConfiguration.class)
public @interface EnableDistributedTransaction {

}
