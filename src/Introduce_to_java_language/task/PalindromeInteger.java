package Introduce_to_java_language.task;

import utls.CourseTask;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeInteger implements CourseTask {
    int num;
    int _num;
    ArrayList<Integer> lt = new ArrayList<>();

    public PalindromeInteger(Scanner sc){
        this.num = sc.nextInt();
        this._num = this.num;
        if (this.num < 0){
            System.out.println("不正确的输入");
        }
        while ( this.num > 0) {
            lt.add(this.num % 10);
            this.num /= 10;
        }

    }

    @Override
    public void solve() {
        for (int i =  0; i < lt.size() / 2; i++) {
            if (!lt.get(i).equals(lt.get(lt.size() - 1 - i))) {
                System.out.println(this._num +  "不是回文数");
                return;
            }

        }
        System.out.println(this._num +  "是回文数");
    }
}
