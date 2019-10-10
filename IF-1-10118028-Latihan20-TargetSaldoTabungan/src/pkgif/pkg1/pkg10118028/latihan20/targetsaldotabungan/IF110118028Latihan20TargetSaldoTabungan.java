/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan20.targetsaldotabungan;
    import java.text.DecimalFormat;
    import java.text.DecimalFormatSymbols;
/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Target Saldo Tabungan
 */
public class IF110118028Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo = 3500000;
        double bunga;
        
        //pembuat format rupiah
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        //perhitungan
        for (int i = 1;i<=12;i++){
            bunga = saldo * 0.08;
            saldo += bunga;
            if(saldo <= 6500000){
                System.out.printf("Saldo di bulan ke - " + i + " %s%n",rupiah.format(saldo) );
            }
            
        }
    }
    
}
