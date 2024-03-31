import java.util.Scanner;
import com.macbook.mycompany.Laptop;
import com.macbook.mycompany.VolumeControl;

public class Main extends Laptop implements VolumeControl {
    private static boolean isLaptopOn = false;
    private int volumeLevel = 0; // Inisialisasi variabel instance

    public static void main(String[] args) {
        Main main = new Main();
        main.runMenu();
    }

    @Override
    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Masukkan perintah (ON/OFF/UP/DOWN/EXIT): ");
            input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "ON":
                    turnOn();
                    break;
                case "OFF":
                    turnOff();
                    break;
                case "UP":
                    increaseVolume();
                    break;
                case "DOWN":
                    decreaseVolume();
                    break;
                case "EXIT":
                    System.out.println("Program berakhir.");
                    break;
                default:
                    System.out.println("Perintah tidak valid.");
            }
        } while (!input.equals("EXIT"));

        scanner.close();
    }

    
    public void turnOn() {
        if (!isLaptopOn) {
            isLaptopOn = true;
            System.out.println("Laptop telah dinyalakan.");
        } else {
            System.out.println("Laptop sudah dalam keadaan menyala.");
        }
    }

    
    public void turnOff() {
        if (isLaptopOn) {
            isLaptopOn = false;
            System.out.println("Laptop telah dimatikan.");
        } else {
            System.out.println("Laptop sudah dalam keadaan mati.");
        }
    }

    @Override
    public void increaseVolume() {
        if (isLaptopOn) {
            volumeLevel++;
            System.out.println("Volume telah ditambah. Volume sekarang: " + volumeLevel);
        } else {
            System.out.println("Laptop harus dinyalakan terlebih dahulu.");
        }
    }

    @Override
    public void decreaseVolume() {
        if (isLaptopOn) {
            if (volumeLevel > 0) {
                volumeLevel--;
                System.out.println("Volume telah dikurangi. Volume sekarang: " + volumeLevel);
            } else {
                System.out.println("Volume sudah minimum.");
            }
        } else {
            System.out.println("Laptop harus dinyalakan terlebih dahulu.");
        }
    }

    // Metode lainnya sesuai kebutuhan

    @Override
    protected void setKendaraan(String merk, String jenis) {
        // Implementasi sesuai kebutuhan
    }

    @Override
    protected void setMerkJenis() {
        // Implementasi sesuai kebutuhan
    }
}