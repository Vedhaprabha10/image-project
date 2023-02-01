package com.example.project.ServiceImpl;

import com.example.project.DTO.Pdf;
import com.example.project.Entity.PdfEntity;
import com.example.project.Repository.PdfRepository;
import com.example.project.Service.PdfService;
import com.example.project.Util.Util;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class PdfServiceImpl implements PdfService {
    @Autowired
    PdfRepository pdfRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void upload(Pdf pdf) {
       PdfEntity pdfEntity = modelMapper.map(pdf,PdfEntity.class);
       try{
            if (Optional.ofNullable(pdf.getData()).isPresent())pdfEntity.setData(Util.compressImage(pdf.getLogo().getBytes()));
            pdfRepo.save(pdfEntity);
       }catch (Exception e) {
           System.out.println("error on uploading");
       }
    }
}
