package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdfReaderApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PdfReaderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}

}
