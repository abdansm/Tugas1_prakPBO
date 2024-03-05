public class Polymorphism {
    
    public static void main(String[] args) {
        Sapi S[] = new Sapi[3];
        S[0] = new Sapi();
        S[1] = new Sapi_pedaging();
        S[2] = new Sapi_perah();
        for (int i = 0; i < 3; i++) {
            System.out.println("sapi " + (i+1) + " memiliki bobot "+ S[i].getbobot() + " kg" );
        }
    System.out.println("\nJumlah pakan yang dibutuhkan masing-masing Sapi yaitu :\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("sapi " + (i+1) + " membutuhkan "+ S[i].jumlah_pakan + " kg/hari" );
        }
    }
    
}
