package Collection_Framework.experiment;

import org.graalvm.collections.Pair;

public class PointPair {
    private Pair<Point, Point> pair = null;

    public PointPair(Point p1, Point p2) {
        pair = Pair.create(p1, p2);
    }

    @Override
    public String toString() {
        return String.format("[%s , %s]", pair.getLeft(), pair.getRight());
    }

    public Double distance() {
        return pair.getLeft().distance(pair.getRight());
    }

}
