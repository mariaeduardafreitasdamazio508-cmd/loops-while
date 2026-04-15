void main() {
    double resultado = 0;

Scanner sc = new Scanner(System.in);
    IO.println("Qual o valor da compra?");
    double valor = sc.nextDouble();

    IO.print("você tem o vip? ( sim ou nao ) ");
    String resposta = sc.next();
            boolean vip;

    if (resposta.equalsIgnoreCase("sim")){
         vip = true;
    }else if (resposta.equalsIgnoreCase( "nao")){
        vip = false;
    }else {
        IO.println("Resposta invalida");
        return;
    }
    
    if (valor >200 && vip == true) {
        IO.println("o valor original é :"  + valor);
        IO.println("o valor do desconto é : " + valor * 0.2);
        valor -= (valor * 0.2);
        IO.println("o valor final é : " + valor);
    }

    else if (valor > 200 && vip == false){
        valor -= (valor * 0.1);
        IO.println("o valor original é  :" + valor);
        IO.println("o valor do desconto é :" + valor * 0.2);
        valor -= (valor * 0.2);
        IO.println("o valor final é : " + valor);
    }
    else if(valor <= 200 && vip == true){
        valor -= (valor * 0.05);
        IO.println("o valor original é :" +valor);
        IO.println("o valor do desconto é :" + valor * 0.2);
        valor -= (valor * 0.05);
        IO.println("o valor final é :" + valor);
    }else {
        IO.println(valor);
    }


}