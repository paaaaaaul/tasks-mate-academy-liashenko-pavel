package Lesson2.BuilderPattern;

public class Bicycle {
    private String bikeCompany;
    private String bikeType;
    private String bikeSize;

    private boolean hasSuspention;
    private boolean haveMultipleGears;

    public Bicycle(String bikeCompany, String bikeType, String bikeSize, boolean hasSuspention, boolean haveMultipleGears) {

    }

    public Bicycle(BicycleBuilder bicycleBuilder) {
    }

    public String getBikeCompany() {
        return bikeCompany;
    }

    public String getBikeType() {
        return bikeType;
    }

    public String getBikeSize() {
        return bikeSize;
    }

    public boolean isHasSuspention() {
        return hasSuspention;
    }

    public boolean isHaveMultipleGears() {
        return haveMultipleGears;
    }

    public static class BicycleBuilder{
        private String bikeCompany;
        private String bikeType;
        private String bikeSize;

        private boolean hasSuspention;
        private boolean haveMultipleGears;

        public BicycleBuilder(String bikeCompany, String bikeType, String bikeSize) {
            this.bikeCompany = bikeCompany;
            this.bikeType = bikeType;
            this.bikeSize = bikeSize;
        }

        public BicycleBuilder doBikeHaveSuspention(boolean hasSuspention) {
            this.hasSuspention = hasSuspention;
            return this;
        }

        public BicycleBuilder doBikeHaveMultipleGears(boolean haveMultipleGears) {
            this.haveMultipleGears = haveMultipleGears;
            return this;
        }

        public Bicycle build(){
            return new Bicycle(this);
        }
    }
}
