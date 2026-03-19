package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {

        // --- SERVIÇO 1: Estoque (Porta 8085) ---
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        System.out.println("Serviço de Estoque publicado na porta 8085!");

        // --- SERVIÇO 2: Aviso (Porta 8086) ---
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();
        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);
        System.out.println("Serviço de Aviso publicado na porta 8086!");

    }
}