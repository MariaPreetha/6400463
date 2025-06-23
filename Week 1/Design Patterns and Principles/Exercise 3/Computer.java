// File: Computer.java
public class Computer {
    
    private final String cpu;
    private final String ram;

    private final String storage;
    private final String graphicsCard;
    private final String operatingSystem;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    public static class Builder {
        
        private final String cpu;
        private final String ram;

        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder operatingSystem(String os) {
            this.operatingSystem = os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu +
               ", RAM=" + ram +
               ", Storage=" + storage +
               ", GraphicsCard=" + graphicsCard +
               ", OS=" + operatingSystem + "]";
    }
}
