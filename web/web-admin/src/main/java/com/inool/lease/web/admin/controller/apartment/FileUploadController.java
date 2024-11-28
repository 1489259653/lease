package com.inool.lease.web.admin.controller.apartment;



import com.inool.lease.common.result.Result;
import com.inool.lease.web.admin.service.FileService;
import io.minio.*;
import io.minio.errors.*;
import io.minio.errors.InsufficientDataException;
import io.minio.errors.ServerException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;

@Tag(name = "文件管理")
@RequestMapping("/admin/file")
@RestController
public class FileUploadController {
    @Autowired
    private FileService service;
    @Operation(summary = "上传文件")
    @PostMapping("upload")
    public Result<String> upload(@RequestParam MultipartFile file)throws ServerException, InsufficientDataException,
            ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
            String url = service.upload(file);
            return Result.ok(url);
    }

}
