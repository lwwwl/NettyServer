package com.example.nettyserver.netty.codec;

import com.example.nettyserver.netty.protocol.Packet;
import com.example.nettyserver.netty.protocol.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import javax.annotation.Resource;

public class PacketEncoder extends MessageToByteEncoder<Packet> {

    @Resource
    PacketCodeC packetCodeC;

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet packet, ByteBuf out){

        // 不需要创建和返回ByteBuf对象，该对象作为参数out自动返回
        packetCodeC.encode(out, packet);

    }

}