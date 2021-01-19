package com.example.nettyserver.netty.protocol.response;

import com.example.nettyserver.netty.annotations.TransmissionPacket;
import com.example.nettyserver.netty.protocol.Packet;
import com.example.nettyserver.netty.protocol.command.Command;
import lombok.Data;

@Data
@TransmissionPacket(name = "LOGIN_RESPONSE")
public class LoginResponsePacket extends Packet {

    private String userId;

    private String userName;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_RESPONSE;
    }
}
