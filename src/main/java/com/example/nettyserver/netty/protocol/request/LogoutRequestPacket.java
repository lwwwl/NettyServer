package com.example.nettyserver.netty.protocol.request;

import com.example.nettyserver.netty.annotations.TransmissionPacket;
import com.example.nettyserver.netty.protocol.Packet;
import lombok.Data;

import static com.example.nettyserver.netty.protocol.command.Command.LOGOUT_REQUEST;

@Data
@TransmissionPacket(name = "LOGOUT_REQUEST")
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
