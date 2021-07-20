package mthod2;

public class simpleRoomBooking {
    public static void main(String[] args) {
        int year = 2018, month = 2, day = 1; boolean isAvailable = true;

        boolean roomBooking = isAvailable==true && year == 2018 && !(month == 7 && (day < 9 && day >=1));

        System.out.println(roomBooking);
    }

}
/*
To book a room first it needs to be available for rent and make sure its available at
the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018
 */
