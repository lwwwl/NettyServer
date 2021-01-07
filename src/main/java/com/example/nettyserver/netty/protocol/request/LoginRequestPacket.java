package com.example.nettyserver.netty.protocol.request;

import com.example.nettyserver.netty.protocol.Packet;
import com.example.nettyserver.netty.protocol.command.Command;
import lombok.Data;

@Data
public class LoginRequestPacket extends Packet {

    private String userName;

    private String password;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST;
    }
}
