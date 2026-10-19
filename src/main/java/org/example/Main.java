package org.example;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExecutorService executores = Executors.newFixedThreadPool(3);

        List<String> arquivos = List.of("Planilha.excl","Imagem.png","Apresentação.ppxt","Relatório,docx");

        for (String i:arquivos){
            executores.execute(() ->{
                System.out.println("O arquivo "+i+" foi salvo no banco pela Thread "+Thread.currentThread().getName());
            });
        }
        executores.shutdown();
    }
}