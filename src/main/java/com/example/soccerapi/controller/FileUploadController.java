package com.example.soccerapi.controller;

import com.example.soccerapi.emtity.ResponseObject;
import com.example.soccerapi.service.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("api/FileUpload")
public class FileUploadController {
    @Autowired
    private IStorageService iStorageService;

    @PostMapping("")
    public ResponseEntity<ResponseObject> upLoadFile(@RequestParam("file") MultipartFile file) {
        try {
            String generatedFileName = iStorageService.storeFile(file);
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("OK", "upload file SUCCESSFULL", generatedFileName));

        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseObject("false", ex.toString(), ""));

        }
    }
    @GetMapping("/files/{fileName:.+}")
    //fae95a5abba84029ae9f6d318dba8acc.png
    public  ResponseEntity<byte[]> readDetailFile(@PathVariable String fileName){
        try{
            byte[] bytes = iStorageService.readFileContent(fileName);
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(bytes);
        }
        catch (Exception e){
            return ResponseEntity.noContent().build();
        }
    }

}
