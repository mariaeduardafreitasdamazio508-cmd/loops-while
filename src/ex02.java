static void main() {
    int num = 1;

    Scanner sc = new Scanner(System.in);


    while (num != 0) {
    IO.println("Digite um numero");

        num = sc.nextInt();
        if (num % 2 == 1) {
            IO.println("Esse número é impar");
        } else {
            IO.println("Este número é par");
        }
    }

}





