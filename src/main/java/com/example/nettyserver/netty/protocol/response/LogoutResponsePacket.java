package com.example.nettyserver.netty.protocol.response;

import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;

import static com.example.nettyserver.netty.protocol.command.Command.LOGOUT_RESPONSE;

@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
