package com.netease.zzx.tools;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzongxing on 2017/4/19.
 */
public class EduosJacksonUtil {
    private static final ObjectMapper deserializationMapper=new ObjectMapper().
            configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).registerModule(new AfterburnerModule());
    private static final ObjectMapper serializationMapper=new ObjectMapper().registerModule(new AfterburnerModule());
    
    public static  <T> T getObjectFromJson(String json , Class<T> type) {
        try {
            if (StringUtils.isBlank(json)) {
                return null;
            }
            return deserializationMapper.readValue(json,type);
        } catch (Exception e) {
            throw new RuntimeException("JSON转Object出错", e);
        }
    }
    
    public static <T> T getObjectFromJson(String json, TypeReference<T> typeReference){
        if (StringUtils.isBlank(json)) {
            return null;
        }
        
        try {
            return deserializationMapper.readValue(json, typeReference);
        } catch (Exception e){
            throw new RuntimeException("JSON转Object出错", e);
        }
    }
    
    public static JsonNode getJsonNode(String json) {
        try {
            if (StringUtils.isBlank(json)) {
                return null;
            }
            return deserializationMapper.readTree(json);
        } catch (Exception e) {
            throw new RuntimeException("JSON转JsonNode出错,json:" + json, e);
        }
    }

    public static <T> List<T> getListFromJson(String json , Class<T> itemType) {
        try {
            if (StringUtils.isBlank(json)) {
                return null;
            }
            JavaType listType = deserializationMapper.getTypeFactory().constructCollectionType(ArrayList.class, itemType);
            return deserializationMapper.readValue(json, listType);
        } catch (Exception e) {
            throw new RuntimeException("JSON转Object出错", e);
        }

    }

    public static String toJsonString(Object obj) {
        try {
            return serializationMapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException("Object转JSON出错", e);
        }
    }

    public static byte[] writeObjectAsBytes(Object object) {
        try {
            return serializationMapper.writeValueAsBytes(object);
        } catch (Exception e) {
            throw new RuntimeException("Object转Byte出错", e);
        }
    }

    public static <T> T getObjectFromBytes(byte[] bytes, Class<T> type){
        try {
            return deserializationMapper.readValue(bytes, type);
        } catch (Exception e) {
            throw new RuntimeException("Byte转Object出错", e);
        }
    }
}
