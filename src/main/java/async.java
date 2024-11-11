public class async {
    public static int q1(int n) {
        if (n <= 1) {
            return n;
        }
        return n + q1(n - 1);
    }

    public static int q2(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * q2(n - 1);
    }

    public static int q3(int n) {
        if (n <= 1) {
            return n;
        }
        if (n % 2 == 0) {
            return q3(n - 1);
        }
        return n * q3(n - 2);
    }

    public static int q4(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + q4(n / 10);
    }

    public static int q5(int n, int m) {
        if (n < m) {
            return 0;
        }
        return 1 + q5(n - m, m);
    }

    public static int q6(int n, int m) {
        if (n < m) {
            return n;
        }
        return q6(n - m, m);
    }

    public static boolean q7(int x, int y) {
        if (x < y) {
            return false;
        }
        if (x == y) {
            return true;
        }
        return q7(x - y, y);
    }

    //q8new- d has to be 2 at first:
    public static boolean q8new(int n, int d) {

        if (n < 2) {
            return false;
        }
        if (n % d == 0) {
            return false;
        }
        if (d * d > n) {
            return true;
        }
        return q8(n, d + 1);
    }


    public static boolean q9(int n) {
        if (n < 10) {
            return true;
        }
        int lastDigit = n % 10;
        int nextLastDigit = (n / 10) % 10;
        if ((lastDigit % 2) != (nextLastDigit % 2)) {
            return false;
        }
        return q9(n / 10);
    }

    public static int q14(int[] a, int i) {
        if (i == 0) {
            return a[i];
        }
        return a[i] + q14(a, i - 1);
    }

    public static int q15(int[] a, int i) {
        if (i == 0) {
            if (a[i] >= 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (a[i] >= 0) {
            return q15(a, i - 1) + 1;
        }
        return q15(a, i - 1);
    }

    public static int q16(int[] a, int num, int i) {
        if (a[i] == num) {
            return i;
        }
        if (a[i] != num && i == a.length - 1) {
            return -1;
        }

        return q16(a, num, i + 1);
    }

    public static boolean q17(int[] a, int i) {
        if (i == a.length - 1) {
            return true;
        }
        if (a[i + 1] < a[i]) {
            return false;
        }
        return q17(a, i + 1);
    }

    public static boolean q8(int n, int d) {

        if (n < 2) {
            return false;
        }
        if (n % d == 0) {
            return false;
        }
        if (d * d > n) {
            return true;
        }
        return q8(n, d + 1);
    }

    public static boolean q18(int[] a, int i) {
        if (i == a.length) {
            return true;
        }

        if (q8(a[i], 2) == true) {
            return false;
        }
        return q18(a, i + 1);
    }

    public static int q19(int[][] a, int num, int i, int j) {
        if (i < 0) {
            return 0;
        }
        if (j < a[i].length) {
            if (a[i][j] == num) {
                return q19(a, num, i - 1, 0) + 1;
            }
            return q19(a, num, i, j + 1);
        }
        return q19(a, num, i - 1, 0);


    }

    public static int random_q20(int[] a) {
        return (int) (Math.random() * a.length);
    }

    public static boolean q20(int[] a) {
        int i1 = random_q20(a);
        int i2 = random_q20(a);
        int start;
        int end;

        while (i1 == i2) {
            i2 = random_q20(a);
        }

        if (i1 > i2) {
            end = i1;
            start = i2;
        } else {
            end = i2;
            start = i1;

        }
        return q_20helper(a, start, end);
    }

    public static boolean q_20helper(int[] a, int i, int end) {
        if (i > end) {
            return true;
        }
        if (!q_20pali(a[i])) {
            return false;
        }
        return q_20helper(a, i + 1, end);
    }

    public static boolean q_20pali(int num) {
        int realnum = num;
        int reverse = 0;
        while (num > 0) {
            int d = num % 10;
            reverse = reverse * 10 + d;
            num = num / 10;
        }
        if (realnum == reverse) {
            return true;
        }
        return false;
    }

    public static int fibonachi(int num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }

        return fibonachi(num - 1) + fibonachi(num - 2);


    }

    public static boolean digIsEvenOrOdd(int n) {

        if (n < 10) {
            return true;
        }
        if ((n % 10) % 2 != (n / 10 % 10) % 2) {
            return false;
        }
        return digIsEvenOrOdd(n / 10);
    }


    public static int sidra_riboit(int num) { //13 pg 26
        if (num==1) {
            return 0;
        }
        if (num==2) {
            return 1;
        }
        return sidra_riboit(num - 1) * sidra_riboit(num - 1) + sidra_riboit(num - 2) * sidra_riboit(num - 2);
    }

    public static int sidra_riboitB(int num)
    {
        if(num==1)
        {
            return 0;
        }
        return sidra_riboit(num)+sidra_riboitB(num-1);


    }

    public static void sidra_hefresh(int a1, int d, int n) { //28 pg 28
        if (n == 0) {
            return;
        }
        System.out.println(a1);
        sidra_hefresh(a1 + d, d, n - 1);
    }

    public static int hezka(int x, int y) //x**y
    {
        if (y == 0) {
            return 1;
        }
        return x * hezka(x, y - 1);
    }

    public static void kefel(int x, int y) //27 pg 28
    {
        if (y > 10) {
            return;
        }
        System.out.print(x * y + " ");
        if (x == 10) {
            System.out.println();
            kefel(1, y + 1);
        } else {
            kefel(x + 1, y);
        }
    }

    public static int kfila(int num1, int num2) //pg12
    {
        if (num2 == 0 || num1 == 0) {
            return 0;
        }
        return kfila(num1, num2 - 1) + num1;
    }

    public static int maxArr(int i, int[] a) //pg 22
    {
        if (i == 0) {
            return a[i];
        }
        if (a[i] > maxArr(i - 1, a)) {
            return a[i];
        }
        return maxArr(i - 1, a);

    }


    public static int sumDigits(int n) { //q42 pg 32
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n / 10;
            n /= 10;
        }

        return sumDigits(sum);
    }

    public static void even_i(int[] a, int i) //31 pg 28
    {
        if (i == a.length) {
            return;
        }
        if (i % 2 == 0) {
            System.out.println(a[i]);
        }
        even_i(a, i + 1);
    }

    public static void smaller(int[] a, int i) //32 pg 28
    {
        if (i == a.length - 1) {
            return;
        }
        if (a[i] < a[i + 1]) {
            System.out.println(a[i]);
        }
        smaller(a, i + 1);
    }


    //פעולה המקבלת מספר שלם וכל מספר זוגי בריבוע ואי זוגי מכפילה בשתיים
    public static int exe10(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return n * n + exe10(n - 1);
        }
        return n * 2 + exe10(n - 1);
    }
    public static int exe12(int n1, int n2, int x) {
        if (x >= n2) {
            return 0;
        }
        if (n1 % x == 0) {
            return x + exe12(n1, n2, x + 1);
        }
        return exe12(n1, n2, x + 1);
    }


    public static int exe21(String s, int i) {
        if (i == s.length()) {
            return 0;
        }
        if (Character.isLowerCase(s.charAt(i))) {
            return 1 + exe21(s, i + 1);
        }
        return exe21(s, i + 1);
    }


    public static String exe23(String s, int i) {
        if (i == -1) {
            return "";
        }
        return s.charAt(i) + exe23(s, i - 1);
    }

    public static void exe25(int n1, int x) {
        if (x == n1) {
            return;
        }

    }
    public static double exe11(int n, int cur, double sum) {
        if (cur>n) {
            return sum;
        }
        double a;
        if (cur%2==1) {
            a=1+((cur-1)/2)*4;
        }
        else {
            a=-Math.sqrt(3+((cur/2)-1)*4);
        }

        return exe11(n,cur+1,sum+a);
    }
    public static String exe22(String str) {
        if (str.length()<=3) {
            return str;
        }
        return str.substring(0, 3)+'*'+exe22(str.substring(3));
    }

    public static int numInArr(int[] arr, int num, int i) {
        if (i==arr.length) {
            return 0;
        }

        if (arr[i]==num) {
            return 1+numInArr(arr,num,i+1);
        }
        return numInArr(arr,num,i+1);
    }
    public static boolean numAccending(int n) {
        if (n<10) {
            return true;
        }
        if (n%10<n/10%10) {
            return false;
        }
        return numAccending(n/10);
    }
}