package com.example.project.Repository;

import com.example.project.Entity.PdfEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PdfRepository extends JpaRepository<PdfEntity ,Long> {
}
