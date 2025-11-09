//package com.booking.HotelManagement.service;
//
//import com.booking.HotelManagement.exception.OurException;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//@Service
//public class LocalStorageService {
//
//    // Save image as byte[] for DB
//    public byte[] saveImageToDatabase(MultipartFile file) {
//        try {
//            return file.getBytes(); // directly get bytes for DB
//        } catch (IOException e) {
//            throw new OurException("Failed to read image: " + e.getMessage());
//        }
//    }
//
//    // Load image from DB (byte[]) — in practice, you’ll get this from repository
//    public byte[] loadImageFromDatabase(byte[] imageData) {
//        if (imageData == null || imageData.length == 0) {
//            throw new OurException("Image data is empty");
//        }
//        return imageData;
//    }
//}
