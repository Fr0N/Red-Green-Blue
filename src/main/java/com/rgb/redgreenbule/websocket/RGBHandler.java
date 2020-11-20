package com.rgb.redgreenbule.websocket;

import com.rgb.redgreenbule.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

public class RGBHandler implements WebSocketHandler {

    @Autowired
    private ColorService colorService;

    @Override
    public Mono<Void> handle(WebSocketSession session) {
        return session
                .send( session.receive()
                        .flatMap(msg -> colorService.handleRGBValue( msg.getPayloadAsText()))
                        .map(session::textMessage)
                );
    }
}
