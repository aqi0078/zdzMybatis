//package com.zdz.db.redis.template;
//
//import net.youqu.pay.entity.PayVipCombo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import org.springframework.stereotype.Repository;
//
///**
// * @author zhangdezhi
// * @date 2020-04-03
// */
//
//@Repository
//public class PayVipComboTemplate extends RedisTemplate<String, PayVipCombo> {
//    @Autowired
//    public PayVipComboTemplate(@Qualifier("jedisConnectionFactoryVip") RedisConnectionFactory connectionFactory) {
//        RedisSerializer<String> stringSerializer = new StringRedisSerializer();
//        Jackson2JsonRedisSerializer<PayVipCombo> Jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<PayVipCombo>(PayVipCombo.class);
//        setKeySerializer(stringSerializer);
//        setValueSerializer(Jackson2JsonRedisSerializer);
//        setHashKeySerializer(stringSerializer);
//        setHashValueSerializer(Jackson2JsonRedisSerializer);
//        setConnectionFactory(connectionFactory);
//        afterPropertiesSet();
//    }
//}
