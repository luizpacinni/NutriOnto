/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

/**
 *
 * @author luiz
 */
import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class Publicador {

    public static void main(String[] args) throws IllegalArgumentException, IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:8080/");
        server.start();
    }
}
