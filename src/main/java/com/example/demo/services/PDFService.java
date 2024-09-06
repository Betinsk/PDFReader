package com.example.demo.services;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;

@Service
public class PDFService {
	
    public List<String> extractWordsFromPdf() throws IOException {

	 try (PDDocument document = PDDocument.load(new File("C:\\Users\\Instal\\Downloads\\acres.pdf"))) {
         PDFTextStripper pdfStripper = new PDFTextStripper();
         String text = pdfStripper.getText(document);
         System.out.println(text);
         
         
         // Divide o texto em palavras e adiciona à lista
        return Arrays.stream(text.split("\\s+")) // Divide o texto em palavras usando espaços e quebras de linha
                                     .filter(word -> !word.isEmpty()) // Remove palavras vazias
                                     .map(this::cleanWord) // Limpa cada palavra
                                     .collect(Collectors.toList()); // Coleta as palavras em uma lista
      
	 }
	
}

		// Método para remover caracteres especiais e vírgulas
		private  String cleanWord(String word) {
		 // Remove todos os caracteres não alfanuméricos, exceto espaços
		 return word.replaceAll("[^a-zA-Z0-9]", ""); 
		}

}
