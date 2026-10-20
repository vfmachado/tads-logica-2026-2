public class Ex03 {
    /*
     * Acima e abaixo da média
     * Leia um vetor com 10 números reais.
     * 
     * Calcule a média aritmética e apresente separadamente os valores que estão
     * acima dela e os que estão abaixo dela. Informe também quantos valores são
     * exatamente iguais à média
     */
    public static void main(String[] args) {
        float[] v = { 10, 20, 30, 40, 50, 60, 70, 10, 10, 10 };

        String sAbaixo = "";
        String sAcima = "";

        // MEDIA
        float media = 0;
        for (int i = 0; i < v.length; i++) {
            media += v[i];
        }
        media /= v.length;

        int abaixo = 0, acima = 0, iguais = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] < media) {
                abaixo++;
                sAbaixo += v[i] + " ";
            } else if (v[i] > media) {
                acima++;
                sAcima += v[i] + " ";
            } else {
                iguais++;
            }
        }

        System.out.println("MEDIA = " + media);
        System.out.println("abaixo  = " + abaixo);
        System.out.println("VALORES " + sAbaixo);
        System.out.println("acima = " + acima);
        System.out.println("VALORES " + sAcima);
        System.out.println("iguais = " + iguais);
    }
}
