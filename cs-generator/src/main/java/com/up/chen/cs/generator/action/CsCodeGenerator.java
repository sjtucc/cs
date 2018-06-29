package com.up.chen.cs.generator.action;


import com.up.chen.cs.generator.action.config.CsGeneratorConfig;

/**
* @Description:
* @author chenchen
* @date 2018/6/28 9:00
*/
public class CsCodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        CsGeneratorConfig csGeneratorConfig = new CsGeneratorConfig();
        csGeneratorConfig.doMpGeneration();

        /**
         * cs的生成器:
         *      cs的代码生成器可以生成controller,html页面,页面对应的js
         */
        csGeneratorConfig.doCsGeneration();
    }

}