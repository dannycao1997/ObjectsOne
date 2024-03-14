package object1;

    public class Car {
        private String color;
        private String transmission;
        private int mpg;
        private int mileage;

        public Car(String color, String transmission, int mpg, int mileage) {
            this.color = color;
            this.transmission = transmission;
            this.mpg = mpg;
            this.mileage = mileage;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTransmission() {
            return transmission;
        }

        public void setModel(String transmission) {
            this.transmission = transmission;
        }

        public int getMpg() {
            return mpg;
        }

        public void setYear(int mpg) {
            this.mpg = mpg;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }
    }
