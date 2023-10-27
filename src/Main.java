import java.util.Scanner;

//1.5.6
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] x = new int[3];
//        int n = 0;
//        for(int i=0; i<3; ++i) {
//            x[i] = scanner.nextInt();
//            if(x[i] % 2 == 0) {
//                ++n;
//            }
//        }
//        if (n>=2) {
//            System.out.print("true");
//        }
//        else {
//            System.out.print("false");
//        }
//    }
//}

//1.5.5
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] x = new int[4];
//        for(int i=0; i<4; ++i) {
//            x[i] = scanner.nextInt();
//        }
//        if (x[0] == -1*x[1] || x[0] == -1*x[2] || x[0] == -1* x[3]) {
//            System.out.print("true");
//        } else if (x[1] == -1*x[2] || x[1] == -1*x[3]) {
//            System.out.print("true");
//        } else if (x[2] == -1*x[3]) {
//            System.out.print("true");
//        } else {
//            System.out.print("false");
//        }
//    }
//}

//1.5.4
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        if ((x/100 != 0) && (x/1000 == 0) && (x > 0) && (x%5 == 0)) {
//            System.out.print("true");
//        }
//        else {
//            System.out.print("false");
//        }
//    }
//}

//1.5.3
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        float x = scanner.nextFloat();
//        if ((x>=-2 && x<=3) || (x>=6 && x <=9)) {
//            System.out.print("false");
//        }
//        else {
//            System.out.print("true");
//        }
//    }
//}

//1.5.2
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        float x = scanner.nextFloat();
//        if ((x>=-3 && x<=5) || (x>=9 && x <=15)) {
//            System.out.print("true");
//        }
//        else {
//            System.out.print("false");
//        }
//    }
//}

//1.5.1
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        float x = scanner.nextFloat();
//        if (x>=3 && x<=8) {
//            System.out.print("true");
//        }
//        else {
//            System.out.print("false");
//        }
//    }
//}

//1.4.6
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if ((n & (n - 1)) == 0) { //Если число n - степень двойки, => n and (n-1) = 0.
//            System.out.print(0);
//        }
//        else {
//            System.out.print(1);
//        }
//        System.out.println();
//    }
//}

//1.4.5
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int i = scanner.nextInt();
//        System.out.println(~(~1<<i-1)&a);
//    }
//}

//1.4.4
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int i = scanner.nextInt();
//        System.out.println(1<<i^a);
//    }
//}

//1.4.3
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int i = scanner.nextInt();
//        System.out.println(1<<i|a);
//    }
//}

//1.4.2
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println(1<<a);
//    }
//}

//1.4.1
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int n = scanner.nextInt();
//        int mask = ~((1 <<  n)-1);
//        System.out.println(a&mask);
//    }
//}

//1.2.5
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int h = n%86400/3600;
//        int m = n%3600/60;
//        int s = n%3600%60;
//        System.out.println(h + ":" + (m>=10 ? m : "0"+m) + ":" + (s>=10 ? s : "0"+s));
//    }
//}

//1.2.4
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int n = scanner.nextInt();
//        System.out.println(a*n+b*n/100 + " " + b*n%100);
//    }
//}

//1.2.3
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int input_data = scanner.nextInt();
//        System.out.println(input_data%2==0 ? input_data+2 : input_data+1);
//    }
//}

//1.2.2
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int input_data = scanner.nextInt();
//        System.out.println(input_data % 10 + input_data/10%10 + input_data/100);
//    }
//}

//1.2.1
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int input_data = scanner.nextInt();
//        System.out.println(input_data % 10);
//    }
//}

//1.1
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x1 = scanner.nextInt();
//        int x2 = scanner.nextInt();
//        System.out.println(x1 + x2);
//    }
//}