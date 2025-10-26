package Objects_and_Classes.experiment;

import Objects_and_Classes.experiment.data.Fan;
import Objects_and_Classes.experiment.data.Stock;
import Objects_and_Classes.experiment.data.StopWatch;
import Objects_and_Classes.experiment.exp.ArithmeticExpression;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        //run_task_stock(scanner);
        //run_tasK_fan(scanner);
        //run_task_arithmetic_expression(scanner);
        run_task_stop_watch();

    }

    private static void run_task_stock(Scanner scanner) {
        System.out.print("输入股票代码: ");
        String symbol = scanner.nextLine();
        System.out.print("输入股票名称: ");
        String name = scanner.nextLine();
        System.out.print("输入股票昨日收盘价: ");
        double previousClosingPrice = scanner.nextDouble();
        System.out.print("输入股票当前价格: ");
        double currectPrice = scanner.nextDouble();

        Stock stock = new Stock(symbol,
                name,
                previousClosingPrice,
                currectPrice
        );

        System.out.println("股票代码: " + stock.getSymbol());
        System.out.println("股票名称: " + stock.getName());
        System.out.printf("股票昨日收盘价: %.2f\n", stock.getPreviousClosingPrice());
        System.out.printf("股票当前价格: %.2f\n", stock.getCurrectPrice());
        System.out.printf("股票涨跌幅: %.2f", stock.getChangePercent() * 100);
        System.out.println("%");
    }

    private static void run_tasK_fan(Scanner scanner) {
        System.out.print("输入品牌: ");
        String brand = scanner.nextLine();

        Fan fan = new Fan(brand);
        System.out.println(fan);

        fan.setOn(true);
        System.out.println(fan);

        fan.setSpeed(Fan.FAST);
        System.out.println(fan);
    }

    private static void run_task_arithmetic_expression(Scanner scanner) {
        String expr = scanner.nextLine();
        ArithmeticExpression arithmeticExpression = new ArithmeticExpression(expr);
        System.out.println(arithmeticExpression.getResult());
    }

    private static void run_task_stop_watch() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        long i = 100000000L;
        long j = i;
        while (j-- > 0) {

        }
        //Thread.sleep(1000);
        stopWatch.end();
        System.out.println("循环" + i + "次, 执行了:"+stopWatch.getElapsedTime() + " 毫秒");
        stopWatch.start();
        i = 100000000000L;
        j = i;
        while (j-- > 0) {

        }
        stopWatch.end();
        System.out.println("循环" + i + "次, 执行了:"+stopWatch.getElapsedTime() + " 毫秒");
    }
}
