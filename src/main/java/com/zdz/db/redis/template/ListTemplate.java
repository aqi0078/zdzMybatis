package com.zdz.db.redis.template;

//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @author zhangdezhi
 * @date 2020-04-03
 */
@Repository
public class ListTemplate extends RedisTemplate<String, String> {
    @Autowired
    public ListTemplate(@Qualifier("jedisConnectionFactoryVip") RedisConnectionFactory connectionFactory) {
        RedisSerializer<String> stringSerializer = new StringRedisSerializer();
        Jackson2JsonRedisSerializer<String> Jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<String>(String.class);
        setKeySerializer(stringSerializer);
        setValueSerializer(Jackson2JsonRedisSerializer);
        setHashKeySerializer(stringSerializer);
        setHashValueSerializer(Jackson2JsonRedisSerializer);
        setConnectionFactory(connectionFactory);
        afterPropertiesSet();
    }

//    private Gson gson=new Gson();
//
//    private JsonParser jsonParser = new JsonParser();
//    public <T> void setList(String key, List<T> list, int expire){
//        if(CollectionUtil.isNotEmpty(list)){
//            String value = gson.toJson(list);
//            this.boundValueOps(key).set(value,expire, TimeUnit.DAYS);
//        }else{
//            list=new ArrayList<>();
//            String value = gson.toJson(list);
//            this.boundValueOps(key).set(value,expire, TimeUnit.MINUTES);
//        }
//    }
//
//
//    public <T> List<T> getList(String key,Class<T> c){
//        String json=this.boundValueOps(key).get();
//
//        if(json !=null && !"null".equals(json)){
//            List<T> list=new ArrayList<>();
//            JsonElement jsonElement = jsonParser.parse(json);
//            JsonArray jsonArray = jsonElement.getAsJsonArray();
//            jsonArray.forEach(new Consumer<JsonElement>() {
//                @Override
//                public void accept(JsonElement t) {
//                    list.add(gson.fromJson(t, c));
//                }
//            });
//            return list;
//        }
//        return null;
//    }



}
