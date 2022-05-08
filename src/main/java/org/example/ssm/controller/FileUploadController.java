package org.example.ssm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author why
 * @date 2022/4/25
 */
@RestController
public class FileUploadController {
    @PostMapping("/uploadMulti")
    public void upload(MultipartFile[] multipartFiles) throws IOException {
        for (MultipartFile multipartFile : multipartFiles) {
            String name = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("C:/tmp/" + name));
        }

    }
}
