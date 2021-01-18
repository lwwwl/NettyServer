package com.example.nettyserver.netty.handler;

import com.example.nettyserver.netty.annotations.RequestHandler;
import com.example.nettyserver.netty.protocol.request.LogoutRequestPacket;
import com.example.nettyserver.netty.protocol.response.LogoutResponsePacket;
import com.example.nettyserver.netty.util.SessionUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.springframework.stereotype.Component;

@Component
@RequestHandler(name = "LOGOUT_REQUEST")
@ChannelHandler.Sharable
public class LogoutRequestHandler extends SimpleChannelInboundHandler<LogoutRequestPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutRequestPacket msg){
        SessionUtil.unBindSession(ctx.channel());
        LogoutResponsePacket logoutResponsePacket = new LogoutResponsePacket();
        logoutResponsePacket.setSuccess(true);
        ctx.channel().writeAndFlush(logoutResponsePacket);
    }

}
