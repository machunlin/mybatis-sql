//package com.vipmro.vipmro_sql;
//
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.FileOutConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
//import com.baomidou.mybatisplus.generator.config.rules.DbType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import org.junit.jupiter.api.Test;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * AthenaGenerator
// *
// * @author wmt
// * @date 2018/2/22
// */
//public class PayGenerator {
//
//    private static final SimpleDateFormat YYYYMD = new SimpleDateFormat("yyyy/M/d");
//    private static final String BASE_PACKAGE = "net.vipmro.athena";// "net.vipmro.hades";
//    private static final String OUT_PACKAGE = BASE_PACKAGE + ".directory.service";
//    private static final String DATA_BASE = "vipmro_dir";
////    private static final String BASE_PACKAGE = "net.vipmro.athena";
////    private static final String OUT_PACKAGE = BASE_PACKAGE + ".directoryservice";
////    private static final String DATA_BASE = "vipmro_dir";
//
//    /**
//     * <p>
//     * MySQL 生成演示
//     * </p>
//     */
//    @Test
//    public void generatorTest() {
//        //System.out.println(new File(getOutFile(),"/src/main/java").getPath());
//        build();
//    }
//
//    private void build(){
//        // 代码生成器
//        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
//                // 全局配置
//                new GlobalConfig()
//                        .setOpen(false) //关闭打开浏览器
//                        .setOutputDir("src\\main\\java")//输出目录
//                        .setFileOverride(true)// 是否覆盖文件
//                        .setActiveRecord(true)// 开启 activeRecord 模式
//                        .setEnableCache(false)// XML 二级缓存
//                        .setBaseResultMap(true)// XML ResultMap
//                        .setBaseColumnList(true)// XML columList
//                        .setAuthor("wmt")
//                        .setServiceName("%sService")
//        ).setDataSource(
//                // 数据源配置
//                new DataSourceConfig()
//                        .setDbType(DbType.MYSQL)// 数据库类型
//                        .setTypeConvert(new MySqlTypeConvert() {
//                            // 自定义数据库表字段类型转换【可选】
//                            @Override
//                            public DbColumnType processTypeConvert(String fieldType) {
//                                System.out.println("转换类型：" + fieldType);
//                                // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
//                                //    return DbColumnType.BOOLEAN;
//                                // }
//                                return super.processTypeConvert(fieldType);
//                            }
//                        })
//                        .setDriverName("org.mariadb.jdbc.Driver")
//                        .setUsername("root")
//                        .setPassword("password")
//                        .setUrl("jdbc:mariadb://192.168.1.85:3306/"+DATA_BASE+"?useUnicode=true&amp;characterEncoding=UTF8")
//        ).setStrategy(
//                // 策略配置
//                new StrategyConfig()
//                        // .setCapitalMode(true)// 全局大写命名
//                        // .setDbColumnUnderline(true)//全局下划线命名
//                        .setTablePrefix(new String[]{"sys_","pub_","t_"})// 此处可以修改为您的表前缀
//                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
//                        // .setInclude(new String[] { "user" }) // 需要生成的表
//                        .setExclude(new String[]{"flyway_schema_history"}) // 排除生成的表
//                        // 自定义实体父类
//                        .setSuperEntityClass("net.vipmro.athena.boot.starter.model.BaseModel")
////                        // 自定义实体，公共字段
////                        .setSuperEntityColumns(new String[]{"id","create_at","create_by","update_at","update_by"})
////                        .setTableFillList(tableFillList)
//                        .setRestControllerStyle(true) //@RestController
//                        // 自定义 mapper 父类
////                .setSuperMapperClass("com.baomidou.demo.TestMapper")
//                        // 自定义 service 父类
//                        .setSuperServiceClass("net.vipmro.athena.principal.starter.mybatisplus.service.BaseService")
//                        // 自定义 service 实现类父类
//                        .setSuperServiceImplClass("net.vipmro.athena.principal.starter.mybatisplus.service.impl.BaseServiceImpl")
//                        // 自定义 controller 父类
//                        .setSuperControllerClass("net.vipmro.athena.boot.starter.controller.BaseController")
//                // 【实体】是否生成字段常量（默认 false）
//                // public static final String ID = "test_id";
//                // .setEntityColumnConstant(true)
//                // 【实体】是否为构建者模型（默认 false）
//                // public User setName(String name) {this.name = name; return this;}
//                // .setEntityBuilderModel(true)
//                // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
//                // .setEntityLombokModel(true)
//                // Boolean类型字段是否移除is前缀处理
//                // .setEntityBooleanColumnRemoveIsPrefix(true)
//                // .setControllerMappingHyphenStyle(true)
//        ).setPackageInfo(
//                // 包配置
//                new PackageConfig()
//                        //.setModuleName("directoryservice")
//                        .setParent(OUT_PACKAGE)// 自定义包路径
//                        .setController("controller")// 这里是控制器包名，默认 web
//                        .setEntity("model") //这里是实体类包名,默认 entity
//        ).setCfg(
//                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
//                new InjectionConfig() {
//                    @Override
//                    public void initMap() {
//                        Map<String, Object> map = new HashMap<>();
//                        map.put("date",YYYYMD.format(System.currentTimeMillis()));
//                        map.put("uid",RandomNum.create());
//                        this.setMap(map);
//                    }
//                }.setFileOutConfigList(Collections.<FileOutConfig>singletonList(new FileOutConfig("/templates/mapper.xml.vm") {
//                    // 自定义输出文件目录
//                    @Override
//                    public String outputFile(TableInfo tableInfo) {
//                        return "src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
//                    }
//                }))
////        ).setTemplate(
////                // 关闭默认 xml 生成，调整生成 至 根目录
////                new TemplateConfig().setXml(null)
////                // 自定义模板配置，模板可以参考源码 /mybatis-plus/src/main/resources/template 使用 copy
////                // 至您项目 src/main/resources/template 目录下，模板名称也可自定义如下配置：
////                // .setController("...");
////                // .setEntity("...");
////                // .setMapper("...");
////                // .setXml("...");
////                // .setService("...");
////                // .setServiceImpl("...");
//        );
//        // 执行生成
//        mpg.execute();
//
//        // 打印注入设置，这里演示模板里面怎么获取注入内容【可无】
//        // System.err.println(mpg.getCfg().getMap().get("over"));
//    }
//
//    private File getOutFile(){
//        String file = getClass().getResource("/").getFile();
//        return new File(file.substring(1,file.indexOf("/target/test-classes")));
//    }
//}