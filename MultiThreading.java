public class MultiThreading {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddSquareThread = new Thread(new OddSquareNumbers());
        Thread evenCubeThread = new Thread(new EvenCubeNumbers());
        Thread multiplesOfTenThread = new Thread(new MultiplesOfTen());

        evenThread.start();
        oddSquareThread.start();
        evenCubeThread.start();
        multiplesOfTenThread.start();
    }
}

class EvenNumbers implements Runnable {
  
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Even Number: " + (i * 2));
        }
    }
}

class OddSquareNumbers implements Runnable {
    
    public void run() {
        for (int i = 1; i <= 20; i++) {
            int oddNumber = (i * 2) - 1;
            System.out.println("Square of Odd Number: " + (oddNumber * oddNumber));
        }
    }
}

class EvenCubeNumbers implements Runnable {
    
    public void run() {
        for (int i = 1; i <= 20; i++) {
            int evenNumber = i * 2;
            System.out.println("Cube of Even Number: " + (evenNumber * evenNumber * evenNumber));
        }
    }
}

class MultiplesOfTen implements Runnable {
    
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Multiple of 10: " + (i * 10));
        }
    }
}


