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

// public class Main {

//     public static void main(String[] args) {
//         int accountId = 12345;
//         String seatNumber = "A1";
//         int ammount = 500;

//         PaymentService paymentService = new PaymentService();
//         SeatReservationService seatReservationService = new SeatReservationService();
//         TicketService ticketService = new TicketService();
//         NotificationService notificationService = new NotificationService();
//         LoyltyPointsService loyltyPointsService = new LoyltyPointsService();
//         paymentService.Pay(ammount, accountId);
//         seatReservationService.ReserveSeat(seatNumber, accountId);
//         ticketService.generateTicket(seatNumber, accountId);
//         notificationService.Notify("Your seat " + seatNumber + " is reserved and ticket is generated.", accountId);
//         loyltyPointsService.addLoyaltyPoints(10, accountId);
//     }
// }
// /*
//  in above code problem is that client side needs to call multiple services to complete a single task.
//  in industries we use Facade design pattern to solve this problem.
// The Facade pattern provides a simplified interface to a complex subsystem, allowing clients to interact with the system without needing to understand its complexities.
// just give 1 api to client side and it will call all the services internally.
// This pattern is particularly useful when dealing with complex systems or libraries, as it helps to reduce dependencies and makes the code easier to maintain and understand.


//  */