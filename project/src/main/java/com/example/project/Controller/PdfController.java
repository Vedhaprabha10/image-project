package com.example.project.Controller;

import com.example.project.DTO.Pdf;
import com.example.project.Service.PdfService;
import com.example.project.Util.ApplicationConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class PdfController {
    @Autowired
    PdfService pdfService;
    @PostMapping("/upload")
    public ResponseEntity<?> uploadPdf(@ModelAttribute("pdf") Pdf pdf){
    pdfService.upload(pdf);
    return ResponseEntity.status(HttpStatus.CREATED).body(ApplicationConstants.PDF_ADDED_SUCCESSFULLY);
    }
}
