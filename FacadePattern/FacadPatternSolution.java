// class PaymentService {
//     public void Pay(int ammount, int accountId) {
//         System.out.println("Pay " + ammount + " rs to Book My Show from account " + accountId);
//     }
// }

// class SeatReservationService {
//     public void ReserveSeat(String seatNumber, int accountId) {
//         System.out.println("Seat " + seatNumber + " is reserved for account " + accountId);
//     }
// }

// class TicketService{
//     public void generateTicket(String seatNumber, int accountId) {
//         System.out.println("Ticket generated for seat " + seatNumber + " for account " + accountId);
//     } 
// }

// class NotificationService {
//     public void Notify(String message, int accountId) {
//         System.out.println("Notification to account " + accountId + ": " + message);
//     }
// }
// class LoyltyPointsService {
//     public void addLoyaltyPoints(int points, int accountId) {
//         System.out.println("Added " + points + " loyalty points to account " + accountId);
//     }
// }

// class BookTicketFasad{
//     PaymentService paymentService;
//     NotificationService notificationService;
//     LoyltyPointsService loyltyPointsService;
//     TicketService ticketService;   
//     SeatReservationService seatReservationService;

//     BookTicketFasad(){
//         paymentService=new PaymentService();
//         notificationService=new NotificationService();
//         loyltyPointsService=new LoyltyPointsService();
//         ticketService=new TicketService();
//         seatReservationService=new SeatReservationService();
//     }

//     public void bookMovieTicket(int _accountId,int _points,String _message,int _ammount,String _seatNumber){
//         paymentService.Pay(_ammount, _accountId);
//         seatReservationService.ReserveSeat(_seatNumber, _accountId);
//         ticketService.generateTicket(_seatNumber, _accountId);
//         notificationService.Notify("Your seat " + _seatNumber + " is reserved and ticket is generated.", _accountId);
//         loyltyPointsService.addLoyaltyPoints(10, _accountId);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         BookTicketFasad bookTicketFasad = new BookTicketFasad();
//         bookTicketFasad.bookMovieTicket(12345, 10, "Your seat is reserved.", 500, "A1");
//     }
// }
// /*
//  now if you notice in above code client side just need to call 1 api to book a movie ticket.
// // This simplifies the client code and reduces the complexity of interacting with multiple services.
// // This pattern is particularly useful when dealing with complex systems or libraries, as it helps to reduce dependencies and makes the code easier to maintain and understand.


// we can add builder pattern to BookTicketFasad class to make it more flexible and easier to use.
// conside we have to add seat of VIP class then we can add a method in BookTicketFasad class like this:
// public BookTicketFasad withVipSeat(String seatNumber) {
//     this.seatReservationService.reserveVipSeat(seatNumber);
//     return this;


//     this is scalable and flexible way to add new features to the facade without changing the existing code.

//     but it breaks single responsibility principle as BookTicketFasad class is now responsible for booking movie tickets and also for reserving VIP seats.
// // To solve this problem we can create a separate class for VIP seat reservation and use it in BookTicketFasad class.
//  */