import java.lang.Math;

public class Feeder {
  private int currentFood = 9000;

  public void simulateOneDay(int Numbirds) {
    int bearEatOrNot = (int) (Math.random() * 100);

    if (bearEatOrNot <= 5) {
      currentFood = 0;
    } else {
      currentFood = currentFood - (Numbirds * ((int) (Math.random() * (50 - 10)) + 10));
    }

  }

  public int simulateManyDays(int numBirds, int numDays) {
    int i = 0;
    while (i < numDays) {
      simulateOneDay(numBirds);
      i = i + 1;
    }

    if (currentFood > 0) {
      System.out.print(currentFood);
      return currentFood;
    } 
    else {
      System.out.print(0);
      return 0;
    }

  }

}
