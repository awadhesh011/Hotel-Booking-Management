package com.booking.HotelManagement.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CloudinaryConfig {
    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dfjuwycuk",
                "api_key", "128214341128399",
                "api_secret", "wTn-DYevZDX9aA6mCOUshx_2uIc"));
    }
}

