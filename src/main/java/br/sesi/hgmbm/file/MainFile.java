package br.sesi.hgmbm.file;

import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Hannah\\git-repo\\java-aulas-poo\\file.txt";

        ManipuladorArquivo arquivo = new ManipuladorArquivo();
        arquivo.leitor(path);


    }
}
