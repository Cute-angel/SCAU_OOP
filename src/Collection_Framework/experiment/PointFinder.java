package Collection_Framework.experiment;

import org.graalvm.collections.Pair;

import java.util.HashSet;
import java.util.Scanner;

public class PointFinder {
    public HashSet<Point> set = new HashSet<>();

    public void addPoint(Point p) {
        set.add(p);
    }

    public PointFinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("需要输入的坐标个数: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("第%d个横坐标和纵坐标(x y): ", i + 1);
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            Point p = new Point(x, y);
            addPoint(p);
        }
    }


    public void traverse() {
        int count = set.size();
        System.out.printf("实际共有%d个点\n[", count);
        for (Point p : set) {
            System.out.print(p + ",");
        }
        System.out.println("]");
    }

    public PointPair findClosedPair() {
        Point[] points = set.toArray(new Point[0]);
        PointPair minPair = new PointPair(points[0], new Point(Double.MAX_VALUE, Double.MAX_VALUE));

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                PointPair currentPair = new PointPair(points[i], points[j]);
                if (currentPair.distance() < minPair.distance()) {
                    minPair = currentPair;
                }
            }

        }
        return minPair;
    }

    public PointPair findFarthestPair() {
        Point[] points = set.toArray(new Point[0]);
        PointPair maxPair = new PointPair(points[0], points[0]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                PointPair currentPair = new PointPair(points[i], points[j]);
                if (currentPair.distance() > maxPair.distance()) {
                    maxPair = currentPair;
                }
            }

        }
        return maxPair;
    }

    public void run() {
        traverse();
        PointPair closedPair = findClosedPair();
        System.out.printf("距离最近: %s, 距离是: %.2f\n", closedPair, closedPair.distance());

        PointPair farthestPair = findFarthestPair();
        System.out.printf("距离最远: %s, 距离是: %.2f\n", farthestPair, farthestPair.distance());
    }
}