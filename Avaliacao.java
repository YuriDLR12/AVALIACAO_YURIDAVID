void main() {

    double consumo;
    double total = 0;
    double media;
    int dias = 0;
    int dia = 1;

    IO.println("Digite o consumo diário de água em litros (0 para encerrar): ");

    while (true) {

        consumo = Double.parseDouble(IO.readln("Digitre o valor do dia "+ dia + " :"));

        if (consumo == 0) {
            break;
        }

        total = total + consumo;
        dias++;
        dia++;
    }

    if (dias == 0) {
        IO.println("Nenhum consumo foi registado.");

    } else {

        media = total / dias;

        IO.println("Consumo total: " + total + " litros");
        IO.println("Dias registados: " + dias);
        IO.println("Média diária: " + media + " litros");


        if (media < 100) {
            IO.println("Classificação: Consumo Sustentável");

        } else if (media <= 175) {
            IO.println("Classificação: Consumo Moderado");

        } else {
            IO.println("Classificação: Consumo Excessivo");
        }
    }
}