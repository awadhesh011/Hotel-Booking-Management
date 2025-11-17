package com.booking.HotelManagement.service.interface1;

import com.booking.HotelManagement.dto.LoginRequest;
import com.booking.HotelManagement.dto.Response;
import com.booking.HotelManagement.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
