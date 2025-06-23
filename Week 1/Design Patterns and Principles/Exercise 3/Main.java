// File: Main.java
public class Main {
    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder("Intel i3", "8GB").build();

        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .graphicsCard("NVIDIA RTX 3060")
                .storage("1TB SSD")
                .operatingSystem("Windows 11")
                .build();

        Computer workstation = new Computer.Builder("AMD Ryzen 9", "32GB")
                .graphicsCard("NVIDIA Quadro")
                .storage("2TB HDD + 512GB SSD")
                .operatingSystem("Ubuntu Linux")
                .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Workstation: " + workstation);
    }
}
