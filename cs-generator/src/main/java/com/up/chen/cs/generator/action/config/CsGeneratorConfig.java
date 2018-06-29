package com.up.chen.cs.generator.action.config;

import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
* @Description: 默认的代码生成的配置
* @author chenchen
* @date 2018/6/28 9:02
*/
public class CsGeneratorConfig extends AbstractGeneratorConfig {

    protected void globalConfig() {
        globalConfig.setOutputDir("D:\\idea\\mypros\\cs\\cs-admin\\src\\main\\java");
        globalConfig.setFileOverride(true);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setOpen(false);
        globalConfig.setAuthor("chenchen");
    }

    protected void dataSourceConfig() {
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("111111");
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/cs?characterEncoding=utf8");
    }

    protected void strategyConfig() {
        //strategyConfig.setTablePrefix(new String[]{"sys_"});// 此处可以修改为您的表前缀
        strategyConfig.setInclude(new String[]{"sys_order"});
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
    }

    protected void packageConfig() {
        packageConfig.setParent(null);
        packageConfig.setEntity("com.up.chen.cs.common.system.model");
        packageConfig.setMapper("com.up.chen.cs.common.system.dao");
        packageConfig.setXml("com.up.chen.cs.common.system.dao.mapping");
    }

    protected void contextConfig() {
        contextConfig.setProPackage("com.up.chen.cs.admin");
        contextConfig.setCoreBasePackage("com.up.chen.cs.core");
        contextConfig.setBizChName("订单管理");
        contextConfig.setBizEnName("order");
        contextConfig.setModuleName("system");
        contextConfig.setProjectPath("D:\\idea\\mypros\\cs\\cs-admin");//写自己项目的绝对路径
        contextConfig.setEntityName("SysOrder");
        sqlConfig.setParentMenuName(null);//这里写已有菜单的名称,当做父节点

        /**
         * mybatis-plus 生成器开关
         */
        contextConfig.setEntitySwitch(true);
        contextConfig.setDaoSwitch(true);
        contextConfig.setServiceSwitch(true);

        /**
         * cs 生成器开关
         */
        contextConfig.setControllerSwitch(true);
        contextConfig.setIndexPageSwitch(true);
        contextConfig.setAddPageSwitch(true);
        contextConfig.setEditPageSwitch(true);
        contextConfig.setJsSwitch(true);
        contextConfig.setInfoJsSwitch(true);
        contextConfig.setSqlSwitch(true);
    }

    @Override
    protected void config() {
        globalConfig();
        dataSourceConfig();
        strategyConfig();
        packageConfig();
        contextConfig();
    }
}
