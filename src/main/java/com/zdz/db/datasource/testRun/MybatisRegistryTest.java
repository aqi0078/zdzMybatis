//package com.zdz.db.datasource.testRun;
//
///**
// * @Description:
// * @Date: 2020/9/7
// */
//@RunWith(SpringRunner.class)
//@ContextConfiguration(
//        classes = {MybatisSpringConfig.class, MybatisConfiguration.class}
//)
//@TestPropertySource(properties = {
//        "mybatis.mapper-locations:classpath:mapper/*.xml",
//        "mybatis.configuration-properties[key]:value",
//        "wbf.mybatis.foo.properties.executor-type:batch",
//        "wbf.mybatis.foo.properties.configuration-properties[key]:value2",
//})
//public class MybatisRegistryTest {
//
//    @Configuration
//    @AutoConfigurationPackage
//    @Import({DataSourceAutoConfiguration.class, MyBatisPerfInterceptor.class})
//    public static class MybatisConfiguration {
//
//        @Bean("fooMybatisConfig")
//        @ConfigurationProperties("wbf.mybatis.foo")
//        public MybatisConfig foo() {
//            return MybatisConfig.builder("foo")
//                    .annotationClass(TestMapper.class)
//                    .nameGenerator((d, r) -> "fooRepository")
//                    .mapperLocations("classpath:foo/*.xml")
//                    .typeAliasesPackage("io.wbf")
//                    .typeHandlersPackage("")
//                    .customizer(configuration -> configuration.addInterceptor(new TestInterceptor()))
//                    .build();
//        }
//
//        @Bean
//        public DataSourceRegistry registry(DataSource dataSource) {
//            return key -> dataSource;
//        }
//    }
