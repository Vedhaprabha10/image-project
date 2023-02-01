package com.example.project.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter

public class Pdf {
    Long id;
    String name;
    MultipartFile logo;
    byte[] data;

}
