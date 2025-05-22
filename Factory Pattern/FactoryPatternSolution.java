
// interface ModeOfTransport {
//     public void send();
// }

// class ByAir implements ModeOfTransport {
//     public void send() {
//         System.out.println("Sending by air");
//     }
// }

// class ByRoad implements ModeOfTransport {
//     public void send() {
//         System.out.println("Sending by Road");
//     }
// }

// class ByRailways implements ModeOfTransport {
//     public void send() {
//         System.out.println("Sending by Railways");
//     }
// }

// class LogisticFacory {
//     public static ModeOfTransport chooseMode(String mode) {
//         if (mode == "Air") {
//             return new ByAir();
//         } else if (mode == "Railways") {
//             return new ByRailways();
//         }
//         return new ByRoad();

//     }
// }

// class LogisticService {
//     public void sendVia(String mode) {
//         ModeOfTransport m = LogisticFacory.chooseMode(mode);
//         m.send();
//     }
// }

// public class FactoryPatternSolution {
//     public static void main(String[] args) {
//         LogisticService o = new LogisticService();
//         o.sendVia("Railways");
//     }
// }
// /*

//  */
