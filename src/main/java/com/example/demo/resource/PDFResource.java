package com.example.demo.resource;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.PDFService;

@RestController
public class PDFResource {

		@Autowired
		private PDFService pdfService;
	
		
		@GetMapping("/extract-words")
	    public ResponseEntity<List<String>> extractWordsFromPdf() {
	        try {
	            List<String> words = pdfService.extractWordsFromPdf();
	            return ResponseEntity.ok(words);
	        } catch (IOException e) {
	            return ResponseEntity.status(500).body(List.of("Error processing file: " + e.getMessage()));
	        }
	    }
		
		
}
