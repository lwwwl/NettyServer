package com.example.nettyserver.netty.codec;

import com.example.nettyserver.netty.protocol.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import javax.annotation.Resource;
import java.util.List;

public class PacketDecoder extends ByteToMessageDecoder {

    @Resource
    PacketCodeC packetCodeC;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List out){
        out.add(packetCodeC.decode(in));
    }

}
