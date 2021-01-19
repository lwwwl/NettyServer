package com.example.nettyserver.netty.serializer;

import com.alibaba.fastjson.JSON;
import com.example.nettyserver.netty.annotations.PacketSerializer;

@PacketSerializer(name = "JSONSerializer")
public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }

}