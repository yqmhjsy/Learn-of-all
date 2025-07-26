import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        // 生成1-100之间的随机数
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        
        System.out.println("欢迎来到猜数字游戏！");
        System.out.println("我已经想好了一个1到100之间的数字，你来猜猜看吧～");
        
        // 循环猜数字，直到猜对为止
        while (guess != targetNumber) {
            System.out.print("请输入你猜的数字：");
            guess = scanner.nextInt();
            attempts++;  // 记录猜测次数
            
            // 给出提示
            if (guess > targetNumber) {
                System.out.println("猜大了！再试试～");
            } else if (guess < targetNumber) {
                System.out.println("猜小了！再试试～");
            } else {
                System.out.println("恭喜你猜对了！答案就是" + targetNumber);
                System.out.println("你一共猜了" + attempts + "次");
            }
        }
        scanner.close();
    }
}
