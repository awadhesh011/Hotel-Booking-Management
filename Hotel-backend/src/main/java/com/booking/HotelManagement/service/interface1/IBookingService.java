package com.booking.HotelManagement.service.interface1;

import com.booking.HotelManagement.dto.Response;
import com.booking.HotelManagement.entity.Booking;

public interface IBookingService {


    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
